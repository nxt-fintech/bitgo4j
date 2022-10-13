package bitgo4j.federation;

import bitgo4j.federation.response.FederationResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface FederationService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/xlm/federation")
  Call<FederationResponse> lookUp(@Query("q") String q, @Query("type") String type);
}
