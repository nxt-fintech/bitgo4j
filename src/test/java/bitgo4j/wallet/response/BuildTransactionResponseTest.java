package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuildTransactionResponseTest {
  BuildTransactionResponse buildTransactionResponse = new BuildTransactionResponse();

  @Test
  void testToString() {
    String result = buildTransactionResponse.toString();
    String expected = "BuildTransactionResponse[keyDerivationPath=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetKeyDerivationPath() {
    buildTransactionResponse.setKeyDerivationPath("keyDerivationPath");
  }
}
