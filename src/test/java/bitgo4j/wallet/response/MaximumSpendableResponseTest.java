package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSpendableResponseTest {
  MaximumSpendableResponse maximumSpendableResponse = new MaximumSpendableResponse();

  @Test
  void testToString() {
    String result = maximumSpendableResponse.toString();
    String expected = "MaximumSpendableResponse[coin=<null>,maximumSpndable=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoin() {
    maximumSpendableResponse.setCoin("coin");
  }

  @Test
  void testSetMaximumSpendable() {
    maximumSpendableResponse.setMaximumSpendable("maximumSpendable");
  }
}
