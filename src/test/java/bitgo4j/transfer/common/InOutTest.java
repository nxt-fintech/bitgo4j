package bitgo4j.transfer.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InOutTest {
  InOut inOut = new InOut();

  @Test
  void testToString() {
    String result = inOut.toString();
    String expected =
        "InOut[id=<null>,address=<null>,value=<null>,valueString=<null>,blockHeight=<null>,date=<null>,coinbase=<null>,wallet=<null>,fromWallet=<null>,chain=<null>,index=<null>,redeemScript=<null>,witnessScript=<null>,isSegwit=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    inOut.setId("id");
  }

  @Test
  void testSetAddress() {
    inOut.setAddress("address");
  }

  @Test
  void testSetValue() {
    inOut.setValue(1L);
  }

  @Test
  void testSetValueString() {
    inOut.setValueString("valueString");
  }

  @Test
  void testSetBlockHeight() {
    inOut.setBlockHeight(0L);
  }

  @Test
  void testSetDate() {
    inOut.setDate("date");
  }

  @Test
  void testSetCoinbase() {
    inOut.setCoinbase(Boolean.TRUE);
  }

  @Test
  void testSetWallet() {
    inOut.setWallet("wallet");
  }

  @Test
  void testSetFromWallet() {
    inOut.setFromWallet("fromWallet");
  }

  @Test
  void testSetChain() {
    inOut.setChain(0L);
  }

  @Test
  void testSetIndex() {
    inOut.setIndex(0L);
  }

  @Test
  void testSetRedeemScript() {
    inOut.setRedeemScript("redeemScript");
  }

  @Test
  void testSetWitnessScript() {
    inOut.setWitnessScript("witnessScript");
  }

  @Test
  void testSetIsSegwit() {
    inOut.setIsSegwit(Boolean.TRUE);
  }
}