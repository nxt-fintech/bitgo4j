package bitgo4j.pendingapproval.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdatePendingApprovalRequestTest {
  UpdatePendingApprovalRequest updatePendingApprovalRequest =
      new UpdatePendingApprovalRequest("otp", "state");

  @Test
  void testToString() {
    String result = updatePendingApprovalRequest.toString();
    String expected = "UpdatePendingApprovalRequest[otp=otp,state=state]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetOtp() {
    updatePendingApprovalRequest.setOtp("otp");
  }

  @Test
  void testSetState() {
    updatePendingApprovalRequest.setState("state");
  }
}
