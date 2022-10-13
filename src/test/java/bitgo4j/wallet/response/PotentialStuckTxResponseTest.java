package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PotentialStuckTxResponseTest {
  PotentialStuckTxsResponse potentialStuckTxResponse = new PotentialStuckTxsResponse();

  @Test
  void testToString() {
    String result = potentialStuckTxResponse.toString();
    Assertions.assertEquals(
        "PotentialStuckTxsResponse[nonce=<null>,cause=<null>,message=<null>]", result);
  }

  @Test
  void testSetNonce() {
    potentialStuckTxResponse.setNonce("nonce");
  }

  @Test
  void testSetCause() {
    potentialStuckTxResponse.setCause("cause");
  }

  @Test
  void testSetMessage() {
    potentialStuckTxResponse.setMessage("message");
  }
}
