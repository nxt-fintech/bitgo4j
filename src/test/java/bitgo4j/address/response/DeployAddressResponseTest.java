package bitgo4j.address.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeployAddressResponseTest {
  DeployAddressResponse deployAddressResponse = new DeployAddressResponse();

  @Test
  void testToString() {
    String result = deployAddressResponse.toString();
    String expected = "DeployAddressResponse[txId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxId() {
    deployAddressResponse.setTxId("txId");
  }
}
