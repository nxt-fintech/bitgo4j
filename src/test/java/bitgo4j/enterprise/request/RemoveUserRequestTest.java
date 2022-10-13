package bitgo4j.enterprise.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveUserRequestTest {
  RemoveUserRequest removeUserRequest = new RemoveUserRequest("username");

  @Test
  void testToString() {
    String result = removeUserRequest.toString();
    Assertions.assertEquals("RemoveUserRequest[username=username]", result);
  }

  @Test
  void testSetUsername() {
    removeUserRequest.setUsername("username");
  }
}
