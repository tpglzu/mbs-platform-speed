package com.ycu.tang.msbplatform.speed.topology;

import com.ycu.tang.msbplatform.speed.Properties;
import com.ycu.tang.msbplatform.speed.bolt.ExtractFilterBolt;
import com.ycu.tang.msbplatform.speed.bolt.UpdateMongoBolt;
import com.ycu.tang.msbplatform.speed.deserializer.PageviewDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.kafka.spout.ByTopicRecordTranslator;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import static org.apache.storm.kafka.spout.FirstPollOffsetStrategy.EARLIEST;

public class UniqueViewTopology {
  private static final String TOPIC_0_1_STREAM = "test_0_1_stream";

  protected Properties properties = Properties.getInstance();

  public StormTopology create(){
    TopologyBuilder builder = new TopologyBuilder();

    ByTopicRecordTranslator<String, String> trans = new ByTopicRecordTranslator<>(
            (r) -> new Values(r.topic(), r.partition(), r.offset(), r.key(), r.value()),
            new Fields("topic", "partition", "offset", "key", "value"), TOPIC_0_1_STREAM);

    KafkaSpoutConfig.Builder configBuilder = KafkaSpoutConfig.builder(properties.getKafkaUrl(), properties.getKafkaTopicPageviews());
    configBuilder
            .setProp(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, PageviewDeserializer.class)
            .setRecordTranslator(trans)
            .setFirstPollOffsetStrategy(EARLIEST);

    builder.setSpout("pageviews",
            new KafkaSpout(configBuilder.build()), 2);
    builder.setBolt("extract-filter",
            new ExtractFilterBolt(), 4)
            .shuffleGrouping("pageviews", TOPIC_0_1_STREAM);
    builder.setBolt("mongodb0",
            new UpdateMongoBolt(properties.getDbUrl(), properties.getDbColUniqueView()+"_0"), 4)
            .fieldsGrouping("extract-filter",
                    new Fields("domain"));
    builder.setBolt("mongodb1",
            new UpdateMongoBolt(properties.getDbUrl(), properties.getDbColUniqueView()+"_1"), 4)
            .fieldsGrouping("extract-filter",
                    new Fields("domain"));
    return builder.createTopology();
  }

  protected void runMain(String[] args) throws Exception {
    Config conf = new Config();
    conf.setNumWorkers(20);
    conf.setMaxSpoutPending(5000);
    conf.setFallBackOnJavaSerialization(true);
    StormSubmitter.submitTopology("mytopology", conf, create());
  }

  public static void main(String[] args) throws Exception {
    new UniqueViewTopology().runMain(args);
  }

}
