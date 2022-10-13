package bitgo4j.enterprise.response;

import bitgo4j.enterprise.common.Info;
import bitgo4j.enterprise.common.PendingApproval;
import bitgo4j.enterprise.common.UpdateApprovalsRequiredRequest;
import bitgo4j.enterprise.common.UpdateEnterpriseRequest;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserResponseTest {
  @InjectMocks UserResponse userResponse;

  @Test
  void testToString() {
    String result = userResponse.toString();
    Assertions.assertEquals(
        "UserResponse[id=<null>,bitcoinAddress=<null>,enterprise=<null>,walletId=<null>,creator=<null>,createDate=<null>,info=<null>,state=<null>,walletUserIds=<null>,approvalsRequired=<null>,pendingApprovals=<null>]",
        result);
  }

  @Test
  void testSetId() {
    userResponse.setId("id");
  }

  @Test
  void testSetBitcoinAddress() {
    userResponse.setBitcoinAddress("bitcoinAddress");
  }

  @Test
  void testSetEnterprise() {
    userResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetWalletId() {
    userResponse.setWalletId("walletId");
  }

  @Test
  void testSetCreator() {
    userResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    userResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    userResponse.setInfo(
        new Info(
            "type",
            new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"),
            new UpdateApprovalsRequiredRequest(0L)));
  }

  @Test
  void testSetState() {
    userResponse.setState("state");
  }

  @Test
  void testSetWalletUserIds() {
    userResponse.setWalletUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    userResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetPendingApprovals() {
    userResponse.setPendingApprovals(
        List.of(
            new PendingApproval(
                "id",
                "bitcoinAddress",
                "enterprise",
                "walletId",
                "creator",
                "createDate",
                new Info(
                    "type",
                    new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"),
                    new UpdateApprovalsRequiredRequest(0L)),
                "state",
                List.of("String"),
                0L)));
  }
}
