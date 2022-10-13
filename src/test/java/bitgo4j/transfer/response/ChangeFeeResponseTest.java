package bitgo4j.transfer.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangeFeeResponseTest {
  ChangeFeeResponse changeFeeResponse = new ChangeFeeResponse();

  @Test
  void testToString() {
    String result = changeFeeResponse.toString();
    String expected = "ChangeFeeResponse[txid=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxid() {
    changeFeeResponse.setTxid("txid");
  }
}
