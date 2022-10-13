package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VelocityLimitSpendingTest {
  VelocityLimitSpending velocityLimitSpending = new VelocityLimitSpending();

  @Test
  void testToString() {
    String result = velocityLimitSpending.toString();
    String expected =
        "VelocityLimitSpending[coin=<null>,timeWindow=<null>,limitAmountString=<null>,amountSpentString=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoin() {
    velocityLimitSpending.setCoin("coin");
  }

  @Test
  void testSetTimeWindow() {
    velocityLimitSpending.setTimeWindow("timeWindow");
  }

  @Test
  void testSetLimitAmountString() {
    velocityLimitSpending.setLimitAmountString("limitAmountString");
  }

  @Test
  void testSetAmountSpentString() {
    velocityLimitSpending.setAmountSpentString("amountSpentString");
  }
}