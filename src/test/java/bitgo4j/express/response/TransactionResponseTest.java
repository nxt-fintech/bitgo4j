package bitgo4j.express.response;

import bitgo4j.transfer.response.TransferResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionResponseTest {
  @Mock TransferResponse transfer;

  @InjectMocks TransactionResponse transactionResponse;

  @Test
  void testToString() {
    String result = transactionResponse.toString();
    String expected = "TransactionResponse[txid=<null>,tx=<null>,status=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTransfer() {
    transactionResponse.setTransfer(new TransferResponse());
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
