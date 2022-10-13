package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecryptResponseTest {
  DecryptResponse decryptResponse = new DecryptResponse();

  @Test
  void testToString() {
    String result = decryptResponse.toString();
    String expected = "DecryptResponse[decrypted=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetDecrypted() {
    decryptResponse.setDecrypted("decrypted");
  }
}
