package bitgo4j.wallet.request;

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
class MakeUnspentReservationRequestTest {
  @Mock List<String> unspentIds;
  @InjectMocks MakeUnspentReservationRequest makeUnspentReservationRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = makeUnspentReservationRequest.toString();
    Assertions.assertEquals(
        "MakeUnspentReservationRequest[unspentIds=unspentIds,expireTime=<null>]", result);
  }

  @Test
  void testSetUnspentIds() {
    makeUnspentReservationRequest.setUnspentIds(List.of("String"));
  }

  @Test
  void testSetExpireTime() {
    makeUnspentReservationRequest.setExpireTime("expireTime");
  }
}
