package bitgo4j.walletshare.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateWalletShareResponseTest {
  UpdateWalletShareResponse updateWalletShareResponse = new UpdateWalletShareResponse();

  @Test
  void testToString() {
    String result = updateWalletShareResponse.toString();
    Assertions.assertEquals("UpdateWalletShareResponse[state=<null>,changed=<null>]", result);
  }

  @Test
  void testSetState() {
    updateWalletShareResponse.setState("state");
  }

  @Test
  void testSetChanged() {
    updateWalletShareResponse.setChanged(Boolean.TRUE);
  }
}
