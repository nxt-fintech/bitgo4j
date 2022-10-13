package bitgo4j.key;

import bitgo4j.key.request.CreateKeyRequest;
import bitgo4j.key.response.KeyResponse;
import bitgo4j.key.response.ListKeysResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface KeyService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/key/{id}")
  Call<KeyResponse> get(@Path("coin") String coin, @Path("id") String id);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/key")
  Call<ListKeysResponse> list(@Path("coin") String coin);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/key")
  Call<KeyResponse> create(@Path("coin") String coin, @Body CreateKeyRequest createKeyRequest);
}
