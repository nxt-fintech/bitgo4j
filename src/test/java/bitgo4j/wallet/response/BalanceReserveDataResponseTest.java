package bitgo4j.wallet.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalanceReserveDataResponseTest {
  BalanceReserveDataResponse balanceReserveDataResponse = new BalanceReserveDataResponse();

  @Test
  void testToString() {
    String result = balanceReserveDataResponse.toString();
    String expected =
        "BalanceReserveDataResponse[baseFee=<null>,baseReserve=<null>,reserve=<null>,minimumFunding=<null>,height=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetBaseFee() {
    balanceReserveDataResponse.setBaseFee("baseFee");
  }

  @Test
  void testSetBaseReserve() {
    balanceReserveDataResponse.setBaseReserve("baseReserve");
  }

  @Test
  void testSetReserve() {
    balanceReserveDataResponse.setReserve("reserve");
  }

  @Test
  void testSetMinimumFunding() {
    balanceReserveDataResponse.setMinimumFunding("minimumFunding");
  }

  @Test
  void testSetHeight() {
    balanceReserveDataResponse.setHeight(0L);
  }
}
