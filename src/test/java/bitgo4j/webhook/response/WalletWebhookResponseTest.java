package bitgo4j.webhook.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WalletWebhookResponseTest {
  WalletWebhookResponse walletWebhookResponse = new WalletWebhookResponse();

  @Test
  void testToString() {
    String result = walletWebhookResponse.toString();
    String expected =
        "WalletWebhookResponse[allToken=<null>,id=<null>,label=<null>,created=<null>,coin=<null>,type=<null>,url=<null>,version=<null>,numConfirmations=<null>,state=<null>,lastAttempt=<null>,failingSince=<null>,successiveFailedAttempts=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAllToken() {
    walletWebhookResponse.setAllToken(Boolean.TRUE);
  }

  @Test
  void testSetId() {
    walletWebhookResponse.setId("id");
  }

  @Test
  void testSetLabel() {
    walletWebhookResponse.setLabel("label");
  }

  @Test
  void testSetCreated() {
    walletWebhookResponse.setCreated("created");
  }

  @Test
  void testSetCoin() {
    walletWebhookResponse.setCoin("coin");
  }

  @Test
  void testSetType() {
    walletWebhookResponse.setType("type");
  }

  @Test
  void testSetUrl() {
    walletWebhookResponse.setUrl("url");
  }

  @Test
  void testSetVersion() {
    walletWebhookResponse.setVersion(0L);
  }

  @Test
  void testSetNumConfirmations() {
    walletWebhookResponse.setNumConfirmations(0L);
  }

  @Test
  void testSetState() {
    walletWebhookResponse.setState("state");
  }

  @Test
  void testSetLastAttempt() {
    walletWebhookResponse.setLastAttempt("lastAttempt");
  }

  @Test
  void testSetFailingSince() {
    walletWebhookResponse.setFailingSince("failingSince");
  }

  @Test
  void testSetSuccessiveFailedAttempts() {
    walletWebhookResponse.setSuccessiveFailedAttempts(0L);
  }
}
