package com.ycu.tang.msbplatform.speed.deserializer;

import com.ycu.tang.msbplatform.speed.thrift.Data;
import com.ycu.tang.msbplatform.speed.thrift.PageViewEdge;
import com.ycu.tang.msbplatform.speed.thrift.PersonID;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.storm.tuple.Values;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageviewDeserializer implements Deserializer {
  TDeserializer _des;

  @Override
  public void configure(Map map, boolean b) {

  }

  @Override
  public Object deserialize(String s, byte[] bytes) {
    Data data = new Data();
    try {
      if (_des == null) _des = new TDeserializer();
      _des.deserialize(data, bytes);
    } catch (TException e) {
      throw new RuntimeException(e);
    }
    PageViewEdge pageview = data.getDataunit().getPage_view();
    String url = pageview.getPage().getUrl();
    PersonID user = pageview.getPerson();
    List ret = new ArrayList();
    ret.add(new Values(user,
            url,
            data.getPedigree()
                    .getTrue_as_of_secs()));
    return ret;
  }

  @Override
  public void close() {

  }
}
