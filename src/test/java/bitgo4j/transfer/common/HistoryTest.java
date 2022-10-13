package bitgo4j.transfer.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HistoryTest {
  History history = new History();

  @Test
  void testToString() {
    String result = history.toString();
    String expected = "History[date=<null>,user=<null>,action=<null>,comment=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetDate() {
    history.setDate("date");
  }

  @Test
  void testSetUser() {
    history.setUser("user");
  }

  @Test
  void testSetAction() {
    history.setAction("action");
  }

  @Test
  void testSetComment() {
    history.setComment("comment");
  }
}
