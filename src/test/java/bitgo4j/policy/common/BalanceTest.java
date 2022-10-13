package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalanceTest {
  Balance balance = new Balance();

  @Test
  void testToString() {
    String result = balance.toString();
    Assertions.assertEquals(
        "Balance[updated=<null>,balance=<null>,balanceString=<null>,totalReceived=<null>,totalSent=<null>,confirmedBalanceString=<null>,spendableBalanceString=<null>]",
        result);
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
  void testSetBalanceString() {
    balance.setBalanceString("balanceString");
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
  void testSetConfirmedBalanceString() {
    balance.setConfirmedBalanceString("confirmedBalanceString");
  }

  @Test
  void testSetSpendableBalanceString() {
    balance.setSpendableBalanceString("spendableBalanceString");
  }
}
