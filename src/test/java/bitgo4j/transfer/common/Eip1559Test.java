package bitgo4j.transfer.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class Eip1559Test {
  Eip1559 eip1559 =
      new Eip1559(
          "baseFee",
          "gasUsedRatio",
          "safeLowMinerTip",
          "normalMinerTip",
          "standardMinerTip",
          "fastestMinerTip",
          "ludicrousMinerTip");

  @Test
  void testToString() {
    String result = eip1559.toString();
    Assertions.assertEquals(
        "Eip1559[baseFee=baseFee,gasUsedRatio=gasUsedRatio,safeLowMinerTip=safeLowMinerTip,normalMinerTip=normalMinerTip,standardMinerTip=standardMinerTip,fastestMinerTip=fastestMinerTip,ludicrousMinerTip=ludicrousMinerTip]",
        result);
  }

  @Test
  void testSetBaseFee() {
    eip1559.setBaseFee("baseFee");
  }

  @Test
  void testSetGasUsedRatio() {
    eip1559.setGasUsedRatio("gasUsedRatio");
  }

  @Test
  void testSetSafeLowMinerTip() {
    eip1559.setSafeLowMinerTip("safeLowMinerTip");
  }

  @Test
  void testSetNormalMinerTip() {
    eip1559.setNormalMinerTip("normalMinerTip");
  }

  @Test
  void testSetStandardMinerTip() {
    eip1559.setStandardMinerTip("standardMinerTip");
  }

  @Test
  void testSetFastestMinerTip() {
    eip1559.setFastestMinerTip("fastestMinerTip");
  }

  @Test
  void testSetLudicrousMinerTip() {
    eip1559.setLudicrousMinerTip("ludicrousMinerTip");
  }
}
