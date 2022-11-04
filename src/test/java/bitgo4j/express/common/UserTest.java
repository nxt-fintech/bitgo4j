package bitgo4j.express.common;

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
class UserTest {
  @InjectMocks
  User user;

  @Test
  void testToString() {
    String result = user.toString();
    Assertions.assertEquals("User[id=<null>,isActive=<null>,name=<null>,username=<null>,email=<null>,phone=<null>,country=<null>,state=<null>,user=<null>,permissions=<null>]", result);
  }

  @Test
  void testSetId() {
    user.setId("id");
  }

  @Test
  void testSetIsActive() {
    user.setIsActive(Boolean.TRUE);
  }

  @Test
  void testSetName() {
    user.setName(new Name("first", "full", "last"));
  }

  @Test
  void testSetUsername() {
    user.setUsername("username");
  }

  @Test
  void testSetEmail() {
    user.setEmail(new Email("email", Boolean.TRUE));
  }

  @Test
  void testSetPhone() {
    user.setPhone(new Phone("phone", Boolean.TRUE));
  }

  @Test
  void testSetCountry() {
    user.setCountry("country");
  }

  @Test
  void testSetState() {
    user.setState("state");
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