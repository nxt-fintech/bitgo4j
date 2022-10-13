package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptWalletShareRequestTest {
  AcceptWalletShareRequest acceptWalletShareRequest =
      new AcceptWalletShareRequest("userPassword", "newWalletPassphrase", "overrideEncryptedPrv");

  @Test
  void testToString() {
    String result = acceptWalletShareRequest.toString();
    String expected =
        "AcceptWalletShareRequest[userPassword=userPassword,newWalletPassphrase=newWalletPassphrase,overrideEncryptedPrv=overrideEncryptedPrv]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUserPassword() {
    acceptWalletShareRequest.setUserPassword("userPassword");
  }

  @Test
  void testSetNewWalletPassphrase() {
    acceptWalletShareRequest.setNewWalletPassphrase("newWalletPassphrase");
  }

  @Test
  void testSetOverrideEncryptedPrv() {
    acceptWalletShareRequest.setOverrideEncryptedPrv("overrideEncryptedPrv");
  }
}
