package bitgo4j.webhook.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveBlockWebhookResponseTest {
  RemoveBlockWebhookResponse removeBlockWebhookResponse = new RemoveBlockWebhookResponse();

  @Test
  void testToString() {
    String result = removeBlockWebhookResponse.toString();
    String expected = "RemoveBlockWebhookResponse[removed=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetRemoved() {
    removeBlockWebhookResponse.setRemoved(0L);
  }
}
