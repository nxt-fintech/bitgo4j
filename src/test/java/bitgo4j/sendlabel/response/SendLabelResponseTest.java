package bitgo4j.sendlabel.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SendLabelResponseTest {
  SendLabelResponse sendLabelResponse = new SendLabelResponse();

  @Test
  void testToString() {
    String result = sendLabelResponse.toString();
    Assertions.assertEquals(
        "SendLabelResponse[id=<null>,coin=<null>,address=<null>,enterpriseId=<null>,label=<null>]",
        result);
  }

  @Test
  void testSetId() {
    sendLabelResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    sendLabelResponse.setCoin("coin");
  }

  @Test
  void testSetAddress() {
    sendLabelResponse.setAddress("address");
  }

  @Test
  void testSetEnterpriseId() {
    sendLabelResponse.setEnterpriseId("enterpriseId");
  }

  @Test
  void testSetLabel() {
    sendLabelResponse.setLabel("label");
  }
}
