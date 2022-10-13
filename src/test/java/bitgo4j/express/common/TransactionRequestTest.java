package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestTest {
  @Mock CoinSpecific coinSpecific;

  @InjectMocks TransactionRequest transactionRequest;

  @Test
  void testToString() {
    String result = transactionRequest.toString();
    String expected =
        "TransactionRequest[coinSpecific=coinSpecific,comment=<null>,fee=<null>,isUnsigned=<null>,requestedAmount=<null>,sourceWallet=<null>,triggeredPolicy=<null>,validTransaction=<null>,validTransactionHash=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoinSpecific() {
    transactionRequest.setCoinSpecific(new CoinSpecific());
  }

  @Test
  void testSetComment() {
    transactionRequest.setComment("comment");
  }

  @Test
  void testSetFee() {
    transactionRequest.setFee(0);
  }

  @Test
  void testSetIsUnsigned() {
    transactionRequest.setIsUnsigned(Boolean.TRUE);
  }

  @Test
  void testSetRequestedAmount() {
    transactionRequest.setRequestedAmount(0);
  }

  @Test
  void testSetSourceWallet() {
    transactionRequest.setSourceWallet("sourceWallet");
  }

  @Test
  void testSetTriggeredPolicy() {
    transactionRequest.setTriggeredPolicy("triggeredPolicy");
  }

  @Test
  void testSetValidTransaction() {
    transactionRequest.setValidTransaction("validTransaction");
  }

  @Test
  void testSetValidTransactionHash() {
    transactionRequest.setValidTransactionHash("validTransactionHash");
  }
}
