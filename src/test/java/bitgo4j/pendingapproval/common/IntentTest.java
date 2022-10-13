package bitgo4j.pendingapproval.common;

import bitgo4j.transactionrequest.common.Amount;
import bitgo4j.transactionrequest.common.EnableToken;
import bitgo4j.transactionrequest.common.FeeOptions;
import bitgo4j.transactionrequest.common.HopParams;
import bitgo4j.transactionrequest.common.Recipient;
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
class IntentTest {
  @Mock Amount amount;

  @Mock List<EnableToken> enableTokens;

  @Mock List<Recipient> recipients;

  @Mock FeeOptions feeOptions;

  @Mock HopParams hopParams;

  @InjectMocks Intent intent;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = intent.toString();
    Assertions.assertEquals(
        "Intent[nonce=<null>,memo=<null>,intentType=<null>,sequenceId=<null>,comment=<null>,stakingRequestId=<null>,stakingAddress=<null>,amount=amount,enableTokens=enableTokens,recipients=recipients,proxy=<null>,feeOptions=feeOptions,hopParams=hopParams,isTss=<null>,selfSend=<null>,txid=<null>]",
        result);
  }

  @Test
  void testSetNonce() {
    intent.setNonce("nonce");
  }

  @Test
  void testSetMemo() {
    intent.setMemo("memo");
  }

  @Test
  void testSetIntentType() {
    intent.setIntentType("intentType");
  }

  @Test
  void testSetSequenceId() {
    intent.setSequenceId("sequenceId");
  }

  @Test
  void testSetComment() {
    intent.setComment("comment");
  }

  @Test
  void testSetStakingRequestId() {
    intent.setStakingRequestId("stakingRequestId");
  }

  @Test
  void testSetStakingAddress() {
    intent.setStakingAddress("stakingAddress");
  }

  @Test
  void testSetAmount() {
    intent.setAmount(new Amount());
  }

  @Test
  void testSetEnableTokens() {
    intent.setEnableTokens(List.of(new EnableToken()));
  }

  @Test
  void testSetRecipients() {
    intent.setRecipients(List.of(new Recipient()));
  }

  @Test
  void testSetProxy() {
    intent.setProxy("proxy");
  }

  @Test
  void testSetFeeOptions() {
    intent.setFeeOptions(new FeeOptions());
  }

  @Test
  void testSetHopParams() {
    intent.setHopParams(new HopParams());
  }

  @Test
  void testSetIsTss() {
    intent.setIsTss(Boolean.TRUE);
  }

  @Test
  void testSetSelfSend() {
    intent.setSelfSend(Boolean.TRUE);
  }

  @Test
  void testSetTxid() {
    intent.setTxid("txid");
  }
}
