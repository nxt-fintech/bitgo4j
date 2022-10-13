package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveBlockWebhookRequestTest {
  RemoveBlockWebhookRequest removeBlockWebhookRequest =
      new RemoveBlockWebhookRequest("type", "url", "id");

  @Test
  void testToString() {
    String result = removeBlockWebhookRequest.toString();
    String expected = "RemoveBlockWebhookRequest[type=type,url=url,id=id]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    removeBlockWebhookRequest.setType("type");
  }

  @Test
  void testSetUrl() {
    removeBlockWebhookRequest.setUrl("url");
  }

  @Test
  void testSetId() {
    removeBlockWebhookRequest.setId("id");
  }
}
