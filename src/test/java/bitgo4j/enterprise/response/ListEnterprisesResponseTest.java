package bitgo4j.enterprise.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListEnterprisesResponseTest {
  @Mock List<EnterpriseResponse> enterprises;

  @InjectMocks ListEnterprisesResponse listEnterprisesResponse;

  @Test
  void testToString() {
    String result = listEnterprisesResponse.toString();
    Assertions.assertEquals("ListEnterprisesResponse[enterprises=enterprises]", result);
  }

  @Test
  void testSetEnterprises() {
    listEnterprisesResponse.setEnterprises(List.of(new EnterpriseResponse()));
  }
}
