package bitgo4j.wallet.request;

import bitgo4j.wallet.common.BuildDefaults;
import bitgo4j.wallet.common.CustomChangeKeySignatures;
import bitgo4j.wallet.common.UpdateCoinSpecific;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UpdateWalletRequestTest {
  @Mock BuildDefaults buildDefaults;

  @Mock CustomChangeKeySignatures customChangeKeySignatures;

  @Mock UpdateCoinSpecific coinSpecific;

  @InjectMocks UpdateWalletRequest updateWalletRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = updateWalletRequest.toString();
    Assertions.assertEquals(
        "UpdateWalletRequest[approvalsRequired=<null>,buildDefaults=buildDefaults,disableTransactionNotifications=<null>,label=<null>,customChangeKeySignatures=customChangeKeySignatures,coinSpecific=coinSpecific]",
        result);
  }

  @Test
  void testSetApprovalsRequired() {
    updateWalletRequest.setApprovalsRequired(0);
  }

  @Test
  void testSetBuildDefaults() {
    updateWalletRequest.setBuildDefaults(new BuildDefaults());
  }

  @Test
  void testSetDisableTransactionNotifications() {
    updateWalletRequest.setDisableTransactionNotifications(Boolean.TRUE);
  }

  @Test
  void testSetLabel() {
    updateWalletRequest.setLabel("label");
  }

  @Test
  void testSetCustomChangeKeySignatures() {
    updateWalletRequest.setCustomChangeKeySignatures(new CustomChangeKeySignatures());
  }

  @Test
  void testSetCoinSpecific() {
    updateWalletRequest.setCoinSpecific(new UpdateCoinSpecific());
  }
}
