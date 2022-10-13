package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PropertyTest {
  Property property =
      new Property(
          "balanceString",
          "confirmedBalanceString",
          "heldBalanceString",
          "spendableBalanceString",
          "stakedBalanceString",
          0);

  @Test
  void testToString() {
    String result = property.toString();
    Assertions.assertEquals(
        "Property[balanceString=balanceString,confirmedBalanceString=confirmedBalanceString,heldBalanceString=heldBalanceString,spendableBalanceString=spendableBalanceString,stakedBalanceString=stakedBalanceString,transferCount=0]",
        result);
  }

  @Test
  void testSetBalanceString() {
    property.setBalanceString("balanceString");
  }

  @Test
  void testSetConfirmedBalanceString() {
    property.setConfirmedBalanceString("confirmedBalanceString");
  }

  @Test
  void testSetHeldBalanceString() {
    property.setHeldBalanceString("heldBalanceString");
  }

  @Test
  void testSetSpendableBalanceString() {
    property.setSpendableBalanceString("spendableBalanceString");
  }

  @Test
  void testSetStakedBalanceString() {
    property.setStakedBalanceString("stakedBalanceString");
  }

  @Test
  void testSetTransferCount() {
    property.setTransferCount(0);
  }
}
