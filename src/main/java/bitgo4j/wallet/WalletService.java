package bitgo4j.wallet;

import bitgo4j.wallet.request.BuildTransactionRequest;
import bitgo4j.wallet.request.CreateAddressRequest;
import bitgo4j.wallet.request.InitiateTransactionRequest;
import bitgo4j.wallet.request.InitiateTrustlineTransactionRequest;
import bitgo4j.wallet.request.MakeUnspentReservationRequest;
import bitgo4j.wallet.request.ModifyUnspentReservationRequest;
import bitgo4j.wallet.request.SendHalfSignedTransactionRequest;
import bitgo4j.wallet.request.UpdateWalletRequest;
import bitgo4j.wallet.response.AddressResponse;
import bitgo4j.wallet.response.AverageFeeResponse;
import bitgo4j.wallet.response.BalanceReserveDataResponse;
import bitgo4j.wallet.response.BuildTransactionResponse;
import bitgo4j.wallet.response.FreezeWalletResponse;
import bitgo4j.wallet.response.InitiateTransactionResponse;
import bitgo4j.wallet.response.ListTotalBalanceResponse;
import bitgo4j.wallet.response.ListTransferResponse;
import bitgo4j.wallet.response.ListWalletResponse;
import bitgo4j.wallet.response.MaximumSpendableResponse;
import bitgo4j.wallet.response.PotentialStuckTxsResponse;
import bitgo4j.wallet.response.SendHalfSignedTransactionResponse;
import bitgo4j.wallet.response.SpendingLimitsAndCurrentAmountSpentResponse;
import bitgo4j.wallet.response.StakedBalanceDataResponse;
import bitgo4j.wallet.response.TotalRewardsDataResponse;
import bitgo4j.wallet.response.UnspentReservationResponse;
import bitgo4j.wallet.response.UnspentsResponse;
import bitgo4j.wallet.response.WalletResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WalletService {
  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/address")
  Call<AddressResponse> createAddress(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body CreateAddressRequest createAddressRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/potentialStuckTxs")
  Call<List<PotentialStuckTxsResponse>> getPotentialStuckTxs(
      @Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/averagefee")
  Call<AverageFeeResponse> getAverageFee(
      @Path("coin") String coin, @Query("numBlocks") Integer numBlocks);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/transfer")
  Call<ListTransferResponse> listTransfers(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("allTokens") Boolean allTokens,
      @Query("dateGte") String dateGte,
      @Query("dateLt") String dateLt,
      @Query("height") String height,
      @Query("limit") Integer limit,
      @Query("prevId") String prevId,
      @Query("state") String state,
      @Query("type") String type,
      @Query("valueGte") Integer valueGte,
      @Query("valueLt") Integer valueLt,
      @Query("id") String id,
      @Query("pendingApprovalId") String pendingApprovalId,
      @Query("address") List<String> address,
      @Query("includeHex") Boolean includeHex,
      @Query("memoId") List<String> memoId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet")
  Call<WalletResponse> add();

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet")
  Call<ListWalletResponse> listByCoin(
      @Path("coin") String coin,
      @Query("prevId") String prevId,
      @Query("limit") Integer limit,
      @Query("allTokens") Boolean allTokens,
      @Query("searchLabel") String searchLabel,
      @Query("showAllWallets") Boolean showAllWallets);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/wallets")
  Call<ListWalletResponse> list(
      @Query("coin") String coin,
      @Query("deleted") List<Boolean> deleted,
      @Query("enterprise") List<String> enterprise,
      @Query("enterpriseIsNull") Boolean enterpriseIsNull,
      @Query("id") List<String> id,
      @Query("labelContains") String labelContains,
      @Query("limit") Integer limit,
      @Query("prevId") String prevId,
      @Query("type") List<String> type,
      @Query("expandCustodialWallet") Boolean expandCustodialWallet);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/address/{address}")
  Call<WalletResponse> getByAddress(@Path("coin") String coin, @Path("address") String address);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}")
  Call<WalletResponse> get(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("allTokens") Boolean allTokens);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/{coin}/wallet/{walletId}")
  Call<WalletResponse> update(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body UpdateWalletRequest updateWalletRequest);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/{coin}/wallet/{walletId}")
  Call<WalletResponse> delete(@Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/{coin}/wallet/{walletId}/user/{userId}")
  Call<WalletResponse> removeUser(
      @Path("coin") String coin, @Path("walletId") String walletId, @Path("userId") String userId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/freeze")
  Call<FreezeWalletResponse> freeze(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("duration") Integer duration);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/unspents")
  Call<UnspentsResponse> getUnspents(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("limit") Integer limit,
      @Query("maxValue") Integer maxValue,
      @Query("minConfirms") Integer minConfirms,
      @Query("enforceMinConfirmsForChange") Boolean enforceMinConfirmsForChange,
      @Query("minHeight") Integer minHeight,
      @Query("minValue") Integer minValue,
      @Query("prevId") String prevId,
      @Query("segwit") Boolean segwit);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/maximumSpendable")
  Call<MaximumSpendableResponse> getMaximumSpendable(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Query("allTokens") Boolean allTokens,
      @Query("enforceMinConfirmsForChange") Boolean enforceMinConfirmsForChange,
      @Query("feeRate") Integer feeRate,
      @Query("limit") Integer limit,
      @Query("maxFeeRate") Integer maxFeeRate,
      @Query("maxValue") Integer maxValue,
      @Query("minConfirms") Integer minConfirms,
      @Query("minHeight") Integer minHeight,
      @Query("minValue") Integer minValue,
      @Query("numBlocks") Integer numBlocks);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/spending")
  Call<SpendingLimitsAndCurrentAmountSpentResponse> getSpendingLimitAndCurrentAmountSpent(
      @Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/reservedunspents")
  Call<UnspentReservationResponse> makeUnspentReservation(
      @Path("walletId") String walletId,
      @Body MakeUnspentReservationRequest makeUnspentReservationRequest);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/wallet/{walletId}/reservedunspents")
  Call<UnspentReservationResponse> releaseUnspentReservation(
      @Path("walletId") String walletId, @Query("id") List<String> id);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/wallet/{walletId}/reservedunspents")
  Call<UnspentReservationResponse> listUnspentReservation(
      @Path("walletId") String walletId,
      @Query("prevId") String prevId,
      @Query("limit") Integer limit,
      @Query("expireTimeGt") String expireTimeGt,
      @Query("expireTimeLte") String expireTimeLte);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/wallet/{walletId}/reservedunspents")
  Call<UnspentReservationResponse> modifyUnspentReservation(
      @Path("walletId") String walletId,
      @Body ModifyUnspentReservationRequest modifyUnspentReservationRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/wallet/balances")
  Call<ListTotalBalanceResponse> listTotalBalances(
      @Query("coin") List<String> coin,
      @Query("deleted") List<Boolean> deleted,
      @Query("enterprise") List<String> enterprise,
      @Query("id") List<String> id,
      @Query("labelContains") String labelContains,
      @Query("type") List<String> type,
      @Query("expandCustodialWallet") Boolean expandCustodialWallet);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/tx/build")
  Call<BuildTransactionResponse> buildTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body BuildTransactionRequest buildTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/tx/initiate")
  Call<InitiateTransactionResponse> initiateTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body InitiateTransactionRequest initiateTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/tx/send")
  Call<SendHalfSignedTransactionResponse> sendHalfSignedTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SendHalfSignedTransactionRequest sendHalfSignedTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/trustline/initiate")
  Call<InitiateTransactionResponse> initiateTrustLineTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body InitiateTrustlineTransactionRequest initiateTrustlineTransactionRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/requiredReserve")
  Call<BalanceReserveDataResponse> getBalanceReserveData(@Path("coin") String coin);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/balances/staked")
  Call<List<StakedBalanceDataResponse>> getStackedBalanceData(
      @Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/balances/totalrewards")
  Call<List<TotalRewardsDataResponse>> getTotalRewardsData(
      @Path("coin") String coin, @Path("walletId") String walletId);
}
