package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressCoinSpecificXlmTest {
  AddressCoinSpecificXlm addressCoinSpecificXlm = new AddressCoinSpecificXlm();

  @Test
  void testToString() {
    String result = addressCoinSpecificXlm.toString();
    Assertions.assertEquals("AddressCoinSpecificXlm[memoId=<null>,rootAddress=<null>]", result);
  }

  @Test
  void testSetMemoId() {
    addressCoinSpecificXlm.setMemoId("memoId");
  }

  @Test
  void testSetRootAddress() {
    addressCoinSpecificXlm.setRootAddress("rootAddress");
  }
}
