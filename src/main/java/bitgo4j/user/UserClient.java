package bitgo4j.user;

import bitgo4j.user.request.LoginRequest;
import bitgo4j.user.request.UnlockSessionRequest;
import bitgo4j.user.response.SessionResponse;
import bitgo4j.user.response.UserResponse;

public interface UserClient {
  UserResponse get(String id);

  UserResponse login(LoginRequest loginRequest);

  void logout();

  SessionResponse getSession();

  SessionResponse lockSession();

  SessionResponse unlockSession(UnlockSessionRequest unlockSessionRequest);
}
