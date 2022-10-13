package bitgo4j.address.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DataTest {
  Data data = new Data("script");

  @Test
  void testToString() {
    String result = data.toString();
    Assertions.assertEquals("Data[script=script]", result);
  }

  @Test
  void testSetScript() {
    data.setScript("script");
  }
}
