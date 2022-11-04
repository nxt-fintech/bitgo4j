package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionArgTest {
  FunctionArg functionArg = new FunctionArg();

  @Test
  void testToString() {
    String result = functionArg.toString();
    Assertions.assertEquals("FunctionArg[type=<null>,val=<null>]", result);
  }

  @Test
  void testSetType() {
    functionArg.setType("type");
  }

  @Test
  void testSetVal() {
    functionArg.setVal("val");
  }
}
