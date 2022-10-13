package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrustlineTest {
  Trustline trustline = new Trustline("token", "action", "limit");

  @Test
  void testToString() {
    String result = trustline.toString();
    String expected = "Trustline[token=token,action=action,limit=limit]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetToken() {
    trustline.setToken("token");
  }

  @Test
  void testSetAction() {
    trustline.setAction("action");
  }

  @Test
  void testSetLimit() {
    trustline.setLimit("limit");
  }
}
