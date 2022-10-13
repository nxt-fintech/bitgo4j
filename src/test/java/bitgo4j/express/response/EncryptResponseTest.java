package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class EncryptResponseTest {
    EncryptResponse encryptResponse= new EncryptResponse();

  @Test
  void testToString() {
    String result = encryptResponse.toString();
    String expected = "EncryptResponse[encrypted=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetEncrypted() {
        encryptResponse.setEncrypted("encrypted");
    }
}