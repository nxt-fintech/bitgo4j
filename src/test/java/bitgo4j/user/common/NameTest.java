package bitgo4j.user.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameTest {
  Name name = new Name();

  @Test
  void testToString() {
    String result = name.toString();
    String expected = "Name[first=<null>,full=<null>,last=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetFirst() {
    name.setFirst("first");
  }

  @Test
  void testSetFull() {
    name.setFull("full");
  }

  @Test
  void testSetLast() {
    name.setLast("last");
  }
}
