package bitgo4j.pendingapproval.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnterpriseModificationResponseTest {
  @Mock UpdateEnterpriseRequest updateEnterpriseRequest;

  @InjectMocks EnterpriseModificationResponse enterpriseModificationResponse;

  @Test
  void testToString() {
    String result = enterpriseModificationResponse.toString();
    Assertions.assertEquals(
        "EnterpriseModificationResponse[action=<null>,updateEnterpriseRequest=updateEnterpriseRequest]",
        result);
  }

  @Test
  void testSetAction() {
    enterpriseModificationResponse.setAction("action");
  }

  @Test
  void testSetUpdateEnterpriseRequest() {
    enterpriseModificationResponse.setUpdateEnterpriseRequest(new UpdateEnterpriseRequest());
  }
}
