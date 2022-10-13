package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnsignedTransactionTest {
  @Mock FeeInfo feeInfo;

  @InjectMocks UnsignedTransaction unsignedTransaction;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

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
