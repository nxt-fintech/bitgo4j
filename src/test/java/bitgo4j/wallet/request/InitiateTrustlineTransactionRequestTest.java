package bitgo4j.wallet.request;

import bitgo4j.wallet.common.Memo;
import bitgo4j.wallet.common.Trustline;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InitiateTrustlineTransactionRequestTest {
  @Mock Memo memo;

  @Mock List<Trustline> trustlines;

  @InjectMocks InitiateTrustlineTransactionRequest initiateTrustlineTransactionRequest;

  @Test
  void testToString() {
    String result = initiateTrustlineTransactionRequest.toString();
    String expected =
        "InitiateTrustlineTransactionRequest[memo=memo,comment=<null>,trustlines=trustlines]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetMemo() {
    initiateTrustlineTransactionRequest.setMemo(new Memo("type", "value"));
  }

  @Test
  void testSetComment() {
    initiateTrustlineTransactionRequest.setComment("comment");
  }

  @Test
  void testSetTrustlines() {
    initiateTrustlineTransactionRequest.setTrustlines(
        List.of(new Trustline("token", "action", "limit")));
  }
}
