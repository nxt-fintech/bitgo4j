package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezeTest {
  Freeze freeze = new Freeze("time", "expires");

  @Test
  void testToString() {
    String result = freeze.toString();
    Assertions.assertEquals("Freeze[time=time,expires=expires]", result);
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
