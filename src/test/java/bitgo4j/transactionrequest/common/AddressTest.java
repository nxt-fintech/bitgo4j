package bitgo4j.transactionrequest.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressTest {
  Address address = new Address();

  @Test
  void testToString() {
    String result = address.toString();
    Assertions.assertEquals("Address[address=<null>]", result);
  }

  @Test
  void testSetAddress() {
    address.setAddress("address");
  }
}
