package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageFeeResponseTest {
  AverageFeeResponse averageFeeResponse = new AverageFeeResponse(1.0);

  @Test
  void testToString() {
    String result = averageFeeResponse.toString();
    Assertions.assertEquals("AverageFeeResponse[averageFee=1.0]", result);
  }

  @Test
  void testSetAverageFee() {
    averageFeeResponse.setAverageFee(1.0);
  }
}
