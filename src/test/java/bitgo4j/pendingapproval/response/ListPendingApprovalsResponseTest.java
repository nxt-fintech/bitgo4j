package bitgo4j.pendingapproval.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListPendingApprovalsResponseTest {
  @Mock List<PendingApprovalResponse> pendingApprovals;

  @InjectMocks ListPendingApprovalsResponse listPendingApprovalsResponse;

  @Test
  void testToString() {
    String result = listPendingApprovalsResponse.toString();
    String expected = "ListPendingApprovalsResponse[pendingApprovals=pendingApprovals]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetGetPendingApprovalResponses() {
    listPendingApprovalsResponse.setPendingApprovals(List.of(new PendingApprovalResponse()));
  }
}
