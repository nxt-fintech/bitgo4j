package bitgo4j.pendingapproval.response;

import bitgo4j.pendingapproval.common.Info;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PendingApprovalResponseTest {
  @Mock Info info;

  @Mock List<String> userIds;

  @InjectMocks PendingApprovalResponse pendingApprovalResponse;

  @Test
  void testToString() {
    String result = pendingApprovalResponse.toString();
    String expected =
        "PendingApprovalResponse[id=<null>,coin=<null>,wallet=<null>,enterprise=<null>,creator=<null>,createDate=<null>,info=info,state=<null>,scope=<null>,userIds=userIds,approvalsRequired=<null>,walletLabel=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    pendingApprovalResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    pendingApprovalResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    pendingApprovalResponse.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    pendingApprovalResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetCreator() {
    pendingApprovalResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    pendingApprovalResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    pendingApprovalResponse.setInfo(new Info());
  }

  @Test
  void testSetState() {
    pendingApprovalResponse.setState("state");
  }

  @Test
  void testSetScope() {
    pendingApprovalResponse.setScope("scope");
  }

  @Test
  void testSetUserIds() {
    pendingApprovalResponse.setUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    pendingApprovalResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetWalletLabel() {
    pendingApprovalResponse.setWalletLabel("walletLabel");
  }
}
