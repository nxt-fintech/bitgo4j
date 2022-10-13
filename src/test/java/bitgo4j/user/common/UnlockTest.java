package bitgo4j.user.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnlockTest {
  Unlock unlock = new Unlock();

  @Test
  void testToString() {
    String result = unlock.toString();
    String expected = "Unlock[time=<null>,expires=<null>,txCount=<null>,txValue=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTime() {
    unlock.setTime("time");
  }

  @Test
  void testSetExpires() {
    unlock.setExpires("expires");
  }

  @Test
  void testSetTxCount() {
    unlock.setTxCount(0L);
  }

  @Test
  void testSetTxValue() {
    unlock.setTxValue(0L);
  }
}
