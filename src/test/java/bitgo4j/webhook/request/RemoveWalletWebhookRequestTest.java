package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveWalletWebhookRequestTest {
  RemoveWalletWebhookRequest removeWalletWebhookRequest =
      new RemoveWalletWebhookRequest("type", "url", "id");

  @Test
  void testToString() {
    String result = removeWalletWebhookRequest.toString();
    String expected = "RemoveWalletWebhookRequest[type=type,url=url,id=id]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    removeWalletWebhookRequest.setType("type");
  }

  @Test
  void testSetUrl() {
    removeWalletWebhookRequest.setUrl("url");
  }

  @Test
  void testSetId() {
    removeWalletWebhookRequest.setId("id");
  }
}
