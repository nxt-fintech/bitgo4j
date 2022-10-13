package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnsignedTransactionTest {
  @Mock FeeInfo feeInfo;

  @InjectMocks UnsignedTransaction unsignedTransaction;

  @Test
  void testToString() {
    String result = unsignedTransaction.toString();
    Assertions.assertEquals(
        "UnsignedTransaction[serializedTxHex=<null>,signableHex=<null>,derivationPath=<null>,feeInfo=feeInfo]",
        result);
  }

  @Test
  void testSetSerializedTxHex() {
    unsignedTransaction.setSerializedTxHex("serializedTxHex");
  }

  @Test
  void testSetSignableHex() {
    unsignedTransaction.setSignableHex("signableHex");
  }

  @Test
  void testSetDerivationPath() {
    unsignedTransaction.setDerivationPath("derivationPath");
  }

  @Test
  void testSetFeeInfo() {
    unsignedTransaction.setFeeInfo(new FeeInfo());
  }
}
