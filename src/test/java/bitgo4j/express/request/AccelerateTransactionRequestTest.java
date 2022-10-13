package bitgo4j.express.request;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccelerateTransactionRequestTest {
  @Mock List<String> cpfpTxIds;

  @InjectMocks AccelerateTransactionRequest accelerateTransactionRequest;

  @Test
  void testToString() {
    String result = accelerateTransactionRequest.toString();
    String expected =
        "AccelerateTransactionRequest[cpfpTxIds=cpfpTxIds,cpfpFeeRate=<null>,maxFee=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCpfpTxIds() {
    accelerateTransactionRequest.setCpfpTxIds(List.of("String"));
  }

  @Test
  void testSetCpfpFeeRate() {
    accelerateTransactionRequest.setCpfpFeeRate(0);
  }

  @Test
  void testSetMaxFee() {
    accelerateTransactionRequest.setMaxFee(0);
  }
}
