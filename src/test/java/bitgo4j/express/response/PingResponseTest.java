package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PingResponseTest {
  PingResponse pingResponse = new PingResponse();

  @Test
  void testToString() {
    String result = pingResponse.toString();
    String expected = "PingResponse[status=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetStatus() {
    pingResponse.setStatus("status");
  }
}
