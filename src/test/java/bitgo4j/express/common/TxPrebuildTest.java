package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TxPrebuildTest {
  @Mock TxInfoRequest txInfo;

  @Mock FeeInfo feeInfo;

  @InjectMocks TxPrebuild txPrebuild;

  @Test
  void testToString() {
    String result = txPrebuild.toString();
    String expected =
        "TxPrebuild[wallet=<null>,txHex=<null>,txBase64=<null>,txInfo=txInfo,feeInfo=feeInfo,isLastSignature=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetWallet() {
    txPrebuild.setWallet("wallet");
  }

  @Test
  void testSetTxHex() {
    txPrebuild.setTxHex("txHex");
  }

  @Test
  void testSetTxBase64() {
    txPrebuild.setTxBase64("txBase64");
  }

  @Test
  void testSetTxInfo() {
    txPrebuild.setTxInfo(
        new TxInfoRequest(
            List.of("String"),
            0,
            0,
            List.of(new Unspent()),
            new WalletAddressDetails(),
            0,
            List.of(new Operation("amount", new Asset(), "destination", "type")),
            "sequence",
            "source"));
  }

  @Test
  void testSetFeeInfo() {
    txPrebuild.setFeeInfo(new FeeInfo());
  }

  @Test
  void testSetIsLastSignature() {
    txPrebuild.setIsLastSignature(Boolean.TRUE);
  }
}
