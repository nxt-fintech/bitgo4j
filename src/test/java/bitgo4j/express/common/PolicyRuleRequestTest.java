package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyRuleRequestTest {
  @Mock Update update;

  @Mock UpdateEnterpriseRequest updateEnterpriseRequest;

  @InjectMocks PolicyRuleRequest policyRuleRequest;

  @Test
  void testToString() {
    String result = policyRuleRequest.toString();
    String expected =
        "PolicyRuleRequest[action=<null>,update=update,updateEnterpriseRequest=updateEnterpriseRequest]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAction() {
    policyRuleRequest.setAction("action");
  }

  @Test
  void testSetUpdate() {
    policyRuleRequest.setUpdate(new Update());
  }

  @Test
  void testSetUpdateEnterpriseRequest() {
    policyRuleRequest.setUpdateEnterpriseRequest(new UpdateEnterpriseRequest());
  }
}
