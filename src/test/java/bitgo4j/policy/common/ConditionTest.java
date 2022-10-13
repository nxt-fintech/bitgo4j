package bitgo4j.policy.common;

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
    Assertions.assertEquals(
        "Condition[amountString=<null>,timeWindow=<null>,groupTags=<null>,excludeTags=<null>,startDateReset=<null>,add=<null>,metaData=<null>,remove=<null>,url=<null>]",
        result);
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
  void testSetGroupTags() {
    condition.setGroupTags(List.of("String"));
  }

  @Test
  void testSetExcludeTags() {
    condition.setExcludeTags(List.of("String"));
  }

  @Test
  void testSetStartDateReset() {
    condition.setStartDateReset(Boolean.TRUE);
  }

  @Test
  void testSetAdd() {
    condition.setAdd("add");
  }

  @Test
  void testSetMetaData() {
    condition.setMetaData(new MetaData());
  }

  @Test
  void testSetRemove() {
    condition.setRemove("remove");
  }

  @Test
  void testSetUrl() {
    condition.setUrl("url");
  }
}