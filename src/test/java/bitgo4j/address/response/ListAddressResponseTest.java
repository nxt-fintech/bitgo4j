package bitgo4j.address.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListAddressResponseTest {
  @Mock List<AddressResponse> addresses;

  @InjectMocks ListAddressResponse listAddressResponse;

  @Test
  void testToString() {
    String result = listAddressResponse.toString();
    String expected =
        "ListAddressResponse[coin=<null>,totalAddressCount=<null>,pendingAddressCount=<null>,addresses=addresses,nextBatchPrevId=<null>,count=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoin() {
    listAddressResponse.setCoin("coin");
  }

  @Test
  void testSetTotalAddressCount() {
    listAddressResponse.setTotalAddressCount(0L);
  }

  @Test
  void testSetPendingAddressCount() {
    listAddressResponse.setPendingAddressCount(0L);
  }

  @Test
  void testSetAddresses() {
    listAddressResponse.setAddresses(List.of(new AddressResponse()));
  }

  @Test
  void testSetNextBatchPrevId() {
    listAddressResponse.setNextBatchPrevId("nextBatchPrevId");
  }

  @Test
  void testSetCount() {
    listAddressResponse.setCount(0L);
  }
}
