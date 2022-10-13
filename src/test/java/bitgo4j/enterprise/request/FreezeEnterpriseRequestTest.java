package bitgo4j.enterprise.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezeEnterpriseRequestTest {
  FreezeEnterpriseRequest freezeEnterpriseRequest = new FreezeEnterpriseRequest(0);

  @Test
  void testToString() {
    String result = freezeEnterpriseRequest.toString();
    Assertions.assertEquals("FreezeEnterpriseRequest[duration=0]", result);
  }

  @Test
  void testSetDuration() {
    freezeEnterpriseRequest.setDuration(0);
  }
}
