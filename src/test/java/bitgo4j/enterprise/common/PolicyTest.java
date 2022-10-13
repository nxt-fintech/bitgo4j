package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyTest {
  @Mock List<PolicyRule> rules;

  @InjectMocks Policy policy;

  @Test
  void testToString() {
    String result = policy.toString();
    Assertions.assertEquals(
        "Policy[id=<null>,date=<null>,label=<null>,rules=rules,version=<null>]", result);
  }

  @Test
  void testSetId() {
    policy.setId("id");
  }

  @Test
  void testSetDate() {
    policy.setDate("date");
  }

  @Test
  void testSetLabel() {
    policy.setLabel("label");
  }

  @Test
  void testSetRules() {
    policy.setRules(
        List.of(
            new PolicyRule(
                "id",
                "lockDate",
                "mutabilityConstraint",
                "coin",
                "type",
                new Condition(
                    "amountString",
                    0,
                    List.of("String"),
                    List.of("String"),
                    List.of("String"),
                    List.of(new Entry("item", new MetaData("label", "owner"), "type"))),
                new Action("type", 0L, List.of("String")))));
  }

  @Test
  void testSetVersion() {
    policy.setVersion(0L);
  }
}
