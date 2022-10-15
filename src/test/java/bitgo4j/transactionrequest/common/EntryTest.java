package bitgo4j.transactionrequest.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntryTest {
  Entry entry = new Entry();

  @Test
  void testToString() {
    String result = entry.toString();
    Assertions.assertEquals(
        "Entry[address=<null>,wallet=<null>,value=<null>,valueString=<null>,isChange=<null>,isPayGo=<null>,token=<null>]",
        result);
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
    entry.setValue(0L);
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
}
