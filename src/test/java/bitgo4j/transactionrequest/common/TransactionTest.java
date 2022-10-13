package bitgo4j.transactionrequest.common;

import bitgo4j.transactionrequest.response.SignatureShareResponse;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionTest {
  @InjectMocks Transaction transaction;

  @Test
  void testToString() {
    String result = transaction.toString();
    Assertions.assertEquals(
        "Transaction[state=<null>,unsignedTx=<null>,signatureShares=<null>,txHash=<null>]", result);
  }

  @Test
  void testSetState() {
    transaction.setState("state");
  }

  @Test
  void testSetUnsignedTx() {
    transaction.setUnsignedTx(List.of(new UnsignedTransaction()));
  }

  @Test
  void testSetSignatureShares() {
    transaction.setSignatureShares(List.of(new SignatureShareResponse()));
  }

  @Test
  void testSetTxHash() {
    transaction.setTxHash("txHash");
  }
}
