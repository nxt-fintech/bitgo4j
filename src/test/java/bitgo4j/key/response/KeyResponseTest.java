package bitgo4j.key.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeyResponseTest {
  KeyResponse keyResponse = new KeyResponse();

  @Test
  void testToString() {
    String result = keyResponse.toString();
    Assertions.assertEquals(
        "KeyResponse[encryptedPrv=<null>,id=<null>,isBitGo=<null>,source=<null>,type=<null>,ethAddress=<null>,pub=<null>,commonKeyChain=<null>,commonPub=<null>]",
        result);
  }

  @Test
  void testSetEncryptedPrv() {
    keyResponse.setEncryptedPrv("encryptedPrv");
  }

  @Test
  void testSetId() {
    keyResponse.setId("id");
  }

  @Test
  void testSetIsBitGo() {
    keyResponse.setIsBitGo(Boolean.TRUE);
  }

  @Test
  void testSetSource() {
    keyResponse.setSource("source");
  }

  @Test
  void testSetType() {
    keyResponse.setType("type");
  }

  @Test
  void testSetEthAddress() {
    keyResponse.setEthAddress("ethAddress");
  }

  @Test
  void testSetPub() {
    keyResponse.setPub("pub");
  }

  @Test
  void testSetCommonKeyChain() {
    keyResponse.setCommonKeyChain("commonKeyChain");
  }

  @Test
  void testSetCommonPub() {
    keyResponse.setCommonPub("commonPub");
  }
}
