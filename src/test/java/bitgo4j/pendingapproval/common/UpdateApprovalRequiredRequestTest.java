package bitgo4j.pendingapproval.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateApprovalRequiredRequestTest {
  UpdateApprovalRequiredRequest updateApprovalRequiredRequest = new UpdateApprovalRequiredRequest();

  @Test
  void testToString() {
    String result = updateApprovalRequiredRequest.toString();
    String expected = "UpdateApprovalRequiredRequest[requestedApprovalsRequired=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetRequestedApprovalsRequired() {
    updateApprovalRequiredRequest.setRequestedApprovalsRequired(0);
  }
}