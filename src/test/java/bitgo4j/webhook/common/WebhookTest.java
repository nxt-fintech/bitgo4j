package bitgo4j.webhook.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebhookTest {
  Webhook webhook = new Webhook();

  @Test
  void testToString() {
    String result = webhook.toString();
    String expected =
        "Webhook[id=<null>,label=<null>,created=<null>,coin=<null>,type=<null>,url=<null>,version=<null>,numConfirmations=<null>,state=<null>,lastAttempt=<null>,failingSince=<null>,successiveFailedAttempts=<null>,walletId=<null>,allToken=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    webhook.setId("id");
  }

  @Test
  void testSetLabel() {
    webhook.setLabel("label");
  }

  @Test
  void testSetCreated() {
    webhook.setCreated("created");
  }

  @Test
  void testSetCoin() {
    webhook.setCoin("coin");
  }

  @Test
  void testSetType() {
    webhook.setType("type");
  }

  @Test
  void testSetUrl() {
    webhook.setUrl("url");
  }

  @Test
  void testSetVersion() {
    webhook.setVersion(0L);
  }

  @Test
  void testSetNumConfirmations() {
    webhook.setNumConfirmations(0L);
  }

  @Test
  void testSetState() {
    webhook.setState("state");
  }

  @Test
  void testSetLastAttempt() {
    webhook.setLastAttempt("lastAttempt");
  }

  @Test
  void testSetFailingSince() {
    webhook.setFailingSince("failingSince");
  }

  @Test
  void testSetSuccessiveFailedAttempts() {
    webhook.setSuccessiveFailedAttempts(0L);
  }

  @Test
  void testSetWalletId() {
    webhook.setWalletId("walletId");
  }

  @Test
  void testSetAllToken() {
    webhook.setAllToken(Boolean.TRUE);
  }
}