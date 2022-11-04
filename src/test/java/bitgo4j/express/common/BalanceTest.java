package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalanceTest {
  Balance balance = new Balance();

  @Test
  void testToString() {
    String result = balance.toString();
    String expected =
        "Balance[updated=<null>,balance=<null>,totalReceived=<null>,totalSent=<null>,balanceString=<null>,coin=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUpdated() {
    balance.setUpdated("updated");
  }

  @Test
  void testSetBalance() {
    balance.setBalance(0L);
  }

  @Test
  void testSetTotalReceived() {
    balance.setTotalReceived(0L);
  }

  @Test
  void testSetTotalSent() {
    balance.setTotalSent(0L);
  }

  @Test
  void testSetBalanceString() {
    balance.setBalanceString("balanceString");
  }

  @Test
  void testSetCoin() {
    balance.setCoin("coin");
  }
}