package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Transfer;
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
class ListTransferResponseTest {
  @Mock List<Transfer> transfers;

  @InjectMocks ListTransferResponse listTransferResponse;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = listTransferResponse.toString();
    Assertions.assertEquals(
        "ListTransferResponse[transfers=transfers,coin=<null>,nextBatchPrevId=<null>]", result);
  }

  @Test
  void testSetTransfers() {
    listTransferResponse.setTransfers(List.of(new Transfer()));
  }

  @Test
  void testSetCoin() {
    listTransferResponse.setCoin("coin");
  }

  @Test
  void testSetNextBatchPrevId() {
    listTransferResponse.setNextBatchPrevId("nextBatchPrevId");
  }
}
