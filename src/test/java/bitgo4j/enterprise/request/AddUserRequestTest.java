package bitgo4j.enterprise.request;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AddUserRequestTest {
  @Mock List<String> usernames;

  @InjectMocks AddUserRequest addUserRequest;

  @Test
  void testToString() {
    String result = addUserRequest.toString();
    Assertions.assertEquals(
        "AddUserRequest[permission=<null>,username=<null>,usernames=usernames]", result);
  }

  @Test
  void testSetPermission() {
    addUserRequest.setPermission("permission");
  }

  @Test
  void testSetUsername() {
    addUserRequest.setUsername("username");
  }

  @Test
  void testSetUsernames() {
    addUserRequest.setUsernames(List.of("String"));
  }
}
