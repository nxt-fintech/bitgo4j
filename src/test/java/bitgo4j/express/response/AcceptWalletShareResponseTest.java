package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptWalletShareResponseTest {
  AcceptWalletShareResponse acceptWalletShareResponse = new AcceptWalletShareResponse();

  @Test
  void testToString() {
    String result = acceptWalletShareResponse.toString();
    String expected = "AcceptWalletShareResponse[state=<null>,changed=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetState() {
    acceptWalletShareResponse.setState("state");
  }

  @Test
  void testSetChanged() {
    acceptWalletShareResponse.setChanged(Boolean.TRUE);
  }
}
