package bitgo4j.webhook.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebhookNotificationTest {
  WebhookNotification webhookNotification = new WebhookNotification();

  @Test
  void testToString() {
    String result = webhookNotification.toString();
    String expected =
        "WebhookNotification[wallet=<null>,transfer=<null>,hash=<null>,id=<null>,webhook=<null>,updateAt=<null>,coin=<null>,type=<null>,url=<null>,version=<null>,state=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetWallet() {
    webhookNotification.setWallet("wallet");
  }

  @Test
  void testSetTransfer() {
    webhookNotification.setTransfer("transfer");
  }

  @Test
  void testSetHash() {
    webhookNotification.setHash("hash");
  }

  @Test
  void testSetId() {
    webhookNotification.setId("id");
  }

  @Test
  void testSetWebhook() {
    webhookNotification.setWebhook("webhook");
  }

  @Test
  void testSetUpdateAt() {
    webhookNotification.setUpdateAt("updateAt");
  }

  @Test
  void testSetCoin() {
    webhookNotification.setCoin("coin");
  }

  @Test
  void testSetType() {
    webhookNotification.setType("type");
  }

  @Test
  void testSetUrl() {
    webhookNotification.setUrl("url");
  }

  @Test
  void testSetVersion() {
    webhookNotification.setVersion(0L);
  }

  @Test
  void testSetState() {
    webhookNotification.setState("state");
  }
}
