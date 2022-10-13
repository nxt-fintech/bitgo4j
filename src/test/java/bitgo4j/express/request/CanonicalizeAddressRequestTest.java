package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CanonicalizeAddressRequestTest {
  CanonicalizeAddressRequest canonicalizeAddressRequest =
      new CanonicalizeAddressRequest("address", "version");

  @Test
  void testToString() {
    String result = canonicalizeAddressRequest.toString();
    String expected = "CanonicalizeAddressRequest[address=address,version=version]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    canonicalizeAddressRequest.setAddress("address");
  }

  @Test
  void testSetVersion() {
    canonicalizeAddressRequest.setVersion("version");
  }
}
