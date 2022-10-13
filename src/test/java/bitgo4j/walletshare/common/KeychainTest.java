package bitgo4j.walletshare.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeychainTest {
  Keychain keychain = new Keychain();

  @Test
  void testToString() {
    String result = keychain.toString();
    Assertions.assertEquals(
        "Keychain[pub=<null>,encryptedPrv=<null>,fromPubKey=<null>,toPubKey=<null>,path=<null>]",
        result);
  }

  @Test
  void testSetPub() {
    keychain.setPub("pub");
  }

  @Test
  void testSetEncryptedPrv() {
    keychain.setEncryptedPrv("encryptedPrv");
  }

  @Test
  void testSetFromPubKey() {
    keychain.setFromPubKey("fromPubKey");
  }

  @Test
  void testSetToPubKey() {
    keychain.setToPubKey("toPubKey");
  }

  @Test
  void testSetPath() {
    keychain.setPath("path");
  }
}
