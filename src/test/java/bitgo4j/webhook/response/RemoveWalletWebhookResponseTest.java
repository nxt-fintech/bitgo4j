package bitgo4j.webhook.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveWalletWebhookResponseTest {
  RemoveWalletWebhookResponse removeWalletWebhookResponse = new RemoveWalletWebhookResponse();

  @Test
  void testToString() {
    String result = removeWalletWebhookResponse.toString();
    String expected = "RemoveWalletWebhookResponse[removed=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetRemoved() {
    removeWalletWebhookResponse.setRemoved(0L);
  }
}
