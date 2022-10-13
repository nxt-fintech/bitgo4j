package bitgo4j.walletshare.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CancelWalletShareResponseTest {
  CancelWalletShareResponse cancelWalletShareResponse = new CancelWalletShareResponse();

  @Test
  void testToString() {
    String result = cancelWalletShareResponse.toString();
    Assertions.assertEquals("CancelWalletShareResponse[state=<null>,changed=<null>]", result);
  }

  @Test
  void testSetState() {
    cancelWalletShareResponse.setState("state");
  }

  @Test
  void testSetChanged() {
    cancelWalletShareResponse.setChanged(Boolean.TRUE);
  }
}
