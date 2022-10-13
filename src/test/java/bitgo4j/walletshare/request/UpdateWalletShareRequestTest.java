package bitgo4j.walletshare.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateWalletShareRequestTest {
  UpdateWalletShareRequest updateWalletShareRequest = new UpdateWalletShareRequest();

  @Test
  void testToString() {
    String result = updateWalletShareRequest.toString();
    Assertions.assertEquals("UpdateWalletShareRequest[state=<null>]", result);
  }

  @Test
  void testSetState() {
    updateWalletShareRequest.setState("state");
  }
}
