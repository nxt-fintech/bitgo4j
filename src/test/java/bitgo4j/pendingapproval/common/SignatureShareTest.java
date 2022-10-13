package bitgo4j.pendingapproval.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SignatureShareTest {
  SignatureShare signatureShare = new SignatureShare();

  @Test
  void testToString() {
    String result = signatureShare.toString();
    Assertions.assertEquals("SignatureShare[from=<null>,to=<null>,share=<null>]", result);
  }

  @Test
  void testSetFrom() {
    signatureShare.setFrom("from");
  }

  @Test
  void testSetTo() {
    signatureShare.setTo("to");
  }

  @Test
  void testSetShare() {
    signatureShare.setShare("share");
  }
}
