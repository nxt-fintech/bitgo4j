package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalanceDataTest {
  BalanceData balanceData = new BalanceData();

  @Test
  void testToString() {
    String result = balanceData.toString();
    String expected = "BalanceData[validator=<null>,stackedAmount=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetValidator() {
    balanceData.setValidator("validator");
  }

  @Test
  void testSetStackedAmount() {
    balanceData.setStackedAmount("stackedAmount");
  }
}
