package bitgo4j.transactionrequest.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SignatureShareResponseTest {
  SignatureShareResponse signatureShareResponse = new SignatureShareResponse();

  @Test
  void testToString() {
    String result = signatureShareResponse.toString();
    Assertions.assertEquals("SignatureShareResponse[from=<null>,to=<null>,share=<null>]", result);
  }

  @Test
  void testSetFrom() {
    signatureShareResponse.setFrom("from");
  }

  @Test
  void testSetTo() {
    signatureShareResponse.setTo("to");
  }

  @Test
  void testSetShare() {
    signatureShareResponse.setShare("share");
  }
}
