package bitgo4j.transactionrequest.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FeeInfoTest {
  FeeInfo freeInfo = new FeeInfo();

  @Test
  void testToString() {
    String result = freeInfo.toString();
    Assertions.assertEquals("FeeInfo[feeString=<null>,fee=<null>]", result);
  }

  @Test
  void testSetFeeString() {
    freeInfo.setFeeString("feeString");
  }

  @Test
  void testSetFee() {
    freeInfo.setFee(0);
  }
}
