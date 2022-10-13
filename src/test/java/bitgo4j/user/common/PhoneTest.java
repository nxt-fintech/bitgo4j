package bitgo4j.user.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest {
  Phone phone = new Phone();

  @Test
  void testToString() {
    String result = phone.toString();
    String expected = "Phone[phone=<null>,verified=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetPhone() {
    phone.setPhone("phone");
  }

  @Test
  void testSetVerified() {
    phone.setVerified(Boolean.TRUE);
  }
}
