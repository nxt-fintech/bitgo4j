package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateEnterpriseRequestTest {
  UpdateEnterpriseRequest updateEnterpriseRequest = new UpdateEnterpriseRequest();

  @Test
  void testToString() {
    String result = updateEnterpriseRequest.toString();
    String expected =
        "UpdateEnterpriseRequest[type=<null>,action=<null>,permission=<null>,userId=<null>,email=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetType() {
    updateEnterpriseRequest.setType("type");
  }

  @Test
  void testSetAction() {
    updateEnterpriseRequest.setAction("action");
  }

  @Test
  void testSetPermission() {
    updateEnterpriseRequest.setPermission("permission");
  }

  @Test
  void testSetUserId() {
    updateEnterpriseRequest.setUserId("userId");
  }

  @Test
  void testSetEmail() {
    updateEnterpriseRequest.setEmail("email");
  }
}
