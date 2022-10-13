package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FeeInfoTest {
  FeeInfo feeInfo = new FeeInfo();

  @Test
  void testToString() {
    String result = feeInfo.toString();
    Assertions.assertEquals("FeeInfo[feeString=<null>,fee=<null>]", result);
  }

  @Test
  void testSetFeeString() {
    feeInfo.setFeeString("feeString");
  }

  @Test
  void testSetFee() {
    feeInfo.setFee(0);
  }
}
