package bitgo4j.transfer.request;

import bitgo4j.transfer.common.Eip1559;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChangeFeeRequestTest {
  @Mock Eip1559 eip1559;

  @InjectMocks ChangeFeeRequest changeFeeRequest;

  @Test
  void testToString() {
    String result = changeFeeRequest.toString();
    String expected = "ChangeFeeRequest[txid=<null>,fee=<null>,eip1559=eip1559]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxid() {
    changeFeeRequest.setTxid("txid");
  }

  @Test
  void testSetFee() {
    changeFeeRequest.setFee(0);
  }

  @Test
  void testSetEip1559() {
    changeFeeRequest.setEip1559(
        new Eip1559(
            "baseFee",
            "gasUsedRatio",
            "safeLowMinerTip",
            "normalMinerTip",
            "standardMinerTip",
            "fastestMinerTip",
            "ludicrousMinerTip"));
  }
}
