package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomChangeKeySignaturesTest {
  CustomChangeKeySignatures customChangeKeySignatures = new CustomChangeKeySignatures();

  @Test
  void testToString() {
    String result = customChangeKeySignatures.toString();
    String expected = "CustomChangeKeySignatures[user=<null>,backup=<null>,bitgo=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetUser() {
    customChangeKeySignatures.setUser("user");
  }

  @Test
  void testSetBackup() {
    customChangeKeySignatures.setBackup("backup");
  }

  @Test
  void testSetBitgo() {
    customChangeKeySignatures.setBitgo("bitgo");
  }
}
