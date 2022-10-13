package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdminUserTest {
  AdminUser adminUser = new AdminUser("id", "username", Boolean.TRUE);

  @Test
  void testToString() {
    String result = adminUser.toString();
    Assertions.assertEquals("AdminUser[id=id,username=username,verified=true]", result);
  }

  @Test
  void testSetId() {
    adminUser.setId("id");
  }

  @Test
  void testSetUsername() {
    adminUser.setUsername("username");
  }

  @Test
  void testSetVerified() {
    adminUser.setVerified(Boolean.TRUE);
  }
}
