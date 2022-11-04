package bitgo4j.wallet.common;

import bitgo4j.transfer.common.Entry;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransferTest {
  @InjectMocks Transfer transfer;

  @Test
  void testToString() {
    String result = transfer.toString();
    Assertions.assertEquals(
        "Transfer[coin=<null>,id=<null>,wallet=<null>,enterprise=<null>,txid=<null>,height=<null>,heightId=<null>,date=<null>,type=<null>,value=<null>,valueString=<null>,baseValue=<null>,baseValueString=<null>,feeString=<null>,payGoFee=<null>,payGoFeeString=<null>,usd=<null>,usdRate=<null>,state=<null>,tags=<null>,history=<null>,comment=<null>,vSize=<null>,nSegwitInputs=<null>,sequenceId=<null>,entries=<null>,usersNotified=<null>]",
        result);
  }

  @Test
  void testSetCoin() {
    transfer.setCoin("coin");
  }

  @Test
  void testSetId() {
    transfer.setId("id");
  }

  @Test
  void testSetWallet() {
    transfer.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    transfer.setEnterprise("enterprise");
  }

  @Test
  void testSetTxid() {
    transfer.setTxid("txid");
  }

  @Test
  void testSetHeight() {
    transfer.setHeight(0L);
  }

  @Test
  void testSetHeightId() {
    transfer.setHeightId("heightId");
  }

  @Test
  void testSetDate() {
    transfer.setDate("date");
  }

  @Test
  void testSetType() {
    transfer.setType("type");
  }

  @Test
  void testSetValue() {
    transfer.setValue(new BigDecimal(0));
  }

  @Test
  void testSetValueString() {
    transfer.setValueString("valueString");
  }

  @Test
  void testSetBaseValue() {
    transfer.setBaseValue(new BigDecimal(0));
  }

  @Test
  void testSetBaseValueString() {
    transfer.setBaseValueString("baseValueString");
  }

  @Test
  void testSetFeeString() {
    transfer.setFeeString("feeString");
  }

  @Test
  void testSetPayGoFee() {
    transfer.setPayGoFee(new BigDecimal(0));
  }

  @Test
  void testSetPayGoFeeString() {
    transfer.setPayGoFeeString("payGoFeeString");
  }

  @Test
  void testSetUsd() {
    transfer.setUsd((double) 0);
  }

  @Test
  void testSetUsdRate() {
    transfer.setUsdRate((double) 0);
  }

  @Test
  void testSetState() {
    transfer.setState("state");
  }

  @Test
  void testSetTags() {
    transfer.setTags(List.of("String"));
  }

  @Test
  void testSetHistory() {
    transfer.setHistory(List.of(new History()));
  }

  @Test
  void testSetComment() {
    transfer.setComment("comment");
  }

  @Test
  void testSetVSize() {
    transfer.setVSize(0);
  }

  @Test
  void testSetNSegwitInputs() {
    transfer.setNSegwitInputs(0);
  }

  @Test
  void testSetSequenceId() {
    transfer.setSequenceId("sequenceId");
  }

  @Test
  void testSetEntries() {
    transfer.setEntries(List.of(new Entry()));
  }

  @Test
  void testSetUsersNotified() {
    transfer.setUsersNotified(Boolean.TRUE);
  }

  @Test
  void testSetConfirmations() {
    transfer.setConfirmations(0);
  }

  @Test
  void testSetInputs() {
    transfer.setInputs(List.of(new InOut()));
  }

  @Test
  void testSetOutputs() {
    transfer.setOutputs(List.of(new InOut()));
  }
}
