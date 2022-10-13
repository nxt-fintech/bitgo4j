package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GenerateWalletRequestTest {
  GenerateWalletRequest generateWalletRequest =
      new GenerateWalletRequest(
          "label",
          "passphrase",
          "userKey",
          "backupXpub",
          "backupXpubProvider",
          "enterprise",
          Boolean.TRUE,
          "passcodeEncryptionCode",
          "coldDerivationSeed",
          0,
          Boolean.TRUE,
          0);

  // FIXME: error due to random initialization
  @Disabled
  @Test
  void testToString() {
    String result = generateWalletRequest.toString();
    String expected =
        "GenerateWalletRequest[label=label,passphrase=passphrase,userKey=userKey,backupXpub=backupXpub,backupXpubProvider=backupXpubProvider,enterprise=enterprise,disableTransactionNotifications=true,passcodeEncryptionCode=passcodeEncryptionCode,coldDerivationSeed=coldDerivationSeed,gasPrice=0,disableKRSEmail=true,walletVersion=0";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUserKey() {
    generateWalletRequest.setUserKey("userKey");
  }

  @Test
  void testSetBackupXpub() {
    generateWalletRequest.setBackupXpub("backupXpub");
  }

  @Test
  void testSetBackupXpubProvider() {
    generateWalletRequest.setBackupXpubProvider("backupXpubProvider");
  }

  @Test
  void testSetEnterprise() {
    generateWalletRequest.setEnterprise("enterprise");
  }

  @Test
  void testSetDisableTransactionNotifications() {
    generateWalletRequest.setDisableTransactionNotifications(Boolean.TRUE);
  }

  @Test
  void testSetPasscodeEncryptionCode() {
    generateWalletRequest.setPasscodeEncryptionCode("passcodeEncryptionCode");
  }

  @Test
  void testSetColdDerivationSeed() {
    generateWalletRequest.setColdDerivationSeed("coldDerivationSeed");
  }

  @Test
  void testSetGasPrice() {
    generateWalletRequest.setGasPrice(0);
  }

  @Test
  void testSetDisableKRSEmail() {
    generateWalletRequest.setDisableKRSEmail(Boolean.TRUE);
  }

  @Test
  void testSetWalletVersion() {
    generateWalletRequest.setWalletVersion(0);
  }
}
