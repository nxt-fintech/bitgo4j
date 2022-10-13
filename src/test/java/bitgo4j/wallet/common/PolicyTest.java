package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyTest {
  @Mock List<Rule> rules;

  @InjectMocks Policy policy;

  @Test
  void testToString() {
    String result = policy.toString();
    String expected = "Policy[id=<null>,date=<null>,label=<null>,latest=<null>,version=<null>]";
    Assertions.assertEquals(expected, result);
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
  void testSetLatest() {
    policy.setLatest(Boolean.TRUE);
  }

  @Test
  void testSetRules() {
    policy.setRules(List.of(new Rule()));
  }

  @Test
  void testSetVersion() {
    policy.setVersion(0L);
  }
}
