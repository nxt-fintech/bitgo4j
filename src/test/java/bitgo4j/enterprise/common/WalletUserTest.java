package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WalletUserTest {
  WalletUser walletUser = new WalletUser("id", "username");

  @Test
  void testToString() {
    String result = walletUser.toString();
    Assertions.assertEquals("WalletUser[id=id,username=username]", result);
  }

  @Test
  void testSetId() {
    walletUser.setId("id");
  }

  @Test
  void testSetUsername() {
    walletUser.setUsername("username");
  }
}
