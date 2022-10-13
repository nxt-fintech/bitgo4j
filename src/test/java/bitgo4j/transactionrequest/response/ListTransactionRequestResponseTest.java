package bitgo4j.transactionrequest.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTransactionRequestResponseTest {
  @Mock List<TransactionRequestResponse> txRequests;

  @InjectMocks ListTransactionRequestResponse listTransactionRequestResponse;

  @Test
  void testToString() {
    String result = listTransactionRequestResponse.toString();
    Assertions.assertEquals(
        "ListTransactionRequestResponse[txRequests=txRequests,nextBatchPrevId=<null>]", result);
  }

  @Test
  void testSetTxRequests() {
    listTransactionRequestResponse.setTxRequests(List.of(new TransactionRequestResponse()));
  }

  @Test
  void testSetNextBatchPrevId() {
    listTransactionRequestResponse.setNextBatchPrevId("nextBatchPrevId");
  }
}
