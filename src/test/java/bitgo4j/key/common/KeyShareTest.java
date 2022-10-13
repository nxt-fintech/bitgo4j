package bitgo4j.key.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeyShareTest {
  KeyShare keyShare = new KeyShare("from", "to", "publicShare", "privateShare");

  @Test
  void testToString() {
    String result = keyShare.toString();
    Assertions.assertEquals(
        "KeyShare[from=from,to=to,publicShare=publicShare,privateShare=privateShare]", result);
  }

  @Test
  void testSetFrom() {
    keyShare.setFrom("from");
  }

  @Test
  void testSetTo() {
    keyShare.setTo("to");
  }

  @Test
  void testSetPublicShare() {
    keyShare.setPublicShare("publicShare");
  }

  @Test
  void testSetPrivateShare() {
    keyShare.setPrivateShare("privateShare");
  }
}
