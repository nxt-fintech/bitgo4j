package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezeTest {
  Freeze freeze = new Freeze();

  @Test
  void testToString() {
    String result = freeze.toString();
    String expected = "Freeze[time=<null>,expires=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTime() {
    freeze.setTime("time");
  }

  @Test
  void testSetExpires() {
    freeze.setExpires("expires");
  }
}