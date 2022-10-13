package bitgo4j.walletshare.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RejectWalletShareRequestTest {
  RejectWalletShareRequest rejectWalletShareRequest = new RejectWalletShareRequest();

  @Test
  void testToString() {
    String result = rejectWalletShareRequest.toString();
    Assertions.assertEquals("RejectWalletShareRequest[userId=<null>]", result);
  }

  @Test
  void testSetUserId() {
    rejectWalletShareRequest.setUserId("userId");
  }
}
