package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class UnspentTest {
  Unspent unspent = new Unspent();

  @Test
  void testToString() {
    String result = unspent.toString();
    Assertions.assertEquals(
        "Unspent[id=<null>,walletId=<null>,=expireTime=<null>,userId=<null>]", result);
  }

  @Test
  void testSetId() {
    unspent.setId("id");
  }

  @Test
  void testSetWalletId() {
    unspent.setWalletId("walletId");
  }

  @Test
  void testSetExpireTime() {
    unspent.setExpireTime("expireTime");
  }

  @Test
  void testSetUserId() {
    unspent.setUserId("userId");
  }
}
