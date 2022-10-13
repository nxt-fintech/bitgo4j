package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FeeOptionsTest {
  FeeOptions feeOptions = new FeeOptions();

  @Test
  void testToString() {
    String result = feeOptions.toString();
    Assertions.assertEquals(
        "FeeOptions[unit=<null>,formula=<null>,feeType=<null>,gasLimit=<null>,gasPrice=<null>]",
        result);
  }

  @Test
  void testSetUnit() {
    feeOptions.setUnit("unit");
  }

  @Test
  void testSetFormula() {
    feeOptions.setFormula("formula");
  }

  @Test
  void testSetFeeType() {
    feeOptions.setFeeType("feeType");
  }

  @Test
  void testSetGasLimit() {
    feeOptions.setGasLimit(0);
  }

  @Test
  void testSetGasPrice() {
    feeOptions.setGasPrice(0);
  }
}
