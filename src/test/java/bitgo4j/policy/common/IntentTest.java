package bitgo4j.policy.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class IntentTest {
  @InjectMocks Intent intent;

  @Test
  void testToString() {
    String result = intent.toString();
    Assertions.assertEquals(
        "Intent[nonce=<null>,memo=<null>,intentType=<null>,sequenceId=<null>,comment=<null>,stakingRequestId=<null>,stakingAddress=<null>,amount=<null>,enableTokens=<null>,recipients=<null>,proxy=<null>,feeOptions=<null>,hopParams=<null>,isTss=<null>,selfSend=<null>,txid=<null>]",
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
    intent.setRecipients(List.of(new RecipientEntry()));
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
