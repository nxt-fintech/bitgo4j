package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Unspent;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnspentsResponseTest {
  @Mock List<Unspent> unspents;

  @InjectMocks UnspentsResponse unspentsResponse;

  @Test
  void testToString() {
    String result = unspentsResponse.toString();
    String expected = "UnspentsResponse[coin=<null>,unspents=unspents]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoin() {
    unspentsResponse.setCoin("coin");
  }

  @Test
  void testSetUnspents() {
    unspentsResponse.setUnspents(List.of(new Unspent()));
  }
}
