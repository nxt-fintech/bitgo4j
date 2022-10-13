package bitgo4j.ping;

import bitgo4j.ping.response.PingResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PingService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/ping")
  Call<PingResponse> ping();
}
