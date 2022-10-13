package bitgo4j.express.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsolidateAccountResponseTest {
  ConsolidateAccountResponse consolidateAccountResponse = new ConsolidateAccountResponse();

  @Test
  void testToString() {
    String result = consolidateAccountResponse.toString();
    String expected = "ConsolidateAccountResponse[keyDerivationPath=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetKeyDerivationPath() {
    consolidateAccountResponse.setKeyDerivationPath("keyDerivationPath");
  }
}
