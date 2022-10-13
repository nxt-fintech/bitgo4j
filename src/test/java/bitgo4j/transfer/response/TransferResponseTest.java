package bitgo4j.transfer.response;

import bitgo4j.transfer.common.Entry;
import bitgo4j.transfer.common.History;
import bitgo4j.transfer.common.InOut;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransferResponseTest {
  @InjectMocks TransferResponse transferResponse;

  @Test
  void testToString() {
    String result = transferResponse.toString();
    Assertions.assertEquals(
        "TransferResponse[coin=<null>,id=<null>,wallet=<null>,enterprise=<null>,txid=<null>,height=<null>,heightId=<null>,date=<null>,type=<null>,value=<null>,valueString=<null>,baseValue=<null>,baseValueString=<null>,feeString=<null>,payGoFee=<null>,payGoFeeString=<null>,usd=<null>,usdRate=<null>,state=<null>,tags=<null>,history=<null>,comment=<null>,vSize=<null>,nSegwitInputs=<null>,sequenceId=<null>,entries=<null>,usersNotified=<null>]",
        result);
  }

  @Test
  void testSetCoin() {
    transferResponse.setCoin("coin");
  }

  @Test
  void testSetId() {
    transferResponse.setId("id");
  }

  @Test
  void testSetWallet() {
    transferResponse.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    transferResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetTxid() {
    transferResponse.setTxid("txid");
  }

  @Test
  void testSetHeight() {
    transferResponse.setHeight(0L);
  }

  @Test
  void testSetHeightId() {
    transferResponse.setHeightId("heightId");
  }

  @Test
  void testSetDate() {
    transferResponse.setDate("date");
  }

  @Test
  void testSetType() {
    transferResponse.setType("type");
  }

  @Test
  void testSetValue() {
    transferResponse.setValue(new BigDecimal(0));
  }

  @Test
  void testSetValueString() {
    transferResponse.setValueString("valueString");
  }

  @Test
  void testSetBaseValue() {
    transferResponse.setBaseValue(new BigDecimal(0));
  }

  @Test
  void testSetBaseValueString() {
    transferResponse.setBaseValueString("baseValueString");
  }

  @Test
  void testSetFeeString() {
    transferResponse.setFeeString("feeString");
  }

  @Test
  void testSetPayGoFee() {
    transferResponse.setPayGoFee(new BigDecimal(0));
  }

  @Test
  void testSetPayGoFeeString() {
    transferResponse.setPayGoFeeString("payGoFeeString");
  }

  @Test
  void testSetUsd() {
    transferResponse.setUsd((double) 0);
  }

  @Test
  void testSetUsdRate() {
    transferResponse.setUsdRate((double) 0);
  }

  @Test
  void testSetState() {
    transferResponse.setState("state");
  }

  @Test
  void testSetTags() {
    transferResponse.setTags(List.of("String"));
  }

  @Test
  void testSetHistory() {
    transferResponse.setHistory(List.of(new History()));
  }

  @Test
  void testSetComment() {
    transferResponse.setComment("comment");
  }

  @Test
  void testSetVSize() {
    transferResponse.setVSize(0);
  }

  @Test
  void testSetNSegwitInputs() {
    transferResponse.setNSegwitInputs(0);
  }

  @Test
  void testSetSequenceId() {
    transferResponse.setSequenceId("sequenceId");
  }

  @Test
  void testSetEntries() {
    transferResponse.setEntries(List.of(new Entry()));
  }

  @Test
  void testSetUsersNotified() {
    transferResponse.setUsersNotified(Boolean.TRUE);
  }

  @Test
  void testSetConfirmations() {
    transferResponse.setConfirmations(0L);
  }

  @Test
  void testSetInputs() {
    transferResponse.setInputs(List.of(new InOut()));
  }

  @Test
  void testSetOutputs() {
    transferResponse.setOutputs(List.of(new InOut()));
  }
}