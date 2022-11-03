package bitgo4j.express.response;

import bitgo4j.express.common.User;
import bitgo4j.user.common.Email;
import bitgo4j.user.common.Name;
import bitgo4j.user.common.Phone;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LoginResponseTest {
  @InjectMocks
  LoginResponse loginResponse;

  @Test
  void testToString() {
    String result = loginResponse.toString();
    Assertions.assertEquals("LoginResponse[accessToken=<null>,expiresAt=<null>,scope=<null>,user=<null>]", result);
  }

  @Test
  void testSetAccessToken() {
    loginResponse.setAccessToken("accessToken");
  }

  @Test
  void testSetExpiresAt() {
    loginResponse.setExpiresAt(0);
  }

  @Test
  void testSetScope() {
    loginResponse.setScope(List.of("String"));
  }

  @Test
  void testSetUser() {
    loginResponse.setUser(
        new User("id", Boolean.TRUE, new Name("first", "full", "last"), "username",
            new Email("email", Boolean.TRUE), new Phone("phone", Boolean.TRUE), "country", "state",
            "user", List.of("String")));
  }
}