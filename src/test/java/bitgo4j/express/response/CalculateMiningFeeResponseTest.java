package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateMiningFeeResponseTest {
  CalculateMiningFeeResponse calculateMiningFeeResponse = new CalculateMiningFeeResponse();

  @Test
  void testToString() {
    String result = calculateMiningFeeResponse.toString();
    String expected = "CalculateMiningFeeResponse[size=<null>,fee=<null>,feeRate=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetSize() {
    calculateMiningFeeResponse.setSize(0);
  }

  @Test
  void testSetFee() {
    calculateMiningFeeResponse.setFee(0);
  }

  @Test
  void testSetFeeRate() {
    calculateMiningFeeResponse.setFeeRate(0);
  }
}
