package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ActionTest {
  @Mock List<String> userIds;

  @InjectMocks Action action;

  @Test
  void testToString() {
    String result = action.toString();
    Assertions.assertEquals("Action[type=<null>,approvalsRequired=<null>,userIds=userIds]", result);
  }

  @Test
  void testSetType() {
    action.setType("type");
  }

  @Test
  void testSetApprovalsRequired() {
    action.setApprovalsRequired(0L);
  }

  @Test
  void testSetUserIds() {
    action.setUserIds(List.of("String"));
  }
}
