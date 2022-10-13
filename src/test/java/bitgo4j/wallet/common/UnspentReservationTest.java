package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnspentReservationTest {
  UnspentReservation unspentReservation = new UnspentReservation();

  @Test
  void testToString() {
    String result = unspentReservation.toString();
    String expected =
        "UnspentReservation[id=<null>,walletId=<null>,expireTime=<null>,userId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    unspentReservation.setId("id");
  }

  @Test
  void testSetWalletId() {
    unspentReservation.setWalletId("walletId");
  }

  @Test
  void testSetExpireTime() {
    unspentReservation.setExpireTime("expireTime");
  }

  @Test
  void testSetUserId() {
    unspentReservation.setUserId("userId");
  }
}
