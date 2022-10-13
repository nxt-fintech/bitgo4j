package bitgo4j.wallet.response;

import bitgo4j.wallet.common.UnspentReservation;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnspentReservationResponseTest {
  @Mock List<UnspentReservation> unspents;

  @InjectMocks UnspentReservationResponse unspentReservationResponse;

  @Test
  void testToString() {
    String result = unspentReservationResponse.toString();
    String expected = "UnspentReservationResponse[unspents=unspents,nextBatchPrevId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUnspents() {
    unspentReservationResponse.setUnspents(List.of(new UnspentReservation()));
  }

  @Test
  void testSetNextBatchPrevId() {
    unspentReservationResponse.setNextBatchPrevId("nextBatchPrevId");
  }
}