package bitgo4j.address;


import bitgo4j.address.request.CreateAddressRequest;
import bitgo4j.address.request.DeployAddressRequest;
import bitgo4j.address.request.ForwardTokensFromAddressRequest;
import bitgo4j.address.request.UpdateAddressRequest;
import bitgo4j.address.response.AddressResponse;
import bitgo4j.address.response.DeployAddressResponse;
import bitgo4j.address.response.ForwardTokensFromAddressResponse;
import bitgo4j.address.response.ListAddressResponse;
import bitgo4j.address.response.ProofResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AddressService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/addresses")
  Call<ListAddressResponse> list(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("labelContains") String labelContains,
      @Query("limit") Integer limit,
      @Query("mine") Boolean mine,
      @Query("prevId") String prevId,
      @Query("segwit") Boolean segwit,
      @Query("sort") Integer sort,
      @Query("chain") Integer chain,
      @Query("includeBalances") Boolean includeBalances,
      @Query("includeTokens") Boolean includeTokens,
      @Query("includeTotalAddressCount") Boolean includeTotalAddressCount,
      @Query("returnBalancesForToken") String returnBalancesForToken,
      @Query("pendingDeployment") Boolean pendingDeployment);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/address")
  Call<AddressResponse> create(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body CreateAddressRequest createAddressRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/address/{addressId}/deployment")
  Call<DeployAddressResponse> deploy(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("addressId") String addressId,
      @Body DeployAddressRequest deployAddressRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/address/{addressId}/tokenforward")
  Call<ForwardTokensFromAddressResponse> forwardTokens(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("addressId") String addressId,
      @Body ForwardTokensFromAddressRequest forwardTokensFromAddressRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/address/{addressOrId}")
  Call<AddressResponse> get(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("addressOrId") String addressOrId,
      @Query("dt") String dt,
      @Query("memoId") String memoId);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/{coin}/wallet/{walletId}/address/{addressOrId}")
  Call<AddressResponse> update(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("addressOrId") String addressOrId,
      @Query("dt") String dt,
      @Query("memoId") String memoId,
      @Body UpdateAddressRequest updateAddressRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/address/{addressOrId}/proof")
  Call<ProofResponse> getProof(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("addressOrId") String addressOrId);
}
