package bitgo4j.user.response;

import bitgo4j.user.common.Email;
import bitgo4j.user.common.Name;
import bitgo4j.user.common.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserResponseTest {
  @Mock Name name;

  @Mock Email email;

  @Mock Phone phone;

  @InjectMocks UserResponse userResponse;

  @Test
  void testToString() {
    String result = userResponse.toString();
    Assertions.assertEquals(
        "UserResponse[id=<null>,isActive=<null>,name=name,username=<null>,email=email,phone=phone,country=<null>,state=<null>]",
        result);
  }

  @Test
  void testSetId() {
    userResponse.setId("id");
  }

  @Test
  void testSetIsActive() {
    userResponse.setIsActive(Boolean.TRUE);
  }

  @Test
  void testSetName() {
    userResponse.setName(new Name());
  }

  @Test
  void testSetUsername() {
    userResponse.setUsername("username");
  }

  @Test
  void testSetEmail() {
    userResponse.setEmail(new Email());
  }

  @Test
  void testSetPhone() {
    userResponse.setPhone(new Phone());
  }

  @Test
  void testSetCountry() {
    userResponse.setCountry("country");
  }

  @Test
  void testSetState() {
    userResponse.setState("state");
  }
}
