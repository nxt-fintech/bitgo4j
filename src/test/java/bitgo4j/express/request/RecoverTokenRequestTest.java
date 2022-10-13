package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecoverTokenRequestTest {
  RecoverTokenRequest recoverTokenRequest =
      new RecoverTokenRequest("tokenContractAddress", "recipient", "walletPassphrase", "prv");

  @Test
  void testToString() {
    String result = recoverTokenRequest.toString();
    String expected =
        "RecoverTokenRequest[tokenContractAddress=tokenContractAddress,recipient=recipient,walletPassphrase=walletPassphrase,prv=prv]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTokenContractAddress() {
    recoverTokenRequest.setTokenContractAddress("tokenContractAddress");
  }

  @Test
  void testSetRecipient() {
    recoverTokenRequest.setRecipient("recipient");
  }

  @Test
  void testSetWalletPassphrase() {
    recoverTokenRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetPrv() {
    recoverTokenRequest.setPrv("prv");
  }
}
