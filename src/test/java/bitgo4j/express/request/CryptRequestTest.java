package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CryptRequestTest {
  CryptRequest cryptRequest = new CryptRequest("input", "password");

  @Test
  void testToString() {
    String result = cryptRequest.toString();
    String expected = "CryptRequest[input=input,password=password]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetInput() {
    cryptRequest.setInput("input");
  }

  @Test
  void testSetPassword() {
    cryptRequest.setPassword("password");
  }
}
