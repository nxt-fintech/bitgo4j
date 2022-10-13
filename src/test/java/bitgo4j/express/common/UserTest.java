package bitgo4j.express.common;

import bitgo4j.user.common.Email;
import bitgo4j.user.common.Name;
import bitgo4j.user.common.Phone;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserTest {
  @Mock Name name;

  @Mock Email email;

  @Mock Phone phone;

  @Mock List<String> permissions;

  @InjectMocks User user;

  @Test
  void testToString() {
    String result = user.toString();
    String expected =
        "User[id=<null>,isActive=<null>,name=name,username=<null>,email=email,phone=phone,country=<null>,user=<null>,permissions=permissions]";
    Assertions.assertEquals(expected, result);
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
    user.setName(new Name());
  }

  @Test
  void testSetUsername() {
    user.setUsername("username");
  }

  @Test
  void testSetEmail() {
    user.setEmail(new Email());
  }

  @Test
  void testSetPhone() {
    user.setPhone(new Phone());
  }

  @Test
  void testSetCountry() {
    user.setCountry("country");
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
