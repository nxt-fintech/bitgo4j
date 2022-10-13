package bitgo4j.enterprise.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnterpriseWalletLimitResponseTest {
  EnterpriseWalletLimitResponse enterpriseWalletLimitResponse = new EnterpriseWalletLimitResponse();

  @Test
  void testToString() {
    String result = enterpriseWalletLimitResponse.toString();
    Assertions.assertEquals(
        "EnterpriseWalletLimitResponse[coin=<null>,limit=<null>,count=<null>,isCustodial=<null>]",
        result);
  }

  @Test
  void testSetCoin() {
    enterpriseWalletLimitResponse.setCoin("coin");
  }

  @Test
  void testSetLimit() {
    enterpriseWalletLimitResponse.setLimit(0L);
  }

  @Test
  void testSetCount() {
    enterpriseWalletLimitResponse.setCount(0L);
  }

  @Test
  void testSetIsCustodial() {
    enterpriseWalletLimitResponse.setIsCustodial(Boolean.TRUE);
  }
}
