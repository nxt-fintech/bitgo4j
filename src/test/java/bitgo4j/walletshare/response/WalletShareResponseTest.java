package bitgo4j.walletshare.response;

import bitgo4j.walletshare.common.Keychain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WalletShareResponseTest {
  @Mock Keychain keychain;

  @InjectMocks WalletShareResponse walletShareResponse;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = walletShareResponse.toString();
    Assertions.assertEquals(
        "WalletShareResponse[id=<null>,coin=<null>,wallet=<null>,walletLabel=<null>,fromUser=<null>,toUser=<null>,permissions=<null>,message=<null>,state=<null>,enterprise=<null>,pendingApprovalId=<null>,keychain=keychain]",
        result);
  }

  @Test
  void testSetId() {
    walletShareResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    walletShareResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    walletShareResponse.setWallet("wallet");
  }

  @Test
  void testSetWalletLabel() {
    walletShareResponse.setWalletLabel("walletLabel");
  }

  @Test
  void testSetFromUser() {
    walletShareResponse.setFromUser("fromUser");
  }

  @Test
  void testSetToUser() {
    walletShareResponse.setToUser("toUser");
  }

  @Test
  void testSetPermissions() {
    walletShareResponse.setPermissions("permissions");
  }

  @Test
  void testSetMessage() {
    walletShareResponse.setMessage("message");
  }

  @Test
  void testSetState() {
    walletShareResponse.setState("state");
  }

  @Test
  void testSetEnterprise() {
    walletShareResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetPendingApprovalId() {
    walletShareResponse.setPendingApprovalId("pendingApprovalId");
  }

  @Test
  void testSetKeychain() {
    walletShareResponse.setKeychain(new Keychain());
  }
}
