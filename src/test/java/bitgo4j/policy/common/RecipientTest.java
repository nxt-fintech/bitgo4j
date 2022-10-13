package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecipientTest {
  Recipient recipient = new Recipient();

  @Test
  void testToString() {
    String result = recipient.toString();
    Assertions.assertEquals("Recipient[address=<null>,amount=<null>,data=<null>]", result);
  }

  @Test
  void testSetAddress() {
    recipient.setAddress("address");
  }

  @Test
  void testSetAmount() {
    recipient.setAmount("amount");
  }

  @Test
  void testSetData() {
    recipient.setData("data");
  }
}
