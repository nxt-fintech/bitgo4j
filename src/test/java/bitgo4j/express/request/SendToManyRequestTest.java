package bitgo4j.express.request;

import bitgo4j.express.common.Eip1559;
import bitgo4j.express.common.Memo;
import bitgo4j.express.common.Reservation;
import bitgo4j.express.common.StakingOptions;
import bitgo4j.express.common.Trustline;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SendToManyRequestTest {
  @Mock Eip1559 eip1559;

  @Mock List<String> unspents;

  @Mock Memo memo;

  @Mock List<String> cpfpTxIds;

  @Mock List<Trustline> trustlines;

  @Mock StakingOptions stakingOptions;

  @Mock Reservation reservation;

  @InjectMocks SendToManyRequest sendToManyRequest;

  // TODO: fix random initialize
  @Disabled
  @Test
  void testToString() {
    String result = sendToManyRequest.toString();
    String expected =
        "SendToManyRequest[otp=<null>,walletPassphrase=<null>,prv=<null>,numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=eip1559,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,sequenceId=<null>,noSplitChange=<null>,unspents=cpfpTxIds,changeAddress=<null>,instant=<null>,memo=memo,comment=<null>,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=cpfpTxIds,cpfpFeeRate=<null>,maxFee=<null>,idfVersion=<null>,idfSignedTimestamp=<null>,idfUserId=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=cpfpTxIds,stakingOptions=stakingOptions,messageKey=<null>,reservation=reservation,data=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetOtp() {
    sendToManyRequest.setOtp("otp");
  }

  @Test
  void testSetWalletPassphrase() {
    sendToManyRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetPrv() {
    sendToManyRequest.setPrv("prv");
  }

  @Test
  void testSetNumBlocks() {
    sendToManyRequest.setNumBlocks(0);
  }

  @Test
  void testSetFeeRate() {
    sendToManyRequest.setFeeRate(0);
  }

  @Test
  void testSetMaxFeeRate() {
    sendToManyRequest.setMaxFeeRate(0);
  }

  @Test
  void testSetMinConfirms() {
    sendToManyRequest.setMinConfirms(0);
  }

  @Test
  void testSetEnforceMinConfirmsForChange() {
    sendToManyRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    sendToManyRequest.setGasPrice(0);
  }

  @Test
  void testSetEip1559() {
    sendToManyRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }

  @Test
  void testSetGasLimit() {
    sendToManyRequest.setGasLimit(0);
  }

  @Test
  void testSetTargetWalletUnspents() {
    sendToManyRequest.setTargetWalletUnspents(0);
  }

  @Test
  void testSetMinValue() {
    sendToManyRequest.setMinValue(0);
  }

  @Test
  void testSetMaxValue() {
    sendToManyRequest.setMaxValue(0);
  }

  @Test
  void testSetSequenceId() {
    sendToManyRequest.setSequenceId("sequenceId");
  }

  @Test
  void testSetNoSplitChange() {
    sendToManyRequest.setNoSplitChange(Boolean.TRUE);
  }

  @Test
  void testSetUnspents() {
    sendToManyRequest.setUnspents(List.of("String"));
  }

  @Test
  void testSetChangeAddress() {
    sendToManyRequest.setChangeAddress("changeAddress");
  }

  @Test
  void testSetInstant() {
    sendToManyRequest.setInstant(Boolean.TRUE);
  }

  @Test
  void testSetMemo() {
    sendToManyRequest.setMemo(new Memo("type", "value"));
  }

  @Test
  void testSetComment() {
    sendToManyRequest.setComment("comment");
  }

  @Test
  void testSetAddressType() {
    sendToManyRequest.setAddressType("addressType");
  }

  @Test
  void testSetStartTime() {
    sendToManyRequest.setStartTime("startTime");
  }

  @Test
  void testSetConsolidateId() {
    sendToManyRequest.setConsolidateId("consolidateId");
  }

  @Test
  void testSetLastLedgerSequence() {
    sendToManyRequest.setLastLedgerSequence(0);
  }

  @Test
  void testSetLedgerSequenceDelta() {
    sendToManyRequest.setLedgerSequenceDelta(0);
  }

  @Test
  void testSetCpfpTxIds() {
    sendToManyRequest.setCpfpTxIds(List.of("String"));
  }

  @Test
  void testSetCpfpFeeRate() {
    sendToManyRequest.setCpfpFeeRate(0);
  }

  @Test
  void testSetMaxFee() {
    sendToManyRequest.setMaxFee(0);
  }

  @Test
  void testSetIdfVersion() {
    sendToManyRequest.setIdfVersion(0);
  }

  @Test
  void testSetIdfSignedTimestamp() {
    sendToManyRequest.setIdfSignedTimestamp("idfSignedTimestamp");
  }

  @Test
  void testSetIdfUserId() {
    sendToManyRequest.setIdfUserId("idfUserId");
  }

  @Test
  void testSetStrategy() {
    sendToManyRequest.setStrategy("strategy");
  }

  @Test
  void testSetValidFromBlock() {
    sendToManyRequest.setValidFromBlock(0);
  }

  @Test
  void testSetValidToBlock() {
    sendToManyRequest.setValidToBlock(0);
  }

  @Test
  void testSetType() {
    sendToManyRequest.setType("type");
  }

  @Test
  void testSetTrustlines() {
    sendToManyRequest.setTrustlines(List.of(new Trustline("token", "action", "limit")));
  }

  @Test
  void testSetStakingOptions() {
    sendToManyRequest.setStakingOptions(new StakingOptions(0, "validator"));
  }

  @Test
  void testSetMessageKey() {
    sendToManyRequest.setMessageKey("messageKey");
  }

  @Test
  void testSetReservation() {
    sendToManyRequest.setReservation(new Reservation("expireTime"));
  }

  @Test
  void testSetData() {
    sendToManyRequest.setData("data");
  }
}
