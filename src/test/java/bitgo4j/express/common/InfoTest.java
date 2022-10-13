package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InfoTest {
  @Mock TransactionRequest transactionRequest;

  @Mock UserChangeRequest userChangeRequest;

  @Mock PolicyRuleRequest policyRuleRequest;

  @Mock UpdateApprovalRequiredRequest updateApprovalRequiredRequest;

  @Mock SigningPolicyUpdateRequest signingPolicyUpdateRequest;

  @InjectMocks Info info;

  @Test
  void testToString() {
    String result = info.toString();
    String expected =
        "Info[type=<null>,transactionRequest=transactionRequest,policyRuleRequest=policyRuleRequest,updateApprovalRequiredRequest=updateApprovalRequiredRequest,signingPolicyUpdateRequest=signingPolicyUpdateRequest,policyRuleRequest=policyRuleRequest]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    info.setType("type");
  }

  @Test
  void testSetTransactionRequest() {
    info.setTransactionRequest(new TransactionRequest());
  }

  @Test
  void testSetUserChangeRequest() {
    info.setUserChangeRequest(new UserChangeRequest());
  }

  @Test
  void testSetPolicyRuleRequest() {
    info.setPolicyRuleRequest(new PolicyRuleRequest());
  }

  @Test
  void testSetUpdateApprovalRequiredRequest() {
    info.setUpdateApprovalRequiredRequest(new UpdateApprovalRequiredRequest());
  }

  @Test
  void testSetSigningPolicyUpdateRequest() {
    info.setSigningPolicyUpdateRequest(new SigningPolicyUpdateRequest());
  }
}
