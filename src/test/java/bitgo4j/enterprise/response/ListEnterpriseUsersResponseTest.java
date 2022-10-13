package bitgo4j.enterprise.response;

import bitgo4j.enterprise.common.AdminUser;
import bitgo4j.enterprise.common.NonAdminUser;
import bitgo4j.enterprise.common.WalletUser;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListEnterpriseUsersResponseTest {
  @InjectMocks ListEnterpriseUsersResponse listEnterpriseUsersResponse;

  @Test
  void testToString() {
    String result = listEnterpriseUsersResponse.toString();
    Assertions.assertEquals(
        "ListEnterpriseUsersResponse[adminUsers=<null>,nonAdminUsers=<null>,walletUsers=<null>,keyState=<null>,incomplete=<null>]",
        result);
  }

  @Test
  void testSetAdminUsers() {
    listEnterpriseUsersResponse.setAdminUsers(
        List.of(new AdminUser("id", "username", Boolean.TRUE)));
  }

  @Test
  void testSetNonAdminUsers() {
    listEnterpriseUsersResponse.setNonAdminUsers(
        List.of(new NonAdminUser("id", "username", Boolean.TRUE)));
  }

  @Test
  void testSetWalletUsers() {
    listEnterpriseUsersResponse.setWalletUsers(List.of(new WalletUser("id", "username")));
  }

  @Test
  void testSetKeyState() {
    listEnterpriseUsersResponse.setKeyState("keyState");
  }

  @Test
  void testSetIncomplete() {
    listEnterpriseUsersResponse.setIncomplete(Boolean.TRUE);
  }
}
