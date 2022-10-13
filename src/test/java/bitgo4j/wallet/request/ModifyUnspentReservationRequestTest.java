package bitgo4j.wallet.request;

import bitgo4j.wallet.common.Changes;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ModifyUnspentReservationRequestTest {
  @Mock List<String> unspentIds;

  @Mock Changes changes;

  @InjectMocks ModifyUnspentReservationRequest modifyUnspentReservationRequest;

  @Test
  void testToString() {
    String result = modifyUnspentReservationRequest.toString();
    String expected = "ModifyUnspentReservationRequest[unspentIds=unspentIds,changes=changes]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUnspentIds() {
    modifyUnspentReservationRequest.setUnspentIds(List.of("String"));
  }

  @Test
  void testSetChanges() {
    modifyUnspentReservationRequest.setChanges(new Changes("expireTime"));
  }
}
