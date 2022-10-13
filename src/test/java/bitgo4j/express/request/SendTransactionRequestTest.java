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
class SendTransactionRequestTest {
  @Mock Eip1559 eip1559;

  @Mock List<String> unspents;

  @Mock Memo memo;

  @Mock List<String> cpfpTxIds;

  @Mock List<Trustline> trustlines;

  @Mock StakingOptions stakingOptions;

  @Mock Reservation reservation;

  @InjectMocks SendTransactionRequest sendTransactionRequest;

  // FIXME: error due to random initialization
  @Disabled
  @Test
  void testToString() {
    String result = sendTransactionRequest.toString();
    String expected =
        "SendTransactionRequest[address=<null>,amount=<null>,walletPassphrase=<null>,prv=<null>,numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=eip1559,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,sequenceId=<null>,noSplitChange=<null>,unspents=trustlines,changeAddress=<null>,instant=<null>,memo=memo,comment=<null>,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=trustlines,cpfpFeeRate=<null>,maxFee=<null>,idfVersion=<null>,idfSignedTimestamp=<null>,idfUserId=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=trustlines,stakingOptions=stakingOptions,messageKey=<null>,reservation=reservation,data=<null>,hop=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    sendTransactionRequest.setAddress("address");
  }

  @Test
  void testSetAmount() {
    sendTransactionRequest.setAmount(0);
  }

  @Test
  void testSetWalletPassphrase() {
    sendTransactionRequest.setWalletPassphrase("walletPassphrase");
  }

  @Test
  void testSetPrv() {
    sendTransactionRequest.setPrv("prv");
  }

  @Test
  void testSetNumBlocks() {
    sendTransactionRequest.setNumBlocks(0);
  }

  @Test
  void testSetFeeRate() {
    sendTransactionRequest.setFeeRate(0);
  }

  @Test
  void testSetMaxFeeRate() {
    sendTransactionRequest.setMaxFeeRate(0);
  }

  @Test
  void testSetMinConfirms() {
    sendTransactionRequest.setMinConfirms(0);
  }

  @Test
  void testSetEnforceMinConfirmsForChange() {
    sendTransactionRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    sendTransactionRequest.setGasPrice(0);
  }

  @Test
  void testSetEip1559() {
    sendTransactionRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }

  @Test
  void testSetGasLimit() {
    sendTransactionRequest.setGasLimit(0);
  }

  @Test
  void testSetTargetWalletUnspents() {
    sendTransactionRequest.setTargetWalletUnspents(0);
  }

  @Test
  void testSetMinValue() {
    sendTransactionRequest.setMinValue(0);
  }

  @Test
  void testSetMaxValue() {
    sendTransactionRequest.setMaxValue(0);
  }

  @Test
  void testSetSequenceId() {
    sendTransactionRequest.setSequenceId("sequenceId");
  }

  @Test
  void testSetNoSplitChange() {
    sendTransactionRequest.setNoSplitChange(Boolean.TRUE);
  }

  @Test
  void testSetUnspents() {
    sendTransactionRequest.setUnspents(List.of("String"));
  }

  @Test
  void testSetChangeAddress() {
    sendTransactionRequest.setChangeAddress("changeAddress");
  }

  @Test
  void testSetInstant() {
    sendTransactionRequest.setInstant(Boolean.TRUE);
  }

  @Test
  void testSetMemo() {
    sendTransactionRequest.setMemo(new Memo("type", "value"));
  }

  @Test
  void testSetComment() {
    sendTransactionRequest.setComment("comment");
  }

  @Test
  void testSetAddressType() {
    sendTransactionRequest.setAddressType("addressType");
  }

  @Test
  void testSetStartTime() {
    sendTransactionRequest.setStartTime("startTime");
  }

  @Test
  void testSetConsolidateId() {
    sendTransactionRequest.setConsolidateId("consolidateId");
  }

  @Test
  void testSetLastLedgerSequence() {
    sendTransactionRequest.setLastLedgerSequence(0);
  }

  @Test
  void testSetLedgerSequenceDelta() {
    sendTransactionRequest.setLedgerSequenceDelta(0);
  }

  @Test
  void testSetCpfpTxIds() {
    sendTransactionRequest.setCpfpTxIds(List.of("String"));
  }

  @Test
  void testSetCpfpFeeRate() {
    sendTransactionRequest.setCpfpFeeRate(0);
  }

  @Test
  void testSetMaxFee() {
    sendTransactionRequest.setMaxFee(0);
  }

  @Test
  void testSetIdfVersion() {
    sendTransactionRequest.setIdfVersion(0);
  }

  @Test
  void testSetIdfSignedTimestamp() {
    sendTransactionRequest.setIdfSignedTimestamp("idfSignedTimestamp");
  }

  @Test
  void testSetIdfUserId() {
    sendTransactionRequest.setIdfUserId("idfUserId");
  }

  @Test
  void testSetStrategy() {
    sendTransactionRequest.setStrategy("strategy");
  }

  @Test
  void testSetValidFromBlock() {
    sendTransactionRequest.setValidFromBlock(0);
  }

  @Test
  void testSetValidToBlock() {
    sendTransactionRequest.setValidToBlock(0);
  }

  @Test
  void testSetType() {
    sendTransactionRequest.setType("type");
  }

  @Test
  void testSetTrustlines() {
    sendTransactionRequest.setTrustlines(List.of(new Trustline("token", "action", "limit")));
  }

  @Test
  void testSetStakingOptions() {
    sendTransactionRequest.setStakingOptions(new StakingOptions(0, "validator"));
  }

  @Test
  void testSetMessageKey() {
    sendTransactionRequest.setMessageKey("messageKey");
  }

  @Test
  void testSetReservation() {
    sendTransactionRequest.setReservation(new Reservation("expireTime"));
  }

  @Test
  void testSetData() {
    sendTransactionRequest.setData("data");
  }

  @Test
  void testSetHop() {
    sendTransactionRequest.setHop(Boolean.TRUE);
  }
}
