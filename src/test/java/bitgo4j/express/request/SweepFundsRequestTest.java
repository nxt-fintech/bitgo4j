package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SweepFundsRequestTest {
  SweepFundsRequest sweepFundsRequest =
      new SweepFundsRequest(
          "address",
          "walletPassphrase",
          "xprv",
          "otp",
          "feeTxConfirmTarget",
          "feeRate",
          "maxFeeRate",
          Boolean.TRUE);

  @Test
  void testToString() {
    String result = sweepFundsRequest.toString();
    String expected =
        "SweepFundsRequest[address=address,walletPassphrase=walletPassphrase,xprv=xprv,otp=otp,feeTxConfirmTarget=feeTxConfirmTarget,feeRate=feeRate,maxFeeRate=maxFeeRate,allowPartialSweep=true]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    sweepFundsRequest.setAddress("address");
  }

  @Test
  void testSetWalletPassphrase() {
    sweepFundsRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetXprv() {
    sweepFundsRequest.setXprv("xprv");
  }

  @Test
  void testSetOtp() {
    sweepFundsRequest.setOtp("otp");
  }

  @Test
  void testSetFeeTxConfirmTarget() {
    sweepFundsRequest.setFeeTxConfirmTarget("feeTxConfirmTarget");
  }

  @Test
  void testSetFeeRate() {
    sweepFundsRequest.setFeeRate("feeRate");
  }

  @Test
  void testSetMaxFeeRate() {
    sweepFundsRequest.setMaxFeeRate("maxFeeRate");
  }

  @Test
  void testSetAllowPartialSweep() {
    sweepFundsRequest.setAllowPartialSweep(Boolean.TRUE);
  }
}
