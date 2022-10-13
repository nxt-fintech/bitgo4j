package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StakingOptionsTest {
  StakingOptions stakingOptions = new StakingOptions(0, "validator");

  @Test
  void testToString() {
    String result = stakingOptions.toString();
    String expected = "StakingOptions[amount=0,validator=validator]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAmount() {
    stakingOptions.setAmount(0);
  }

  @Test
  void testSetValidator() {
    stakingOptions.setValidator("validator");
  }
}
