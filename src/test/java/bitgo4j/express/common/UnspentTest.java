package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnspentTest {
  Unspent unspent = new Unspent();

  @Test
  void testToString() {
    String result = unspent.toString();
    String expected =
        "Unspent[id=<null>,address=<null>,value=<null>,valueString=<null>,blockHeight=<null>,date=<null>,coinbase=<null>,wallet=<null>,fromWallet=<null>,chain=<null>,index=<null>,redeemScript=<null>,witnessScript=<null>,isSegwit=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    unspent.setId("id");
  }

  @Test
  void testSetAddress() {
    unspent.setAddress("address");
  }

  @Test
  void testSetValue() {
    unspent.setValue(0);
  }

  @Test
  void testSetValueString() {
    unspent.setValueString("valueString");
  }

  @Test
  void testSetBlockHeight() {
    unspent.setBlockHeight(0);
  }

  @Test
  void testSetDate() {
    unspent.setDate("date");
  }

  @Test
  void testSetCoinbase() {
    unspent.setCoinbase(Boolean.TRUE);
  }

  @Test
  void testSetWallet() {
    unspent.setWallet("wallet");
  }

  @Test
  void testSetFromWallet() {
    unspent.setFromWallet("fromWallet");
  }

  @Test
  void testSetChain() {
    unspent.setChain(0);
  }

  @Test
  void testSetIndex() {
    unspent.setIndex(0);
  }

  @Test
  void testSetRedeemScript() {
    unspent.setRedeemScript("redeemScript");
  }

  @Test
  void testSetWitnessScript() {
    unspent.setWitnessScript("witnessScript");
  }

  @Test
  void testSetIsSegwit() {
    unspent.setIsSegwit(Boolean.TRUE);
  }
}
