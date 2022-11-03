package bitgo4j.express.response;

import bitgo4j.address.response.AddressResponse;
import bitgo4j.express.common.Admin;
import bitgo4j.express.common.BuildDefaults;
import bitgo4j.express.common.CoinSpecific;
import bitgo4j.express.common.CustomChangeKeySignatures;
import bitgo4j.express.common.Freeze;
import bitgo4j.express.common.User;
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
    String expected = "WalletResponse[allowBackupKeySigning=<null>,approvalsRequired=<null>,balanceString=<null>,buildDefaults=<null>,coin=<null>,coinSpecific=<null>,custodialWalletId=<null>,deleted=<null>,disableTransactionNotifications=<null>,enterprise=<null>,freeze=<null>,id=<null>,isCold=<null>,keys=<null>,label=<null>,m=<null>,n=<null>,nodeId=<null>,recoverable=<null>,tags=<null>,spendableBalanceString=<null>,startDate=<null>,type=<null>,users=<null>,customChangeKeySignatures=<null>]";
    Assertions.assertEquals(expected, result);
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
    walletResponse.setApprovalsRequired(0);
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
    walletResponse.setM(0);
  }

  @Test
  void testSetN() {
    walletResponse.setN(0);
  }

  @Test
  void testSetNodeId() {
    walletResponse.setNodeId("nodeId");
  }

  @Test
  void testSetReceiveAddress() {
    walletResponse.setReceiveAddress(new AddressResponse());
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
}
