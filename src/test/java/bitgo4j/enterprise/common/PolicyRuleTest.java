package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyRuleTest {
  @Mock Condition condition;

  @Mock Action action;

  @InjectMocks PolicyRule policyRule;

  @Test
  void testToString() {
    String result = policyRule.toString();
    Assertions.assertEquals(
        "PolicyRule[id=<null>,lockDate=<null>,mutabilityConstraint=<null>,coin=<null>,type=<null>,condition=condition,action=action]",
        result);
  }

  @Test
  void testSetId() {
    policyRule.setId("id");
  }

  @Test
  void testSetLockDate() {
    policyRule.setLockDate("lockDate");
  }

  @Test
  void testSetMutabilityConstraint() {
    policyRule.setMutabilityConstraint("mutabilityConstraint");
  }

  @Test
  void testSetCoin() {
    policyRule.setCoin("coin");
  }

  @Test
  void testSetType() {
    policyRule.setType("type");
  }

  @Test
  void testSetCondition() {
    policyRule.setCondition(
        new Condition(
            "amountString",
            0,
            List.of("String"),
            List.of("String"),
            List.of("String"),
            List.of(new Entry("item", new MetaData("label", "owner"), "type"))));
  }

  @Test
  void testSetAction() {
    policyRule.setAction(new Action("type", 0L, List.of("String")));
  }
}
