package bitgo4j.policy;

import bitgo4j.policy.request.PolicyRequest;
import bitgo4j.policy.response.PolicyResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PolicyService {
  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/policy/rule")
  Call<PolicyResponse> add(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body PolicyRequest policyRequest);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/{coin}/wallet/{walletId}/policy/rule")
  Call<PolicyResponse> update(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body PolicyRequest policyRequest);

  @Headers({"Accept: application/json"})
  @HTTP(method = "DELETE", path = "/api/v2/{coin}/wallet/{walletId}/policy/rule", hasBody = true)
  Call<PolicyResponse> delete(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body PolicyRequest policyRequest);
}
