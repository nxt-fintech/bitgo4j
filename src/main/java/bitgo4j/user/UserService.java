package bitgo4j.user;

import bitgo4j.user.request.LoginRequest;
import bitgo4j.user.request.UnlockSessionRequest;
import bitgo4j.user.response.SessionResponse;
import bitgo4j.user.response.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/user/{id}")
  Call<UserResponse> get(@Path("id") String id);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/user/login")
  Call<UserResponse> login(@Body LoginRequest loginRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/user/logout")
  Call<Void> logout();

  @Headers({"Accept: application/json"})
  @GET("/api/v2/user/session")
  Call<SessionResponse> getSession();

  @Headers({"Accept: application/json"})
  @POST("/api/v2/user/lock")
  Call<SessionResponse> lockSession();

  @Headers({"Accept: application/json"})
  @POST("/api/v2/user/unlock")
  Call<SessionResponse> unlockSession(@Body UnlockSessionRequest unlockSessionRequest);
}
