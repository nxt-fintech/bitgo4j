package bitgo4j.express.response;

import bitgo4j.express.common.Keychain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ShareWalletResponseTest {
  @Mock Keychain keychain;

  @InjectMocks ShareWalletResponse shareWalletResponse;

  @Test
  void testToString() {
    String result = shareWalletResponse.toString();
    String expected =
        "ShareWalletResponse[id=<null>,coin=<null>,wallet=<null>,walletLabel=<null>,fromUser=<null>,toUser=<null>,permissions=<null>,message=<null>,state=<null>,enterprise=<null>,pendingApprovalId=<null>,keychain=keychain]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    shareWalletResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    shareWalletResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    shareWalletResponse.setWallet("wallet");
  }

  @Test
  void testSetWalletLabel() {
    shareWalletResponse.setWalletLabel("walletLabel");
  }

  @Test
  void testSetFromUser() {
    shareWalletResponse.setFromUser("fromUser");
  }

  @Test
  void testSetToUser() {
    shareWalletResponse.setToUser("toUser");
  }

  @Test
  void testSetPermissions() {
    shareWalletResponse.setPermissions("permissions");
  }

  @Test
  void testSetMessage() {
    shareWalletResponse.setMessage("message");
  }

  @Test
  void testSetState() {
    shareWalletResponse.setState("state");
  }

  @Test
  void testSetEnterprise() {
    shareWalletResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetPendingApprovalId() {
    shareWalletResponse.setPendingApprovalId("pendingApprovalId");
  }

  @Test
  void testSetKeychain() {
    shareWalletResponse.setKeychain(new Keychain());
  }
}
