package bitgo4j.policy.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RuleTest {
  @Mock Condition condition;

  @Mock Action action;

  @InjectMocks Rule rule;

  @Test
  void testToString() {
    String result = rule.toString();
    String expected =
        "Rule[id=<null>,lockDate=<null>,mutabilityConstraint=<null>,coin=<null>,type=<null>,condition=condition,action=action]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    rule.setId("id");
  }

  @Test
  void testSetLockDate() {
    rule.setLockDate("lockDate");
  }

  @Test
  void testSetMutabilityConstraint() {
    rule.setMutabilityConstraint("mutabilityConstraint");
  }

  @Test
  void testSetCoin() {
    rule.setCoin("coin");
  }

  @Test
  void testSetType() {
    rule.setType("type");
  }

  @Test
  void testSetCondition() {
    rule.setCondition(new Condition());
  }

  @Test
  void testSetAction() {
    rule.setAction(new Action("type", 0L, List.of("String")));
  }
}
