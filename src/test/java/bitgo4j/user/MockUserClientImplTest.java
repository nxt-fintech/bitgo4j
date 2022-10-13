package bitgo4j.user;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.user.request.LoginRequest;
import bitgo4j.user.request.UnlockSessionRequest;
import bitgo4j.user.response.SessionResponse;
import bitgo4j.user.response.UserResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockUserClientImplTest {
  private static UserClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().user();
  }

  @Test
  public void getTest_200() {
    UserResponse response = client.get("1cc8c3a5b01952d3d288e0099dea8c0a");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.get("35063ea3f3a601d2f5afe56c47ab0f66"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void getTest_404() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.get("b6b38c9cd06807a5423f8a219a3067b4"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void loginTest_200() {
    LoginRequest request = new LoginRequest();
    UserResponse response = client.login(request);
    assertNotNull(response);
  }

  // FIXME: the url path conflicts with 200 case
  @Disabled
  @Test
  public void loginTest_401() {
    LoginRequest request = new LoginRequest("email", false, "otp", "password");
    BitGo4jException exception = assertThrows(BitGo4jException.class, () -> client.login(request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void logoutTest_200() {
    client.logout();
  }

  @Test
  public void getSessionTest_200() {
    SessionResponse response = client.getSession();
    assertNotNull(response);
  }

  @Test
  public void lockSessionTest_200() {
    SessionResponse response = client.lockSession();
    assertNotNull(response);
  }

  @Test
  public void unlockSessionTest_200() {
    UnlockSessionRequest request = new UnlockSessionRequest();
    SessionResponse response = client.unlockSession(request);
    assertNotNull(response);
  }
}
