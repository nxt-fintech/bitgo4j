package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Admin;
import bitgo4j.wallet.common.BuildDefaults;
import bitgo4j.wallet.common.CoinSpecific;
import bitgo4j.wallet.common.CustomChangeKeySignatures;
import bitgo4j.wallet.common.Freeze;
import bitgo4j.wallet.common.Property;
import bitgo4j.wallet.common.ReceiveAddress;
import bitgo4j.wallet.common.Tokens;
import bitgo4j.wallet.common.User;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WalletResponseTest {
  @InjectMocks WalletResponse walletResponse;

  @Test
  void testToString() {
    String result = walletResponse.toString();
    Assertions.assertEquals(
        "WalletResponse[allowBackupKeySigning=<null>,approvalsRequired=<null>,balanceString=<null>,buildDefaults=<null>,coin=<null>,coinSpecific=<null>,custodialWalletId=<null>,deleted=<null>,disableTransactionNotifications=<null>,enterprise=<null>,freeze=<null>,id=<null>,isCold=<null>,keys=<null>,label=<null>,m=<null>,n=<null>,nodeId=<null>,recoverable=<null>,tags=<null>,spendableBalanceString=<null>,startDate=<null>,type=<null>,users=<null>,customChangeKeySignatures=<null>,multisigType=<null>,balance=<null>,confirmedBalance=<null>,confirmedBalanceString=<null>,spendableBalance=<null>,stakedBalance=<null>,stakedBalanceString=<null>,tokens=<null>,unsupportedTokens=<null>]",
        result);
  }

  @Test
  void testSetAdmin() {
    walletResponse.setAdmin(new Admin());
  }

  @Test
  void testSetAllowBackupKeySigning() {
    walletResponse.setAllowBackupKeySigning(Boolean.TRUE);
  }

  @Test
  void testSetApprovalsRequired() {
    walletResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetBalanceString() {
    walletResponse.setBalanceString("balanceString");
  }

  @Test
  void testSetBuildDefaults() {
    walletResponse.setBuildDefaults(new BuildDefaults());
  }

  @Test
  void testSetCoin() {
    walletResponse.setCoin("coin");
  }

  @Test
  void testSetCoinSpecific() {
    walletResponse.setCoinSpecific(new CoinSpecific());
  }

  @Test
  void testSetCustodialWalletId() {
    walletResponse.setCustodialWalletId("custodialWalletId");
  }

  @Test
  void testSetDeleted() {
    walletResponse.setDeleted(Boolean.TRUE);
  }

  @Test
  void testSetDisableTransactionNotifications() {
    walletResponse.setDisableTransactionNotifications(Boolean.TRUE);
  }

  @Test
  void testSetEnterprise() {
    walletResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetFreeze() {
    walletResponse.setFreeze(new Freeze());
  }

  @Test
  void testSetId() {
    walletResponse.setId("id");
  }

  @Test
  void testSetIsCold() {
    walletResponse.setIsCold(Boolean.TRUE);
  }

  @Test
  void testSetKeys() {
    walletResponse.setKeys(List.of("String"));
  }

  @Test
  void testSetLabel() {
    walletResponse.setLabel("label");
  }

  @Test
  void testSetM() {
    walletResponse.setM(0L);
  }

  @Test
  void testSetN() {
    walletResponse.setN(0L);
  }

  @Test
  void testSetNodeId() {
    walletResponse.setNodeId("nodeId");
  }

  @Test
  void testSetReceiveAddress() {
    walletResponse.setReceiveAddress(new ReceiveAddress());
  }

  @Test
  void testSetRecoverable() {
    walletResponse.setRecoverable(Boolean.TRUE);
  }

  @Test
  void testSetTags() {
    walletResponse.setTags(List.of("String"));
  }

  @Test
  void testSetSpendableBalanceString() {
    walletResponse.setSpendableBalanceString("spendableBalanceString");
  }

  @Test
  void testSetStartDate() {
    walletResponse.setStartDate("startDate");
  }

  @Test
  void testSetType() {
    walletResponse.setType("type");
  }

  @Test
  void testSetUsers() {
    walletResponse.setUsers(List.of(new User()));
  }

  @Test
  void testSetCustomChangeKeySignatures() {
    walletResponse.setCustomChangeKeySignatures(new CustomChangeKeySignatures());
  }

  @Test
  void testSetMultisigType() {
    walletResponse.setMultisigType("multisigType");
  }

  @Test
  void testSetBalance() {
    walletResponse.setBalance(0);
  }

  @Test
  void testSetConfirmedBalance() {
    walletResponse.setConfirmedBalance(0);
  }

  @Test
  void testSetConfirmedBalanceString() {
    walletResponse.setConfirmedBalanceString("confirmedBalanceString");
  }

  @Test
  void testSetSpendableBalance() {
    walletResponse.setSpendableBalance(0);
  }

  @Test
  void testSetStakedBalance() {
    walletResponse.setStakedBalance(0);
  }

  @Test
  void testSetStakedBalanceString() {
    walletResponse.setStakedBalanceString("stakedBalanceString");
  }

  @Test
  void testSetTokens() {
    walletResponse.setTokens(
        new Tokens(
            new Property(
                "balanceString",
                "confirmedBalanceString",
                "heldBalanceString",
                "spendableBalanceString",
                "stakedBalanceString",
                0)));
  }

  @Test
  void testSetUnsupportedTokens() {
    walletResponse.setUnsupportedTokens(
        new Tokens(
            new Property(
                "balanceString",
                "confirmedBalanceString",
                "heldBalanceString",
                "spendableBalanceString",
                "stakedBalanceString",
                0)));
  }
}
