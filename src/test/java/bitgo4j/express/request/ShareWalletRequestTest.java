package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShareWalletRequestTest {
  ShareWalletRequest shareWalletRequest =
      new ShareWalletRequest(
          "email",
          "permissions",
          "walletPassphrase",
          "message",
          Boolean.TRUE,
          Boolean.TRUE,
          Boolean.TRUE);

  @Test
  void testToString() {
    String result = shareWalletRequest.toString();
    String expected =
        "ShareWalletRequest[email=email,permissions=permissions,walletPassphrase=walletPassphrase,message=message,reshare=true,skipKeychain=true,disableEmail=true]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetEmail() {
    shareWalletRequest.setEmail("email");
  }

  @Test
  void testSetPermissions() {
    shareWalletRequest.setPermissions("permissions");
  }

  @Test
  void testSetWalletPassphrase() {
    shareWalletRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetMessage() {
    shareWalletRequest.setMessage("message");
  }

  @Test
  void testSetReshare() {
    shareWalletRequest.setReshare(Boolean.TRUE);
  }

  @Test
  void testSetSkipKeychain() {
    shareWalletRequest.setSkipKeychain(Boolean.TRUE);
  }

  @Test
  void testSetDisableEmail() {
    shareWalletRequest.setDisableEmail(Boolean.TRUE);
  }
}
