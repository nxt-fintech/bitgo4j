package bitgo4j.enterprise.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezeEnterpriseResponseTest {
  FreezeEnterpriseResponse freezeEnterpriseResponse = new FreezeEnterpriseResponse();

  @Test
  void testToString() {
    String result = freezeEnterpriseResponse.toString();
    Assertions.assertEquals("FreezeEnterpriseResponse[time=<null>,expires=<null>]", result);
  }

  @Test
  void testSetTime() {
    freezeEnterpriseResponse.setTime("time");
  }

  @Test
  void testSetExpires() {
    freezeEnterpriseResponse.setExpires("expires");
  }
}
