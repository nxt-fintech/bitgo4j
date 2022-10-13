package bitgo4j.policy.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionTest {
  @Mock UnsignedTransaction unsignedTransaction;

  @Mock List<SignatureShare> signatureShares;

  @InjectMocks Transaction transaction;

  @Test
  void testToString() {
    String result = transaction.toString();
    Assertions.assertEquals(
        "Transaction[state=<null>,unsignedTransaction=unsignedTransaction,signatureShares=signatureShares,txHash=<null>]",
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
