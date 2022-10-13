package bitgo4j.webhook.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BlockWebhookResponseTest {
  BlockWebhookResponse blockWebhookResponse = new BlockWebhookResponse();

  @Test
  void testToString() {
    String result = blockWebhookResponse.toString();
    String expected =
        "BlockWebhookResponse[type=<null>,userId=<null>,id=<null>,label=<null>,created=<null>,coin=<null>,url=<null>,version=<null>,numConfirmations=<null>,state=<null>,lastAttempt=<null>,failingSince=<null>,successiveFailedAttempts=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    blockWebhookResponse.setType("type");
  }

  @Test
  void testSetUserId() {
    blockWebhookResponse.setUserId("userId");
  }

  @Test
  void testSetId() {
    blockWebhookResponse.setId("id");
  }

  @Test
  void testSetLabel() {
    blockWebhookResponse.setLabel("label");
  }

  @Test
  void testSetCreated() {
    blockWebhookResponse.setCreated("created");
  }

  @Test
  void testSetCoin() {
    blockWebhookResponse.setCoin("coin");
  }

  @Test
  void testSetUrl() {
    blockWebhookResponse.setUrl("url");
  }

  @Test
  void testSetVersion() {
    blockWebhookResponse.setVersion(0L);
  }

  @Test
  void testSetNumConfirmations() {
    blockWebhookResponse.setNumConfirmations(0L);
  }

  @Test
  void testSetState() {
    blockWebhookResponse.setState("state");
  }

  @Test
  void testSetLastAttempt() {
    blockWebhookResponse.setLastAttempt("lastAttempt");
  }

  @Test
  void testSetFailingSince() {
    blockWebhookResponse.setFailingSince("failingSince");
  }

  @Test
  void testSetSuccessiveFailedAttempts() {
    blockWebhookResponse.setSuccessiveFailedAttempts(0L);
  }
}
