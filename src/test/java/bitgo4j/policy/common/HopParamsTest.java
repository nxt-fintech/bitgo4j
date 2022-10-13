package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HopParamsTest {
  HopParams hopParams = new HopParams();

  @Test
  void testToString() {
    String result = hopParams.toString();
    Assertions.assertEquals(
        "HopParams[paymentId=<null>,userRegSig=<null>,gasPriceMax=<null>]", result);
  }

  @Test
  void testSetPaymentId() {
    hopParams.setPaymentId("paymentId");
  }

  @Test
  void testSetUserRegSig() {
    hopParams.setUserRegSig("userRegSig");
  }

  @Test
  void testSetGasPriceMax() {
    hopParams.setGasPriceMax(0);
  }
}
