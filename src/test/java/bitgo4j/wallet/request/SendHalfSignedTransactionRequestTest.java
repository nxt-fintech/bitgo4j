package bitgo4j.wallet.request;

import bitgo4j.wallet.common.Eip1559;
import bitgo4j.wallet.common.FunctionArgs;
import bitgo4j.wallet.common.HalfSigned;
import bitgo4j.wallet.common.Memo;
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

class SendHalfSignedTransactionRequestTest {
  @Mock HalfSigned halfSigned;

  @Mock List<String> videoApprovers;

  @Mock Eip1559 eip1559;

  @Mock List<String> unspents;

  @Mock Memo memo;

  @Mock List<String> cpfpTxIds;

  @Mock List<Trustline> trustlines;

  @Mock StakingOptions stakingOptions;

  @Mock UnstakingOptions unstakingOptions;

  @Mock RefundOptions refundOptions;

  @Mock Reservation reservation;

  @InjectMocks SendHalfSignedTransactionRequest sendHalfSignedTransactionRequest;

  @Disabled
  @Test
  void testToString() {
    String result = sendHalfSignedTransactionRequest.toString();
    Assertions.assertEquals(
        "SendHalfSignedTransactionRequest[comment=<null>,halfSigned=halfSigned,txHex=<null>,txRequestId=<null>,sequenceId=<null>,suppressBroadcast=<null>,videoApprovers=videoApprovers,numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,feeMultiplier=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=eip1559,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,nonce=<null>,noSplitChange=<null>,unspents=videoApprovers,changeAddress=<null>,instant=<null>,memo=memo,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=videoApprovers,cpfpFeeRate=<null>,maxFee=<null>,idfVersion=<null>,idfSignedTimestamp=<null>,idfUserId=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=videoApprovers,stakingOptions=stakingOptions,unstakingOptions=unstakingOptions,refundOptions=refundOptions,messageKey=<null>,reservation=reservation]",
        result);
  }

  @Test
  void testSetComment() {
    sendHalfSignedTransactionRequest.setComment("comment");
  }

  @Test
  void testSetHalfSigned() {
    sendHalfSignedTransactionRequest.setHalfSigned(new HalfSigned());
  }

  @Test
  void testSetTxHex() {
    sendHalfSignedTransactionRequest.setTxHex("txHex");
  }

  @Test
  void testSetTxRequestId() {
    sendHalfSignedTransactionRequest.setTxRequestId("txRequestId");
  }

  @Test
  void testSetSequenceId() {
    sendHalfSignedTransactionRequest.setSequenceId("sequenceId");
  }

  @Test
  void testSetSuppressBroadcast() {
    sendHalfSignedTransactionRequest.setSuppressBroadcast(Boolean.TRUE);
  }

  @Test
  void testSetVideoApprovers() {
    sendHalfSignedTransactionRequest.setVideoApprovers(List.of("String"));
  }

  @Test
  void testSetNumBlocks() {
    sendHalfSignedTransactionRequest.setNumBlocks(0);
  }

  @Test
  void testSetFeeRate() {
    sendHalfSignedTransactionRequest.setFeeRate("feeRate");
  }

  @Test
  void testSetMaxFeeRate() {
    sendHalfSignedTransactionRequest.setMaxFeeRate("maxFeeRate");
  }

  @Test
  void testSetFeeMultiplier() {
    sendHalfSignedTransactionRequest.setFeeMultiplier("feeMultiplier");
  }

  @Test
  void testSetMinConfirms() {
    sendHalfSignedTransactionRequest.setMinConfirms(0);
  }

  @Test
  void testSetEnforceMinConfirmsForChange() {
    sendHalfSignedTransactionRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    sendHalfSignedTransactionRequest.setGasPrice("gasPrice");
  }

  @Test
  void testSetEip1559() {
    sendHalfSignedTransactionRequest.setEip1559(
        new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }

  @Test
  void testSetGasLimit() {
    sendHalfSignedTransactionRequest.setGasLimit("gasLimit");
  }

  @Test
  void testSetTargetWalletUnspents() {
    sendHalfSignedTransactionRequest.setTargetWalletUnspents(0);
  }

  @Test
  void testSetMinValue() {
    sendHalfSignedTransactionRequest.setMinValue("minValue");
  }

  @Test
  void testSetMaxValue() {
    sendHalfSignedTransactionRequest.setMaxValue("maxValue");
  }

  @Test
  void testSetNonce() {
    sendHalfSignedTransactionRequest.setNonce("nonce");
  }

  @Test
  void testSetNoSplitChange() {
    sendHalfSignedTransactionRequest.setNoSplitChange(Boolean.TRUE);
  }

  @Test
  void testSetUnspents() {
    sendHalfSignedTransactionRequest.setUnspents(List.of("String"));
  }

  @Test
  void testSetChangeAddress() {
    sendHalfSignedTransactionRequest.setChangeAddress("changeAddress");
  }

  @Test
  void testSetInstant() {
    sendHalfSignedTransactionRequest.setInstant(Boolean.TRUE);
  }

  @Test
  void testSetMemo() {
    sendHalfSignedTransactionRequest.setMemo(new Memo("type", "value"));
  }

  @Test
  void testSetAddressType() {
    sendHalfSignedTransactionRequest.setAddressType("addressType");
  }

  @Test
  void testSetStartTime() {
    sendHalfSignedTransactionRequest.setStartTime("startTime");
  }

  @Test
  void testSetConsolidateId() {
    sendHalfSignedTransactionRequest.setConsolidateId("consolidateId");
  }

  @Test
  void testSetLastLedgerSequence() {
    sendHalfSignedTransactionRequest.setLastLedgerSequence(0);
  }

  @Test
  void testSetLedgerSequenceDelta() {
    sendHalfSignedTransactionRequest.setLedgerSequenceDelta(0);
  }

  @Test
  void testSetCpfpTxIds() {
    sendHalfSignedTransactionRequest.setCpfpTxIds(List.of("String"));
  }

  @Test
  void testSetCpfpFeeRate() {
    sendHalfSignedTransactionRequest.setCpfpFeeRate(0);
  }

  @Test
  void testSetMaxFee() {
    sendHalfSignedTransactionRequest.setMaxFee(0);
  }

  @Test
  void testSetIdfVersion() {
    sendHalfSignedTransactionRequest.setIdfVersion(0);
  }

  @Test
  void testSetIdfSignedTimestamp() {
    sendHalfSignedTransactionRequest.setIdfSignedTimestamp("idfSignedTimestamp");
  }

  @Test
  void testSetIdfUserId() {
    sendHalfSignedTransactionRequest.setIdfUserId("idfUserId");
  }

  @Test
  void testSetStrategy() {
    sendHalfSignedTransactionRequest.setStrategy("strategy");
  }

  @Test
  void testSetValidFromBlock() {
    sendHalfSignedTransactionRequest.setValidFromBlock(0);
  }

  @Test
  void testSetValidToBlock() {
    sendHalfSignedTransactionRequest.setValidToBlock(0);
  }

  @Test
  void testSetType() {
    sendHalfSignedTransactionRequest.setType("type");
  }

  @Test
  void testSetTrustlines() {
    sendHalfSignedTransactionRequest.setTrustlines(
        List.of(new Trustline("token", "action", "limit")));
  }

  @Test
  void testSetStakingOptions() {
    sendHalfSignedTransactionRequest.setStakingOptions(
        new StakingOptions(0, "validator", "contractName", "functionName", new FunctionArgs()));
  }

  @Test
  void testSetUnstakingOptions() {
    sendHalfSignedTransactionRequest.setUnstakingOptions(
        new UnstakingOptions("from", "receiver", "unstakeCpuQuantity", "unstakeNetQuantity"));
  }

  @Test
  void testSetRefundOptions() {
    sendHalfSignedTransactionRequest.setRefundOptions(new RefundOptions("address"));
  }

  @Test
  void testSetMessageKey() {
    sendHalfSignedTransactionRequest.setMessageKey("messageKey");
  }

  @Test
  void testSetReservation() {
    sendHalfSignedTransactionRequest.setReservation(new Reservation("expireTime"));
  }
}