package bitgo4j.user.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTest {
  Email email = new Email();

  @Test
  void testToString() {
    String result = email.toString();
    String expected = "Email[email=<null>,verified=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetEmail() {
    email.setEmail("email");
  }

  @Test
  void testSetVerified() {
    email.setVerified(Boolean.TRUE);
  }
}
