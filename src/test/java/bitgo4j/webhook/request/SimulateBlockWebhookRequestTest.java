package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimulateBlockWebhookRequestTest {
  SimulateBlockWebhookRequest simulateBlockWebhookRequest =
      new SimulateBlockWebhookRequest("blockId");

  @Test
  void testToString() {
    String result = simulateBlockWebhookRequest.toString();
    String expected = "SimulateBlockWebhookRequest[blockId=blockId]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetBlockId() {
    simulateBlockWebhookRequest.setBlockId("blockId");
  }
}
