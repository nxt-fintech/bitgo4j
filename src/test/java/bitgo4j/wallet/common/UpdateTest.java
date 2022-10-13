package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UpdateTest {
  @Mock Action action;

  @Mock Condition condition;

  @InjectMocks Update update;

  @Test
  void testToString() {
    String result = update.toString();
    String expected = "Update[action=action,coin=<null>,condition=condition,id=<null>,type=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAction() {
    update.setAction(new Action("type", 0L, List.of("String")));
  }

  @Test
  void testSetCoin() {
    update.setCoin("coin");
  }

  @Test
  void testSetCondition() {
    update.setCondition(new Condition());
  }

  @Test
  void testSetId() {
    update.setId("id");
  }

  @Test
  void testSetType() {
    update.setType("type");
  }
}