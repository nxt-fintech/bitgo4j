package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangesTest {
  Changes changes = new Changes("expireTime");

  @Test
  void testToString() {
    String result = changes.toString();
    String expected = "Changes[expireTime=expireTime]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetExpireTime() {
    changes.setExpireTime("expireTime");
  }
}
