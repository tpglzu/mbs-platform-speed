package com.ycu.tang.msbplatform.speed;

public class Properties {

  private static Properties instance = null;
  ApplicationProperties ap;

  private Properties(){
    ap = new ApplicationProperties();
  }

  public static Properties getInstance() {
    if(instance == null) {
      instance = new Properties();
    }
    return instance;
  }



  public String getKafkaUrl() {
    return ap.readProperty("kafka.url");
  }

  public String getKafkaTopicPageviews() {
    return ap.readProperty("kafka.topic.pageviews");
  }

  public String getDbHost() {
    return ap.readProperty("mongodb.host");
  }

  public Integer getDbPort() {
    return Integer.parseInt(ap.readProperty("mongodb.port"));
  }

  public String getDbName() {
    return ap.readProperty("mongodb.database");
  }

  public String getDbColUniqueView() {
    return ap.readProperty("mongodb.collection.unique-view");
  }

  public String getDbUrl(){
    return String.format("mongodb://%s:%d/%s", getDbHost(), getDbPort(), getDbName());
  }
}
