package bitgo4j.policy.request;

import bitgo4j.policy.common.Action;
import bitgo4j.policy.common.Condition;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyRequestTest {
  @Mock Condition condition;

  @Mock Action action;

  @InjectMocks PolicyRequest policyRequest;

  @Test
  void testToString() {
    String result = policyRequest.toString();
    String expected =
        "PolicyRequest[coin=<null>,id=<null>,type=<null>,condition=condition,action=action]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCoin() {
    policyRequest.setCoin("coin");
  }

  @Test
  void testSetId() {
    policyRequest.setId("id");
  }

  @Test
  void testSetType() {
    policyRequest.setType("type");
  }

  @Test
  void testSetCondition() {
    policyRequest.setCondition(new Condition());
  }

  @Test
  void testSetAction() {
    policyRequest.setAction(new Action("type", 0L, List.of("String")));
  }
}
