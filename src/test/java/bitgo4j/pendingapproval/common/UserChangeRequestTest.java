package bitgo4j.pendingapproval.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class UserChangeRequestTest {
    UserChangeRequest userChangeRequest= new UserChangeRequest();

  @Test
  void testToString() {
    String result = userChangeRequest.toString();
    String expected = "UserChangeRequest[action=<null>,permissions=<null>,userChanged=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAction() {
        userChangeRequest.setAction("action");
    }

    @Test
    void testSetPermissions(){
        userChangeRequest.setPermissions("permissions");
    }

    @Test
    void testSetUserChanged(){
        userChangeRequest.setUserChanged("userChanged");
    }
}
