package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ConditionTest {
  @InjectMocks Condition condition;

  @Test
  void testToString() {
    String result = condition.toString();
    String expected =
        "Condition[amountString=<null>,timeWindow=<null>,excludeTags=<null>,groupTags=<null>,addresses=<null>,entries=<null>,url=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAmountString() {
    condition.setAmountString("amountString");
  }

  @Test
  void testSetTimeWindow() {
    condition.setTimeWindow(0);
  }

  @Test
  void testSetExcludeTags() {
    condition.setExcludeTags(List.of("String"));
  }

  @Test
  void testSetGroupTags() {
    condition.setGroupTags(List.of("String"));
  }

  @Test
  void testSetAddresses() {
    condition.setAddresses(List.of("String"));
  }

  @Test
  void testSetEntries() {
    condition.setEntries(List.of(new Entry()));
  }

  @Test
  void testSetUrl() {
    condition.setUrl("url");
  }
}
