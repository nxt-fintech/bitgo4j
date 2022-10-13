package bitgo4j.address.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForwardTokensFromAddressResponseTest {
  ForwardTokensFromAddressResponse forwardTokensFromAddressResponse =
      new ForwardTokensFromAddressResponse();

  @Test
  void testToString() {
    String result = forwardTokensFromAddressResponse.toString();
    String expected = "ForwardTokensFromAddressResponse[txId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxId() {
    forwardTokensFromAddressResponse.setTxId("txId");
  }
}
