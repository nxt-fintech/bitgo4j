package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FeeInfoTest {
  FeeInfo feeInfo = new FeeInfo();

  @Test
  void testToString() {
    String result = feeInfo.toString();
    String expected = "FeeInfo[size=<null>,fee=<null>,feeRate=<null>,payGoFee=<null>,payGoFeeString=<null>,feeString=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetSize() {
    feeInfo.setSize(0);
  }

  @Test
  void testSetFee() {
    feeInfo.setFee(0);
  }

  @Test
  void testSetFeeRate() {
    feeInfo.setFeeRate(0);
  }

  @Test
  void testSetPayGoFee() {
    feeInfo.setPayGoFee(0);
  }

  @Test
  void testSetPayGoFeeString() {
    feeInfo.setPayGoFeeString("payGoFeeString");
  }

  @Test
  void testFeeString() { feeInfo.setFeeString("feeString"); }
}