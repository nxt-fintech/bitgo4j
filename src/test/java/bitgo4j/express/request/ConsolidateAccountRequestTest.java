package bitgo4j.express.request;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ConsolidateAccountRequestTest {
  @Mock List<String> consolidateAddresses;

  @InjectMocks ConsolidateAccountRequest consolidateAccountRequest;

  @Test
  void testToString() {
    String result = consolidateAccountRequest.toString();
    String expected = "ConsolidateAccountRequest[consolidateAddresses=consolidateAddresses]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetConsolidateAddresses() {
    consolidateAccountRequest.setConsolidateAddresses(List.of("String"));
  }
}
