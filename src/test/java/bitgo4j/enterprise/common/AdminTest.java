package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminTest {
  @Mock Policy policy;

  @InjectMocks Admin admin;

  @Test
  void testToString() {
    String result = admin.toString();
    Assertions.assertEquals("Admin[policy=policy]", result);
  }

  @Test
  void testSetPolicy() {
    admin.setPolicy(
        new Policy(
            "id",
            "date",
            "label",
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
                    new Action("type", 0L, List.of("String")))),
            0L));
  }
}
