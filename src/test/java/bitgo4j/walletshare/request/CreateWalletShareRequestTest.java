package bitgo4j.walletshare.request;

import bitgo4j.walletshare.common.Keychain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CreateWalletShareRequestTest {
  @Mock Keychain keychain;
  @InjectMocks CreateWalletShareRequest createWalletShareRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = createWalletShareRequest.toString();
    Assertions.assertEquals(
        "CreateWalletShareRequest[permissions=<null>,message=<null>,reshare=<null>,skipKeychain=<null>,disableEmail=<null>,user=<null>,keychain=keychain]",
        result);
  }

  @Test
  void testSetPermissions() {
    createWalletShareRequest.setPermissions("permissions");
  }

  @Test
  void testSetMessage() {
    createWalletShareRequest.setMessage("message");
  }

  @Test
  void testSetReshare() {
    createWalletShareRequest.setReshare(Boolean.TRUE);
  }

  @Test
  void testSetSkipKeychain() {
    createWalletShareRequest.setSkipKeychain(Boolean.TRUE);
  }

  @Test
  void testSetDisableEmail() {
    createWalletShareRequest.setDisableEmail(Boolean.TRUE);
  }

  @Test
  void testSetUser() {
    createWalletShareRequest.setUser("user");
  }

  @Test
  void testSetKeychain() {
    createWalletShareRequest.setKeychain(new Keychain());
  }
}
