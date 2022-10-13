package bitgo4j.express.request;

import bitgo4j.express.common.Asset;
import bitgo4j.express.common.FeeInfo;
import bitgo4j.express.common.Keychain;
import bitgo4j.express.common.Operation;
import bitgo4j.express.common.TxInfoRequest;
import bitgo4j.express.common.TxPrebuild;
import bitgo4j.express.common.Unspent;
import bitgo4j.express.common.WalletAddressDetails;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SignWalletTransactionRequestTest {
  @Mock Keychain keychain;

  @Mock TxPrebuild txPrebuild;

  @InjectMocks SignWalletTransactionRequest signWalletTransactionRequest;

  @Test
  void testToString() {
    String result = signWalletTransactionRequest.toString();
    String expected =
        "SignWalletTransactionRequest[keychain=keychain,prv=<null>,txPrebuild=txPrebuild,coldDerivationSeed=<null>,walletPassphrase=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetKeychain() {
    signWalletTransactionRequest.setKeychain(new Keychain());
  }

  @Test
  void testSetPrv() {
    signWalletTransactionRequest.setPrv("prv");
  }

  @Test
  void testSetTxPrebuild() {
    signWalletTransactionRequest.setTxPrebuild(
        new TxPrebuild(
            "wallet",
            "txHex",
            "txBase64",
            new TxInfoRequest(
                List.of("String"),
                0,
                0,
                List.of(new Unspent()),
                new WalletAddressDetails(),
                0,
                List.of(new Operation("amount", new Asset(), "destination", "type")),
                "sequence",
                "source"),
            new FeeInfo(),
            Boolean.TRUE));
  }

  @Test
  void testSetColdDerivationSeed() {
    signWalletTransactionRequest.setColdDerivationSeed("coldDerivationSeed");
  }

  @Test
  void testSetWalletPassphrase() {
    signWalletTransactionRequest.setWalletPassphrase("walletPassphrase");
  }
}
