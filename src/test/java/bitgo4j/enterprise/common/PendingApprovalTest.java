package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PendingApprovalTest {
  @Mock Info info;

  @Mock List<String> walletUserIds;

  @InjectMocks PendingApproval pendingApproval;

  @Test
  void testToString() {
    String result = pendingApproval.toString();
    Assertions.assertEquals(
        "PendingApproval[id=<null>,bitcoinAddress=<null>,enterprise=<null>,walletId=<null>,creator=<null>,createDate=<null>,info=info,state=<null>,walletUserIds=walletUserIds,approvalsRequired=<null>]",
        result);
  }

  @Test
  void testSetId() {
    pendingApproval.setId("id");
  }

  @Test
  void testSetBitcoinAddress() {
    pendingApproval.setBitcoinAddress("bitcoinAddress");
  }

  @Test
  void testSetEnterprise() {
    pendingApproval.setEnterprise("enterprise");
  }

  @Test
  void testSetWalletId() {
    pendingApproval.setWalletId("walletId");
  }

  @Test
  void testSetCreator() {
    pendingApproval.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    pendingApproval.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    pendingApproval.setInfo(
        new Info(
            "type",
            new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"),
            new UpdateApprovalsRequiredRequest(0L)));
  }

  @Test
  void testSetState() {
    pendingApproval.setState("state");
  }

  @Test
  void testSetWalletUserIds() {
    pendingApproval.setWalletUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    pendingApproval.setApprovalsRequired(0L);
  }
}
