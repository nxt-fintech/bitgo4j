package bitgo4j.express.response;

import bitgo4j.express.common.Info;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ResolvePendingApprovalResponseTest {
  @InjectMocks ResolvePendingApprovalResponse resolvePendingApprovalResponse;

  @Test
  void testToString() {
    String result = resolvePendingApprovalResponse.toString();
    String expected = "ResolvePendingApprovalResponse[id=<null>,coin=<null>,wallet=<null>,enterprise=<null>,creator=<null>,createDate=<null>,info=<null>,state=<null>,scope=<null>,userIds=<null>,approvalsRequired=<null>,walletLabel=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    resolvePendingApprovalResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    resolvePendingApprovalResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    resolvePendingApprovalResponse.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    resolvePendingApprovalResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetCreator() {
    resolvePendingApprovalResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    resolvePendingApprovalResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    resolvePendingApprovalResponse.setInfo(new Info());
  }

  @Test
  void testSetState() {
    resolvePendingApprovalResponse.setState("state");
  }

  @Test
  void testSetScope() {
    resolvePendingApprovalResponse.setScope("scope");
  }

  @Test
  void testSetUserIds() {
    resolvePendingApprovalResponse.setUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    resolvePendingApprovalResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetWalletLabel() {
    resolvePendingApprovalResponse.setWalletLabel("walletLabel");
  }
}
