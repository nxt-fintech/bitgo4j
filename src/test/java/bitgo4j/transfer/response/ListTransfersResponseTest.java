package bitgo4j.transfer.response;

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
class ListTransfersResponseTest {
  @Mock List<TransferResponse> transfers;
  @InjectMocks ListTransferResponse listTransfersResponse;

  @Test
  void testToString() {
    String result = listTransfersResponse.toString();
    String expected =
        "ListTransferResponse[transfers=transfers,coin=<null>,nextBatchPrevId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTransfers() {
    listTransfersResponse.setTransfers(List.of(new TransferResponse()));
  }

  @Test
  void testSetCoin() {
    listTransfersResponse.setCoin("coin");
  }

  @Test
  void testSetNextBatchPrevId() {
    listTransfersResponse.setNextBatchPrevId("nextBatchPrevId");
  }
}
