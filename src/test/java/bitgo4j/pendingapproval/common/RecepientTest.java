package bitgo4j.pendingapproval.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecepientTest {
  Recepient recepient = new Recepient();

  @Test
  void testToString() {
    String result = recepient.toString();
    Assertions.assertEquals("Recepient[address=<null>,amount=<null>,data=<null>]", result);
  }

  @Test
  void testSetAddress() {
    recepient.setAddress("address");
  }

  @Test
  void testSetAmount() {
    recepient.setAmount("amount");
  }

  @Test
  void testSetData() {
    recepient.setData("data");
  }
}
