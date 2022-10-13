package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VerifyAddressResponseTest {
  VerifyAddressResponse verifyAddressResponse = new VerifyAddressResponse();

  @Test
  void testToString() {
    String result = verifyAddressResponse.toString();
    String expected = "VerifyAddressResponse[isValid=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetIsValid() {
    verifyAddressResponse.setIsValid(Boolean.TRUE);
  }
}
