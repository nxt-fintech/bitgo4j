package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestFullTest {
  @Mock List<String> verificationItems;

  @Mock List<String> videoApprovers;

  @Mock TxRequest txRequest;

  @InjectMocks TransactionRequestFull transactionRequestFull;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = transactionRequestFull.toString();
    Assertions.assertEquals(
        "TransactionRequestFull[txRequestId=<null>,policyUniquId=<null>,verificationItems=verificationItems,verificationRuleId=<null>,videoApprovers=videoApprovers,walletRebalanceEventId=<null>,txRequest=txRequest]",
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
