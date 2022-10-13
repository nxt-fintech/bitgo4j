package bitgo4j.transactionrequest.request;

import bitgo4j.transactionrequest.response.SignatureShareResponse;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SignatureShareRequestTest {
  @Mock SignatureShareResponse signatureShare;

  @Mock List<SignatureShareResponse> signatureShares;

  @InjectMocks SignatureShareRequest signatureShareRequest;

  @Test
  void testToString() {
    String result = signatureShareRequest.toString();
    Assertions.assertEquals(
        "SignatureShareRequest[signatureShare=signatureShare,signatureShares=signatureShares,signerShare=<null>]",
        result);
  }

  @Test
  void testSetSignatureShare() {
    signatureShareRequest.setSignatureShare(new SignatureShareResponse());
  }

  @Test
  void testSetSignatureShares() {
    signatureShareRequest.setSignatureShares(List.of(new SignatureShareResponse()));
  }

  @Test
  void testSetSignerShare() {
    signatureShareRequest.setSignerShare("signerShare");
  }
}
