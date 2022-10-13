package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateApprovalsRequiredRequestTest {
  UpdateApprovalsRequiredRequest updateApprovalsRequiredRequest =
      new UpdateApprovalsRequiredRequest(0L);

  @Test
  void testToString() {
    String result = updateApprovalsRequiredRequest.toString();
    Assertions.assertEquals("UpdateApprovalsRequiredRequest[requestedApprovalsRequired=0]", result);
  }

  @Test
  void testSetRequestedApprovalsRequired() {
    updateApprovalsRequiredRequest.setRequestedApprovalsRequired(0L);
  }
}
