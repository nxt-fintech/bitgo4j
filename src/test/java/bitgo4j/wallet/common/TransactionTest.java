package bitgo4j.wallet.common;

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
        "Transaction[state=<null>,unsignedTransaction=<null>,signatureShares=<null>,txHash=<null>]",
        result);
  }

  @Test
  void testSetState() {
    transaction.setState("state");
  }

  @Test
  void testSetUnsignedTransaction() {
    transaction.setUnsignedTransaction(new UnsignedTransaction());
  }

  @Test
  void testSetSignatureShares() {
    transaction.setSignatureShares(List.of(new SignatureShare()));
  }

  @Test
  void testSetTxHash() {
    transaction.setTxHash("txHash");
  }
}
