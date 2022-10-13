package bitgo4j.walletshare.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResendWalletShareResponseTest {
  ResendWalletShareEmailResponse resendWalletShareResponse = new ResendWalletShareEmailResponse();

  @Test
  void testToString() {
    String result = resendWalletShareResponse.toString();
    Assertions.assertEquals("ResendWalletShareEmailResponse[resent=<null>]", result);
  }

  @Test
  void testSetResent() {
    resendWalletShareResponse.setResent(Boolean.TRUE);
  }
}
