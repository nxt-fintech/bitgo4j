package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VerifyAddressRequestTest {
  VerifyAddressRequest verifyAddressRequest = new VerifyAddressRequest("address");

  @Test
  void testToString() {
    String result = verifyAddressRequest.toString();
    String expected = "VerifyAddressRequest[address=address]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    verifyAddressRequest.setAddress("address");
  }
}
