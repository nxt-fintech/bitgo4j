package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Balance;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTotalBalancesResponseTest {
  @Mock List<Balance> balances;

  @InjectMocks ListTotalBalanceResponse listTotalBalancesResponse;

  @Test
  void testToString() {
    String result = listTotalBalancesResponse.toString();
    String expected = "ListTotalBalanceResponse[balances=balances]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetBalances() {
    listTotalBalancesResponse.setBalances(List.of(new Balance()));
  }
}
