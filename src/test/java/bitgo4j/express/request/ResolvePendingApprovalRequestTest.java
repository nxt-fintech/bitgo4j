package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResolvePendingApprovalRequestTest {
  ResolvePendingApprovalRequest resolvePendingApprovalRequest =
      new ResolvePendingApprovalRequest("state", "walletPassphrase", "xprv", "otp");

  @Test
  void testToString() {
    String result = resolvePendingApprovalRequest.toString();
    String expected =
        "ResolvePendingApprovalRequest[state=state,walletPassphrase=walletPassphrase,xprv=xprv,otp=otp]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetState() {
    resolvePendingApprovalRequest.setState("state");
  }

  @Test
  void testSetWalletPassphrase() {
    resolvePendingApprovalRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetXprv() {
    resolvePendingApprovalRequest.setXprv("xprv");
  }

  @Test
  void testSetOtp() {
    resolvePendingApprovalRequest.setOtp("otp");
  }
}
