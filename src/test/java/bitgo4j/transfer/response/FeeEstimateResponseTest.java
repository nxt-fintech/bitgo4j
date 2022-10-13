package bitgo4j.transfer.response;

import bitgo4j.transfer.common.Eip1559;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FeeEstimateResponseTest {
  @Mock Eip1559 eip1559;

  @InjectMocks FeeEstimateResponse feeEstimateResponse;

  @Test
  void testToString() {
    String result = feeEstimateResponse.toString();
    Assertions.assertEquals(
        "FeeEstimateResponse[feePerKb=<null>,cpfpFeePerKb=<null>,numBlocks=<null>,confidence=<null>,multiplier=<null>,feeEstimate=<null>,gasLimitEstimate=<null>,minGasPrice=<null>,minGasLimit=<null>,maxGasLimit=<null>,minGasIncreaseBy=<null>,eip1559=eip1559]",
        result);
  }

  @Test
  void testSetFeePerKb() {
    feeEstimateResponse.setFeePerKb(0);
  }

  @Test
  void testSetCpfpFeePerkb() {
    feeEstimateResponse.setCpfpFeePerkb(0);
  }

  @Test
  void testSetNumBlocks() {
    feeEstimateResponse.setNumBlocks(0);
  }

  @Test
  void testSetConfidence() {
    feeEstimateResponse.setConfidence(0);
  }

  @Test
  void testSetMultiplier() {
    feeEstimateResponse.setMultiplier(0);
  }

  @Test
  void testSetFeeEstimate() {
    feeEstimateResponse.setFeeEstimate("feeEstimate");
  }

  @Test
  void testSetGasLimitEstimate() {
    feeEstimateResponse.setGasLimitEstimate("gasLimitEstimate");
  }

  @Test
  void testSetMinGasPrice() {
    feeEstimateResponse.setMinGasPrice("minGasPrice");
  }

  @Test
  void testSetMinGasLimit() {
    feeEstimateResponse.setMinGasLimit("minGasLimit");
  }

  @Test
  void testSetMaxGasLimit() {
    feeEstimateResponse.setMaxGasLimit("maxGasLimit");
  }

  @Test
  void testSetMinGasIncreaseBy() {
    feeEstimateResponse.setMinGasIncreaseBy("minGasIncreaseBy");
  }

  @Test
  void testSetEip1559() {
    feeEstimateResponse.setEip1559(
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
