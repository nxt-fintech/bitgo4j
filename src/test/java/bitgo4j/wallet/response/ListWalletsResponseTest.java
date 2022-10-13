package bitgo4j.wallet.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListWalletsResponseTest {
  @Mock List<WalletResponse> wallets;

  @InjectMocks ListWalletResponse listWalletsResponse;

  @Test
  void testToString() {
    String result = listWalletsResponse.toString();
    String expected = "ListWalletResponse[wallets=wallets,nextBatchPrevId=<null>,coin=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetWallets() {
    listWalletsResponse.setWallets(List.of(new WalletResponse()));
  }

  @Test
  void testSetNextBatchPrevId() {
    listWalletsResponse.setNextBatchPrevId("nextBatchPrevId");
  }

  @Test
  void testSetCoin() {
    listWalletsResponse.setCoin("coin");
  }
}