package bitgo4j.transfer.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTransfersResponseTest {
  @InjectMocks ListTransferResponse listTransfersResponse;

  @Test
  void testToString() {
    String result = listTransfersResponse.toString();
    String expected =
        "ListTransferResponse[transfers=<null>,coin=<null>,nextBatchPrevId=<null>]";
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
