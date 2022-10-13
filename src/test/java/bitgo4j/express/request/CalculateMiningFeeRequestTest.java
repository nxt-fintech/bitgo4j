package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateMiningFeeRequestTest {
  CalculateMiningFeeRequest calculateMiningFeeRequest =
      new CalculateMiningFeeRequest(0, 0, 0, 0, 0);

  @Test
  void testToString() {
    String result = calculateMiningFeeRequest.toString();
    String expected =
        "CalculateMiningFeeRequest[feeRate=0,nP2shInputs=0,nP2pkhInputs=0,nP2shP2wshInputs=0,nOutputs=0]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetFeeRate() {
    calculateMiningFeeRequest.setFeeRate(0);
  }

  @Test
  void testSetNP2shInputs() {
    calculateMiningFeeRequest.setNP2shInputs(0);
  }

  @Test
  void testSetNP2pkhInputs() {
    calculateMiningFeeRequest.setNP2pkhInputs(0);
  }

  @Test
  void testSetNP2shP2wshInputs() {
    calculateMiningFeeRequest.setNP2shP2wshInputs(0);
  }

  @Test
  void testSetNOutputs() {
    calculateMiningFeeRequest.setNOutputs(0);
  }
}