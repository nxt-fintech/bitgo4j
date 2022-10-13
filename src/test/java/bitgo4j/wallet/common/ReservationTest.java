package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReservationTest {
  Reservation reservation = new Reservation("expireTime");

  @Test
  void testToString() {
    String result = reservation.toString();
    String expected = "Reservation[expireTime=expireTime]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetExpireTime() {
    reservation.setExpireTime("expireTime");
  }
}
