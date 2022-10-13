package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBlockWebhookRequestTest {
  AddBlockWebhookRequest addBlockWebhookRequest =
      new AddBlockWebhookRequest("type", "url", "label", 0);

  @Test
  void testToString() {
    String result = addBlockWebhookRequest.toString();
    String expected = "AddBlockWebhookRequest[type=type,url=url,label=label,numConfirmations=0]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    addBlockWebhookRequest.setType("type");
  }

  @Test
  void testSetUrl() {
    addBlockWebhookRequest.setUrl("url");
  }

  @Test
  void testSetLabel() {
    addBlockWebhookRequest.setLabel("label");
  }

  @Test
  void testSetNumConfirmations() {
    addBlockWebhookRequest.setNumConfirmations(0);
  }
}
