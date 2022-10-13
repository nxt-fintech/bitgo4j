package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CanonicalizeAddressResponseTest {
  CanonicalizeAddressResponse canonicalizeAddressResponse = new CanonicalizeAddressResponse();

  @Test
  void testToString() {
    String result = canonicalizeAddressResponse.toString();
    String expected = "CanonicalizeAddressResponse[address=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    canonicalizeAddressResponse.setAddress("address");
  }
}
