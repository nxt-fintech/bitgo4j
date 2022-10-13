package bitgo4j.walletshare.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListWalletSharesResponseTest {
  @Mock List<WalletShareResponse> incoming;

  @Mock List<WalletShareResponse> outgoing;

  @InjectMocks ListWalletShareResponse listWalletSharesResponse;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = listWalletSharesResponse.toString();
    Assertions.assertEquals("ListWalletShareResponse[incoming=incoming,outgoing=outgoing]", result);
  }

  @Test
  void testSetIncoming() {
    listWalletSharesResponse.setIncoming(List.of(new WalletShareResponse()));
  }

  @Test
  void testSetOutgoing() {
    listWalletSharesResponse.setOutgoing(List.of(new WalletShareResponse()));
  }
}
