package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezeWalletResponseTest {
  FreezeWalletResponse freezeWalletResponse = new FreezeWalletResponse();

  @Test
  void testToString() {
    String result = freezeWalletResponse.toString();
    String expected = "FreezeWalletResponse[time=<null>,expires=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTime() {
    freezeWalletResponse.setTime("time");
  }

  @Test
  void testSetExpires() {
    freezeWalletResponse.setExpires("expires");
  }
}
