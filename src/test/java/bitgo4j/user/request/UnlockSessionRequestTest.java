package bitgo4j.user.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnlockSessionRequestTest {
  UnlockSessionRequest unlockSessionRequest = new UnlockSessionRequest(0, "otp");

  @Test
  void testToString() {
    String result = unlockSessionRequest.toString();
    String expected = "UnlockSessionRequest[duration=0,otp=otp]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetDuration() {
    unlockSessionRequest.setDuration(0);
  }

  @Test
  void testSetOtp() {
    unlockSessionRequest.setOtp("otp");
  }
}
