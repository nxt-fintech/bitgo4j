package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserTest {
  @Mock List<String> permissions;

  @InjectMocks User user;

  @Test
  void testToString() {
    String result = user.toString();
    String expected = "User[user=<null>,permissions=permissions]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUser() {
    user.setUser("user");
  }

  @Test
  void testSetPermissions() {
    user.setPermissions(List.of("String"));
  }
}
