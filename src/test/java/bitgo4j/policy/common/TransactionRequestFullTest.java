package bitgo4j.policy.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestFullTest {
  @InjectMocks TransactionRequestFull transactionRequestFull;

  @Test
  void testToString() {
    String result = transactionRequestFull.toString();
    Assertions.assertEquals(
        "TransactionRequestFull[txRequestId=<null>,policyUniquId=<null>,verificationItems=<null>,verificationRuleId=<null>,videoApprovers=<null>,walletRebalanceEventId=<null>,txRequest=<null>]",
        result);
  }

  @Test
  void testSetTxRequestId() {
    transactionRequestFull.setTxRequestId("txRequestId");
  }

  @Test
  void testSetPolicyUniquId() {
    transactionRequestFull.setPolicyUniquId("policyUniquId");
  }

  @Test
  void testSetVerificationItems() {
    transactionRequestFull.setVerificationItems(List.of("String"));
  }

  @Test
  void testSetVerificationRuleId() {
    transactionRequestFull.setVerificationRuleId("verificationRuleId");
  }

  @Test
  void testSetVideoApprovers() {
    transactionRequestFull.setVideoApprovers(List.of("String"));
  }

  @Test
  void testSetWalletRebalanceEventId() {
    transactionRequestFull.setWalletRebalanceEventId("walletRebalanceEventId");
  }

  @Test
  void testSetTxRequest() {
    transactionRequestFull.setTxRequest(new TxRequest());
  }
}
