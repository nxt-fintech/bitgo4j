package bitgo4j.user.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginRequestTest {
  LoginRequest loginRequest = new LoginRequest("email", Boolean.TRUE, "otp", "password");

  @Test
  void testToString() {
    String result = loginRequest.toString();
    String expected = "LoginRequest[email=email,extensible=true,otp=otp,password=password]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetEmail() {
    loginRequest.setEmail("email");
  }

  @Test
  void testSetExtensible() {
    loginRequest.setExtensible(Boolean.TRUE);
  }

  @Test
  void testSetOtp() {
    loginRequest.setOtp("otp");
  }

  @Test
  void testSetPassword() {
    loginRequest.setPassword("password");
  }
}
