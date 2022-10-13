package bitgo4j.wallet.common;

import bitgo4j.policy.common.SignatureShare;
import bitgo4j.policy.common.UnsignedTransaction;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionTest {
  @Mock UnsignedTransaction unsignedTransaction;

  @Mock List<SignatureShare> signatureShares;

  @InjectMocks Transaction transaction;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

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
