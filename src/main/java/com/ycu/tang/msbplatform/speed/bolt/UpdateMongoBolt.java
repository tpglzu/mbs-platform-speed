package com.ycu.tang.msbplatform.speed.bolt;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import com.ycu.tang.msbplatform.speed.thrift.PersonID;
import org.apache.storm.mongodb.bolt.AbstractMongoBolt;
import org.apache.storm.mongodb.common.QueryFilterCreator;
import org.apache.storm.mongodb.common.SimpleQueryFilterCreator;
import org.apache.storm.mongodb.common.mapper.MongoUpdateMapper;
import org.apache.storm.mongodb.common.mapper.SimpleMongoUpdateMapper;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.TupleUtils;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.Binary;

public class UpdateMongoBolt extends AbstractMongoBolt {

  private QueryFilterCreator queryCreator;
  private MongoUpdateMapper mapper;

  public UpdateMongoBolt(String url, String collectionName) {
    super(url, collectionName);
    mapper = new SimpleMongoUpdateMapper();
    queryCreator = new SimpleQueryFilterCreator();
  }

  @Override
  public void execute(Tuple tuple) {

    if (!TupleUtils.isTick(tuple)) {
      try {
        String url = tuple.getString(1);
        int bucket = tuple.getInteger(2);
        PersonID user = (PersonID) tuple.getValue(3);

        Bson filter = this.queryCreator.createFilterByKeys(new Values(url, bucket));
        Document oldDoc = this.mongoClient.find(filter);

        HyperLogLog hll;
        if (oldDoc == null) {
          hll = new HyperLogLog(14);
        } else {
          hll = HyperLogLog.Builder.build(((Binary) oldDoc.get("hll")).getData());
        }
        hll.offer(user);

        Document newDoc = this.mapper.toDocument(tuple);
        newDoc.put("hll", hll.getBytes());
        newDoc.put("value", hll.cardinality());
        newDoc.put("url", url);
        newDoc.put("bucket", bucket);
        newDoc.put("granularity", "d");

        this.mongoClient.update(filter, new Document("$set", newDoc), true, false);
        this.collector.ack(tuple);
      } catch (Exception var4) {
        this.collector.reportError(var4);
        this.collector.fail(tuple);
      }
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

  }
}
