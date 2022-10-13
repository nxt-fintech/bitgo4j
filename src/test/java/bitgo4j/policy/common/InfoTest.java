package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
class InfoTest {
  @Mock TransactionRequest transactionRequest;

  @Mock TransactionRequestFull transactionRequestFull;

  @Mock UserChangeRequest userChangeRequest;

  @Mock PolicyRuleRequest policyRuleRequest;

  @Mock UpdateApprovalRequiredRequest updateApprovalRequiredRequest;

  @Mock EnterpriseModificationResponse enterpriseModificationResponse;

  @InjectMocks Info info;

  @Test
  void testToString() {
    String result = info.toString();
    Assertions.assertEquals(
        "Info[type=<null>,transactionRequest=transactionRequest,transactionRequestFull=transactionRequestFull,userChangeRequest=userChangeRequest,policyRuleRequest=policyRuleRequest,updateApprovalRequiredRequest=updateApprovalRequiredRequest,enterpriseModificationResponse=enterpriseModificationResponse]",
        result);
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
  void testSetTransactionRequestFull() {
    info.setTransactionRequestFull(new TransactionRequestFull());
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
  void testSetEnterpriseModificationResponse() {
    info.setEnterpriseModificationResponse(new EnterpriseModificationResponse());
  }
}
