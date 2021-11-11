package com.ycu.tang.msbplatform.speed.bolt;

import com.ycu.tang.msbplatform.speed.deserializer.PageviewDeserializer;
import com.ycu.tang.msbplatform.speed.thrift.PersonID;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ExtractFilterBolt extends BaseBasicBolt {
  public static final Logger LOG = LoggerFactory.getLogger(ExtractFilterBolt.class);
  private static final int HOUR_SECS = 60 * 60;

  @Override
  public void execute(Tuple tuple, BasicOutputCollector collector) {
    LOG.info("Good Luck. ===========================================================");
    LOG.info("Good Luck. " + tuple.toString());
    Values values = (Values) ((List) tuple.getValueByField("value")).get(0);
    PersonID user = (PersonID) values.get(0);
    String url = (String) values.get(1);
    int timestamp = (Integer) values.get(2);

    LOG.info("execute 1. ");

    try {
      LOG.info("execute 2. ");
      String domain = new URL(url).getAuthority();
      LOG.info("execute 3. ");
      collector.emit(new Values(
              domain,
              url,
              timestamp / HOUR_SECS,
              user));
    } catch (MalformedURLException e) {
      LOG.info("execute error. " + e);
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(new Fields("domain", "url", "bucket", "user"));
  }
}
