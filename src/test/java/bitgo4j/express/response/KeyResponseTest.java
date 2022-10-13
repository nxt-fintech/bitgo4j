package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeyResponseTest {
  KeyResponse keyResponse = new KeyResponse();

  @Test
  void testToString() {
    String result = keyResponse.toString();
    String expected = "KeyResponse[prv=<null>,pub=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetPrv() {
    keyResponse.setPrv("prv");
  }

  @Test
  void testSetPub() {
    keyResponse.setPub("pub");
  }
}
