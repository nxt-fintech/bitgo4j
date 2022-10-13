package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionArgsTest {
  FunctionArgs functionArgs = new FunctionArgs();

  @Test
  void testToString() {
    String result = functionArgs.toString();
    Assertions.assertEquals("FunctionArgs[type=<null>,val=<null>]", result);
  }

  @Test
  void testSetType() {
    functionArgs.setType("type");
  }

  @Test
  void testSetVal() {
    functionArgs.setVal("val");
  }
}
