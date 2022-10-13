package bitgo4j.policy.response;

import bitgo4j.policy.common.Admin;
import bitgo4j.policy.common.BuildDefaults;
import bitgo4j.policy.common.CoinSpecific;
import bitgo4j.policy.common.CustomChangeKeySignatures;
import bitgo4j.policy.common.Freeze;
import bitgo4j.policy.common.Info;
import bitgo4j.policy.common.ReceiveAddress;
import bitgo4j.policy.common.User;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyResponseTest {
  @InjectMocks PolicyResponse policyResponse;

  @Test
  void testToString() {
    String result = policyResponse.toString();
    Assertions.assertEquals(
        "PolicyResponse[admin=<null>,allowBackupKeySigning=<null>,approvalsRequired=<null>,balanceString=<null>,buildDefaults=<null>,coin=<null>,coinSpecific=<null>,custodialWalletId=<null>,deleted=<null>,disableTransactionNotifications=<null>,enterprise=<null>,freeze=<null>,id=<null>,isCold=<null>,keys=<null>,label=<null>,m=<null>,n=<null>,nodeId=<null>,receiveAddress=<null>,recoverable=<null>,tags=<null>,spendableBalanceString=<null>,startDate=<null>,type=<null>,users=<null>,customChangeKeySignatures=<null>,multisigType=<null>,wallet=<null>,creator=<null>,createDate=<null>,info=<null>,state=<null>,scope=<null>,userIds=<null>,walletLabel=<null>]",
        result);
  }

  @Test
  void testSetAdmin() {
    policyResponse.setAdmin(new Admin());
  }

  @Test
  void testSetAllowBackupKeySigning() {
    policyResponse.setAllowBackupKeySigning(Boolean.TRUE);
  }

  @Test
  void testSetApprovalsRequired() {
    policyResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetBalanceString() {
    policyResponse.setBalanceString("balanceString");
  }

  @Test
  void testSetBuildDefaults() {
    policyResponse.setBuildDefaults(new BuildDefaults());
  }

  @Test
  void testSetCoin() {
    policyResponse.setCoin("coin");
  }

  @Test
  void testSetCoinSpecific() {
    policyResponse.setCoinSpecific(new CoinSpecific());
  }

  @Test
  void testSetCustodialWalletId() {
    policyResponse.setCustodialWalletId("custodialWalletId");
  }

  @Test
  void testSetDeleted() {
    policyResponse.setDeleted(Boolean.TRUE);
  }

  @Test
  void testSetDisableTransactionNotifications() {
    policyResponse.setDisableTransactionNotifications(Boolean.TRUE);
  }

  @Test
  void testSetEnterprise() {
    policyResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetFreeze() {
    policyResponse.setFreeze(new Freeze());
  }

  @Test
  void testSetId() {
    policyResponse.setId("id");
  }

  @Test
  void testSetIsCold() {
    policyResponse.setIsCold(Boolean.TRUE);
  }

  @Test
  void testSetKeys() {
    policyResponse.setKeys(List.of("String"));
  }

  @Test
  void testSetLabel() {
    policyResponse.setLabel("label");
  }

  @Test
  void testSetM() {
    policyResponse.setM(0L);
  }

  @Test
  void testSetN() {
    policyResponse.setN(0L);
  }

  @Test
  void testSetNodeId() {
    policyResponse.setNodeId("nodeId");
  }

  @Test
  void testSetReceiveAddress() {
    policyResponse.setReceiveAddress(new ReceiveAddress());
  }

  @Test
  void testSetRecoverable() {
    policyResponse.setRecoverable(Boolean.TRUE);
  }

  @Test
  void testSetTags() {
    policyResponse.setTags(List.of("String"));
  }

  @Test
  void testSetSpendableBalanceString() {
    policyResponse.setSpendableBalanceString("spendableBalanceString");
  }

  @Test
  void testSetStartDate() {
    policyResponse.setStartDate("startDate");
  }

  @Test
  void testSetType() {
    policyResponse.setType("type");
  }

  @Test
  void testSetUsers() {
    policyResponse.setUsers(List.of(new User()));
  }

  @Test
  void testSetCustomChangeKeySignatures() {
    policyResponse.setCustomChangeKeySignatures(new CustomChangeKeySignatures());
  }

  @Test
  void testSetMultisigType() {
    policyResponse.setMultisigType("multisigType");
  }

  @Test
  void testSetWallet() {
    policyResponse.setWallet("wallet");
  }

  @Test
  void testSetCreator() {
    policyResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    policyResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    policyResponse.setInfo(new Info());
  }

  @Test
  void testSetState() {
    policyResponse.setState("state");
  }

  @Test
  void testSetScope() {
    policyResponse.setScope("scope");
  }

  @Test
  void testSetUserIds() {
    policyResponse.setUserIds(List.of("String"));
  }

  @Test
  void testSetWalletLabel() {
    policyResponse.setWalletLabel("walletLabel");
  }
}