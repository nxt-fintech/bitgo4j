package bitgo4j.wallet.request;

import bitgo4j.wallet.common.Eip1559;
import bitgo4j.wallet.common.FunctionArgs;
import bitgo4j.wallet.common.Memo;
import bitgo4j.wallet.common.Recipient;
import bitgo4j.wallet.common.RefundOptions;
import bitgo4j.wallet.common.Reservation;
import bitgo4j.wallet.common.StakingOptions;
import bitgo4j.wallet.common.Trustline;
import bitgo4j.wallet.common.UnstakingOptions;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class InitiateTransactionRequestTest {
  @Mock Eip1559 eip1559;

  @Mock List<String> unspents;

  @Mock Memo memo;

  @Mock List<String> cpfpTxIds;

  @Mock List<Trustline> trustlines;

  @Mock StakingOptions stakingOptions;

  @Mock UnstakingOptions unstakingOptions;

  @Mock RefundOptions refundOptions;

  @Mock Reservation reservation;

  @Mock List<Recipient> recipients;

  @Mock List<String> videoApprovers;

  @InjectMocks InitiateTransactionRequest initiateTransactionRequest;

  @Disabled
  @Test
  void testToString() {
    String result = initiateTransactionRequest.toString();
    Assertions.assertEquals(
        "InitiateTransactionRequest[numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,feeMultiplier=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=eip1559,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,sequenceId=<null>,nonce=<null>,noSplitChange=<null>,unspents=cpfpTxIds,changeAddress=<null>,instant=<null>,memo=memo,comment=<null>,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=cpfpTxIds,cpfpFeeRate=<null>,maxFee=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=cpfpTxIds,stakingOptions=stakingOptions,unstakingOptions=unstakingOptions,refundOptions=refundOptions,messageKey=<null>,reservation=reservation,recipients=cpfpTxIds,videoApprovers=cpfpTxIds]",
        result);
  }

  @Test
  void testSetNumBlocks() {
    initiateTransactionRequest.setNumBlocks(0);
  }

  @Test
  void testSetFeeRate() {
    initiateTransactionRequest.setFeeRate("feeRate");
  }

  @Test
  void testSetMaxFeeRate() {
    initiateTransactionRequest.setMaxFeeRate("maxFeeRate");
  }

  @Test
  void testSetFeeMultiplier() {
    initiateTransactionRequest.setFeeMultiplier("feeMultiplier");
  }

  @Test
  void testSetMinConfirms() {
    initiateTransactionRequest.setMinConfirms(0);
  }

  @Test
  void testSetEnforceMinConfirmsForChange() {
    initiateTransactionRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    initiateTransactionRequest.setGasPrice("gasPrice");
  }

  @Test
  void testSetEip1559() {
    initiateTransactionRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }

  @Test
  void testSetGasLimit() {
    initiateTransactionRequest.setGasLimit("gasLimit");
  }

  @Test
  void testSetTargetWalletUnspents() {
    initiateTransactionRequest.setTargetWalletUnspents(0);
  }

  @Test
  void testSetMinValue() {
    initiateTransactionRequest.setMinValue("minValue");
  }

  @Test
  void testSetMaxValue() {
    initiateTransactionRequest.setMaxValue("maxValue");
  }

  @Test
  void testSetSequenceId() {
    initiateTransactionRequest.setSequenceId("sequenceId");
  }

  @Test
  void testSetNonce() {
    initiateTransactionRequest.setNonce("nonce");
  }

  @Test
  void testSetNoSplitChange() {
    initiateTransactionRequest.setNoSplitChange(Boolean.TRUE);
  }

  @Test
  void testSetUnspents() {
    initiateTransactionRequest.setUnspents(List.of("String"));
  }

  @Test
  void testSetChangeAddress() {
    initiateTransactionRequest.setChangeAddress("changeAddress");
  }

  @Test
  void testSetInstant() {
    initiateTransactionRequest.setInstant(Boolean.TRUE);
  }

  @Test
  void testSetMemo() {
    initiateTransactionRequest.setMemo(new Memo("type", "value"));
  }

  @Test
  void testSetComment() {
    initiateTransactionRequest.setComment("comment");
  }

  @Test
  void testSetAddressType() {
    initiateTransactionRequest.setAddressType("addressType");
  }

  @Test
  void testSetStartTime() {
    initiateTransactionRequest.setStartTime("startTime");
  }

  @Test
  void testSetConsolidateId() {
    initiateTransactionRequest.setConsolidateId("consolidateId");
  }

  @Test
  void testSetLastLedgerSequence() {
    initiateTransactionRequest.setLastLedgerSequence(0);
  }

  @Test
  void testSetLedgerSequenceDelta() {
    initiateTransactionRequest.setLedgerSequenceDelta(0);
  }

  @Test
  void testSetCpfpTxIds() {
    initiateTransactionRequest.setCpfpTxIds(List.of("String"));
  }

  @Test
  void testSetCpfpFeeRate() {
    initiateTransactionRequest.setCpfpFeeRate(0);
  }

  @Test
  void testSetMaxFee() {
    initiateTransactionRequest.setMaxFee(0);
  }

  @Test
  void testSetStrategy() {
    initiateTransactionRequest.setStrategy("strategy");
  }

  @Test
  void testSetValidFromBlock() {
    initiateTransactionRequest.setValidFromBlock(0);
  }

  @Test
  void testSetValidToBlock() {
    initiateTransactionRequest.setValidToBlock(0);
  }

  @Test
  void testSetType() {
    initiateTransactionRequest.setType("type");
  }

  @Test
  void testSetTrustlines() {
    initiateTransactionRequest.setTrustlines(List.of(new Trustline("token", "action", "limit")));
  }

  @Test
  void testSetStakingOptions() {
    initiateTransactionRequest.setStakingOptions(
        new StakingOptions(0, "validator", "contractName", "functionName", new FunctionArgs()));
  }

  @Test
  void testSetUnstakingOptions() {
    initiateTransactionRequest.setUnstakingOptions(
        new UnstakingOptions("from", "receiver", "unstakeCpuQuantity", "unstakeNetQuantity"));
  }

  @Test
  void testSetRefundOptions() {
    initiateTransactionRequest.setRefundOptions(new RefundOptions("address"));
  }

  @Test
  void testSetMessageKey() {
    initiateTransactionRequest.setMessageKey("messageKey");
  }

  @Test
  void testSetReservation() {
    initiateTransactionRequest.setReservation(new Reservation("expireTime"));
  }

  @Test
  void testSetRecipients() {
    initiateTransactionRequest.setRecipients(
        List.of(new Recipient("amount", "address", new Memo("type", "value"))));
  }

  @Test
  void testSetVideoApprovers() {
    initiateTransactionRequest.setVideoApprovers(List.of("String"));
  }
}