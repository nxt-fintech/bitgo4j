package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HalfSignedTest {
  HalfSigned halfSigned = new HalfSigned();

  @Test
  void testToString() {
    String result = halfSigned.toString();
    String expected =
        "HalfSigned[contractSequenceId=<null>,expireTime=<null>,gasLimit=<null>,gasPrice=<null>,operationHash=<null>,signature=<null>,tokenContractAddress=<null>,walletId=<null>,txBase64=<null>,txHex=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetContractSequenceId() {
    halfSigned.setContractSequenceId(0);
  }

  @Test
  void testSetExpireTime() {
    halfSigned.setExpireTime(0);
  }

  @Test
  void testSetGasLimit() {
    halfSigned.setGasLimit(0);
  }

  @Test
  void testSetGasPrice() {
    halfSigned.setGasPrice(0);
  }

  @Test
  void testSetOperationHash() {
    halfSigned.setOperationHash("operationHash");
  }

  @Test
  void testSetSignature() {
    halfSigned.setSignature("signature");
  }

  @Test
  void testSetTokenContractAddress() {
    halfSigned.setTokenContractAddress("tokenContractAddress");
  }

  @Test
  void testSetWalletId() {
    halfSigned.setWalletId("walletId");
  }

  @Test
  void testSetTxBase64() {
    halfSigned.setTxBase64("txBase64");
  }

  @Test
  void testSetTxHex() {
    halfSigned.setTxHex("txHex");
  }
}
