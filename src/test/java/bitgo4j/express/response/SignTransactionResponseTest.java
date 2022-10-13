package bitgo4j.express.response;

import bitgo4j.express.common.HalfSigned;
import bitgo4j.express.common.TxInfoResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SignTransactionResponseTest {
  @Mock TxInfoResponse txInfo;

  @InjectMocks SignTransactionResponse signTransactionResponse;

  @Test
  void testToString() {
    String result = signTransactionResponse.toString();
    String expected = "SignTransactionResponse[txInfo=txInfo]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxInfo() {
    signTransactionResponse.setTxInfo(new TxInfoResponse("txHex", new HalfSigned()));
  }
}