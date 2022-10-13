package bitgo4j.wallet.response;

import bitgo4j.wallet.common.BalanceData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StakedBalanceDataResponseTest {
  @Mock List<BalanceData> balances;

  @InjectMocks StakedBalanceDataResponse stakedBalanceData;

  @Test
  void testToString() {
    String result = stakedBalanceData.toString();
    String expected = "StakedBalanceDataResponse[address=<null>,balances=balances]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    stakedBalanceData.setAddress("address");
  }

  @Test
  void testSetBalances() {
    stakedBalanceData.setBalances(List.of(new BalanceData()));
  }
}
