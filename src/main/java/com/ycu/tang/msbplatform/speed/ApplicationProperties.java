package com.ycu.tang.msbplatform.speed;

import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationProperties {
  private final Properties properties;
  private static final Logger logger = LoggerFactory.getLogger(ApplicationProperties.class);

  ApplicationProperties() {
    properties = new Properties();
    try {
      properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));

    } catch (IOException ioex) {
      logger.error("IOException Occured while loading properties file::::" +ioex.getMessage());
    }
  }

  public String readProperty(String keyName) {
    logger.debug("Reading Property " + keyName);
    return properties.getProperty(keyName, "There is no key in the properties file");
  }
}
