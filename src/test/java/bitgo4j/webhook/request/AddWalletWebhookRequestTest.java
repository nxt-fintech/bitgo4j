package bitgo4j.webhook.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddWalletWebhookRequestTest {
  AddWalletWebhookRequest addWalletWebhookRequest =
      new AddWalletWebhookRequest("type", Boolean.TRUE, "url", "label", 0, Boolean.TRUE);

  @Test
  void testToString() {
    String result = addWalletWebhookRequest.toString();
    String expected =
        "AddWalletWebhookRequest[type=type,allToken=true,url=url,label=label,numConfirmations=0,listenToFailureStates=true]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    addWalletWebhookRequest.setType("type");
  }

  @Test
  void testSetAllToken() {
    addWalletWebhookRequest.setAllToken(Boolean.TRUE);
  }

  @Test
  void testSetUrl() {
    addWalletWebhookRequest.setUrl("url");
  }

  @Test
  void testSetLabel() {
    addWalletWebhookRequest.setLabel("label");
  }

  @Test
  void testSetNumConfirmations() {
    addWalletWebhookRequest.setNumConfirmations(0);
  }

  @Test
  void testSetListenToFailureStates() {
    addWalletWebhookRequest.setListenToFailureStates(Boolean.TRUE);
  }
}
