package bitgo4j.express.response;

import bitgo4j.express.common.Transfer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionResponseTest {
  @InjectMocks TransactionResponse transactionResponse;

  @Test
  void testToString() {
    String result = transactionResponse.toString();
    String expected = "TransactionResponse[txid=<null>,tx=<null>,status=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTransfer() {
    transactionResponse.setTransfer(new Transfer());
  }

  @Test
  void testSetTxid() {
    transactionResponse.setTxid("txid");
  }

  @Test
  void testSetTx() {
    transactionResponse.setTx("tx");
  }

  @Test
  void testSetStatus() {
    transactionResponse.setStatus("status");
  }
}
