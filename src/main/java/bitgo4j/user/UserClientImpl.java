package bitgo4j.user;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.user.request.LoginRequest;
import bitgo4j.user.request.UnlockSessionRequest;
import bitgo4j.user.response.SessionResponse;
import bitgo4j.user.response.UserResponse;

public class UserClientImpl implements UserClient {
  private final UserService service;

  public UserClientImpl(BitGo4jConfig config) {
    service = createService(UserService.class, config);
  }

  @Override
  public UserResponse get(String id) {
    return executeSync(service.get(id));
  }

  @Override
  public UserResponse login(LoginRequest loginRequest) {
    return executeSync(service.login(loginRequest));
  }

  @Override
  public void logout() {
    executeSync(service.logout());
  }

  @Override
  public SessionResponse getSession() {
    return executeSync(service.getSession());
  }

  @Override
  public SessionResponse lockSession() {
    return executeSync(service.lockSession());
  }

  @Override
  public SessionResponse unlockSession(UnlockSessionRequest unlockSessionRequest) {
    return executeSync(service.unlockSession(unlockSessionRequest));
  }
}
