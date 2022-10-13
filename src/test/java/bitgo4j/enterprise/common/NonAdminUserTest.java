package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonAdminUserTest {
  NonAdminUser nonAdminUser = new NonAdminUser("id", "username", Boolean.TRUE);

  @Test
  void testToString() {
    String result = nonAdminUser.toString();
    Assertions.assertEquals("NonAdminUser[id=id,username=username,verified=true]", result);
  }

  @Test
  void testSetId() {
    nonAdminUser.setId("id");
  }

  @Test
  void testSetUsername() {
    nonAdminUser.setUsername("username");
  }

  @Test
  void testSetVerified() {
    nonAdminUser.setVerified(Boolean.TRUE);
  }
}
