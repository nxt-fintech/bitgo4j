package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimulateWalletWebhookRequestTest {
  SimulateWalletWebhookRequest simulateWalletWebhookRequest =
      new SimulateWalletWebhookRequest("transferId", "pendingApprovalId");

  @Test
  void testToString() {
    String result = simulateWalletWebhookRequest.toString();
    String expected =
        "SimulateWalletWebhookRequest[transferId=transferId,pendingApprovalId=pendingApprovalId]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTransferId() {
    simulateWalletWebhookRequest.setTransferId("transferId");
  }

  @Test
  void testSetPendingApprovalId() {
    simulateWalletWebhookRequest.setPendingApprovalId("pendingApprovalId");
  }
}
