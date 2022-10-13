package bitgo4j.transactionrequest.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnableTokenTest {
  EnableToken enableToken = new EnableToken();

  @Test
  void testToString() {
    String result = enableToken.toString();
    Assertions.assertEquals("EnableToken[name=<null>,address=<null>]", result);
  }

  @Test
  void testSetName() {
    enableToken.setName("name");
  }

  @Test
  void testSetAddress() {
    enableToken.setAddress("address");
  }
}
