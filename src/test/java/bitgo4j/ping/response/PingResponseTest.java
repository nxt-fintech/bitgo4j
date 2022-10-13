package bitgo4j.ping.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PingResponseTest {
  PingResponse pingResponse = new PingResponse();

  @Test
  void testToString() {
    String result = pingResponse.toString();
    String expected =
        "PingResponse[status=<null>,environment=<null>,configEnv=<null>,configVersion=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetStatus() {
    pingResponse.setStatus("status");
  }

  @Test
  void testSetEnvironment() {
    pingResponse.setEnvironment("environment");
  }

  @Test
  void testSetConfigEnv() {
    pingResponse.setConfigEnv("configEnv");
  }

  @Test
  void testSetConfigVersion() {
    pingResponse.setConfigVersion(0);
  }
}
