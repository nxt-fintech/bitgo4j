package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmountTest {
  Amount amount = new Amount();

  @Test
  void testToString() {
    String result = amount.toString();
    Assertions.assertEquals("Amount[value=<null>,symbol=<null>]", result);
  }

  @Test
  void testSetValue() {
    amount.setValue("value");
  }

  @Test
  void testSetSymbol() {
    amount.setSymbol("symbol");
  }
}
