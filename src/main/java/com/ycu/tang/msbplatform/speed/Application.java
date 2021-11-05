package com.ycu.tang.msbplatform.speed;

import com.ycu.tang.msbplatform.speed.thrift.Data;
import com.ycu.tang.msbplatform.speed.topology.UniqueViewTopology;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.storm.Config;
import org.apache.storm.ILocalCluster;
import org.apache.storm.LocalCluster;
import org.apache.thrift.TSerializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.ycu.tang.msbplatform.speed.test.Data.makePageview;

public class Application {

  public static void initTestData() throws Exception {
    List<Data> data = new ArrayList();
    data.add(makePageview(1, "http://foo.com/post1", 60));
    data.add(makePageview(2, "http://foo.com/post1", 60));
    data.add(makePageview(3, "http://foo.com/post1", 62));
    data.add(makePageview(2, "http://foo.com/post3", 62));
    data.add(makePageview(1, "http://foo.com/post1", 4000));
    data.add(makePageview(1, "http://foo.com/post2", 4000));
    data.add(makePageview(1, "http://foo.com/post2", 10000));
    data.add(makePageview(5, "http://foo.com/post3", 10600));

    Properties props = new Properties();

    //Assign localhost id
    props.put("bootstrap.servers", "localhost:9092");

    //Set acknowledgements for producer requests.
    props.put("acks", "all");

    //If the request fails, the producer can automatically retry,
    props.put("retries", 0);

    //Specify buffer size in config
    props.put("batch.size", 16384);

    //Reduce the no of requests less than 0
    props.put("linger.ms", 1);

    //The buffer.memory controls the total amount of memory available to the producer for buffering.
    props.put("buffer.memory", 33554432);

    props.put("key.serializer",
            "org.apache.kafka.common.serialization.StringSerializer");

    props.put("value.serializer",
            "org.apache.kafka.common.serialization.ByteArraySerializer");

    Producer<String, String> producer = new KafkaProducer<String, String>(props);

    TSerializer ser = new TSerializer();

    for (Data d : data) {
      producer.send(new ProducerRecord("pageviews", ser.serialize(d)));
    }

    producer.close();
  }


  public static ILocalCluster runUniqueViewTopology() throws Exception {

    LocalCluster cluster = new LocalCluster();
    Config conf = new Config();
    cluster.submitTopology("uniques", conf, new UniqueViewTopology().create());

    return cluster;
  }


  public static void main(String[] args) throws Exception {
//    initTestData();
    runUniqueViewTopology();
  }
}