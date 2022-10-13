package bitgo4j.federation.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FederationResponseTest {
  FederationResponse federationResponse = new FederationResponse();

  @Test
  void testToString() {
    String result = federationResponse.toString();
    Assertions.assertEquals(
        "FederationResponse[account_id=<null>,stellar_address=<null>,memo_type=<null>,memo=<null>]",
        result);
  }

  @Test
  void testSetAccount_id() {
    federationResponse.setAccount_id("account_id");
  }

  @Test
  void testSetStellar_address() {
    federationResponse.setStellar_address("stellar_address");
  }

  @Test
  void testSetMemo_type() {
    federationResponse.setMemo_type("memo_type");
  }

  @Test
  void testSetMemo() {
    federationResponse.setMemo("memo");
  }
}
