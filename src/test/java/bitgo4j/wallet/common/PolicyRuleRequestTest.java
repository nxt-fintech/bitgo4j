package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyRuleRequestTest {
  @Mock Update update;

  @InjectMocks PolicyRuleRequest policyRuleRequest;

  @Test
  void testToString() {
    String result = policyRuleRequest.toString();
    Assertions.assertEquals("PolicyRuleRequest[action=<null>,update=update]", result);
  }

  @Test
  void testSetAction() {
    policyRuleRequest.setAction("action");
  }

  @Test
  void testSetUpdate() {
    policyRuleRequest.setUpdate(new Update());
  }
}
