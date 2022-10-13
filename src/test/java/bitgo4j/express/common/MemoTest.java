package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoTest {
  Memo memo = new Memo("type", "value");

  @Test
  void testToString() {
    String result = memo.toString();
    String expected = "Memo[type=type,value=value]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    memo.setType("type");
  }

  @Test
  void testSetValue() {
    memo.setValue("value");
  }
}
