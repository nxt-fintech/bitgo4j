package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WalletUpdateCoinSpecificEthTest {
  WalletUpdateCoinSpecificEth walletUpdateCoinSpecificEth = new WalletUpdateCoinSpecificEth();

  @Test
  void testToString() {
    String result = walletUpdateCoinSpecificEth.toString();
    Assertions.assertEquals(
        "WalletUpdateCoinSpecificEth[deployForwardersManually=<null>,flushForwardersManually=<null>]",
        result);
  }

  @Test
  void testSetDeployForwardersManually() {
    walletUpdateCoinSpecificEth.setDeployForwardersManually(Boolean.TRUE);
  }

  @Test
  void testSetFlushForwardersManually() {
    walletUpdateCoinSpecificEth.setFlushForwardersManually(Boolean.TRUE);
  }
}
