package bitgo4j.transactionrequest.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateTransactionRequestRequestTest {
  UpdateTransactionRequestRequest updateTransactionRequestRequest =
      new UpdateTransactionRequestRequest("state");

  @Test
  void testToString() {
    String result = updateTransactionRequestRequest.toString();
    Assertions.assertEquals("UpdateTransactionRequestRequest[state=state]", result);
  }

  @Test
  void testSetState() {
    updateTransactionRequestRequest.setState("state");
  }
}
