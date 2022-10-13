package bitgo4j.transfer.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntryTest {
  Entry entry = new Entry();

  @Test
  void testToString() {
    String result = entry.toString();
    String expected =
        "Entry[address=<null>,wallet=<null>,value=<null>,valueString=<null>,isChange=<null>,isPayGo=<null>,token=<null>,label=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    entry.setAddress("address");
  }

  @Test
  void testSetWallet() {
    entry.setWallet("wallet");
  }

  @Test
  void testSetValue() {
    entry.setValue(1L);
  }

  @Test
  void testSetValueString() {
    entry.setValueString("valueString");
  }

  @Test
  void testSetIsChange() {
    entry.setIsChange(Boolean.TRUE);
  }

  @Test
  void testSetIsPayGo() {
    entry.setIsPayGo(Boolean.TRUE);
  }

  @Test
  void testSetToken() {
    entry.setToken("token");
  }

  @Test
  void testSetLabel() {
    entry.setLabel("label");
  }
}