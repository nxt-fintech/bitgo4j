package bitgo4j.address.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Eip1559Test {
  Eip1559 eip1559 = new Eip1559("maxPriorityFeePerGas", "maxFeePerGas");

  @Test
  void testToString() {
    String result = eip1559.toString();
    String expected = "Eip1559[maxPriorityPerGas=maxPriorityFeePerGas,maxFeePerGas=maxFeePerGas]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetMaxPriorityFeePerGas() {
    eip1559.setMaxPriorityFeePerGas("maxPriorityFeePerGas");
  }

  @Test
  void testSetMaxFeePerGas() {
    eip1559.setMaxFeePerGas("maxFeePerGas");
  }
}
