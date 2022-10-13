package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TxAddressTest {
  TxAddress txAddress = new TxAddress();

  @Test
  void testToString() {
    String result = txAddress.toString();
    Assertions.assertEquals("TxAddress[address=<null>]", result);
  }

  @Test
  void testSetAddress() {
    txAddress.setAddress("address");
  }
}
