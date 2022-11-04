package bitgo4j.express;

import bitgo4j.express.request.AccelerateTransactionRequest;
import bitgo4j.express.request.AcceptWalletShareRequest;
import bitgo4j.express.request.CalculateMiningFeeRequest;
import bitgo4j.express.request.CanonicalizeAddressRequest;
import bitgo4j.express.request.ConsolidateAccountRequest;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.CryptRequest;
import bitgo4j.express.request.GenerateWalletRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.request.RecoverTokenRequest;
import bitgo4j.express.request.ResolvePendingApprovalRequest;
import bitgo4j.express.request.SendToManyRequest;
import bitgo4j.express.request.SendTransactionRequest;
import bitgo4j.express.request.ShareWalletRequest;
import bitgo4j.express.request.SignTSSTransactionRequest;
import bitgo4j.express.request.SignTransactionRequest;
import bitgo4j.express.request.SignWalletTransactionRequest;
import bitgo4j.express.request.SweepFundsRequest;
import bitgo4j.express.request.UnspentsRequest;
import bitgo4j.express.request.VerifyAddressRequest;
import bitgo4j.express.response.AcceptWalletShareResponse;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.CalculateMiningFeeResponse;
import bitgo4j.express.response.CanonicalizeAddressResponse;
import bitgo4j.express.response.ConsolidateAccountResponse;
import bitgo4j.express.response.DecryptResponse;
import bitgo4j.express.response.EncryptResponse;
import bitgo4j.express.response.KeyResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.RecoverETHTokenResponse;
import bitgo4j.express.response.ResolvePendingApprovalResponse;
import bitgo4j.express.response.ShareWalletResponse;
import bitgo4j.express.response.SignTSSTransactionResponse;
import bitgo4j.express.response.SignTransactionResponse;
import bitgo4j.express.response.TransactionResponse;
import bitgo4j.express.response.VerifyAddressResponse;
import bitgo4j.express.response.WalletResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExpressService {
  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/address")
  Call<AddressResponse> createAddress(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body CreateAddressRequest createAddressRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/user/login")
  Call<LoginResponse> login(@Body LoginRequest loginRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/pingexpress")
  Call<PingResponse> ping();

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/sendcoins")
  Call<TransactionResponse> sendTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SendTransactionRequest sendTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/sendmany")
  Call<TransactionResponse> sendToMany(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SendToManyRequest sendToManyRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/encrypt")
  Call<EncryptResponse> encryptMessages(@Body CryptRequest cryptRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/decrypt")
  Call<DecryptResponse> decryptMessages(@Body CryptRequest cryptRequest);

  // TODO: Deprecated
  @Headers({"Accept: application/json"})
  @POST("/api/v2/calculateminerfeeinfo")
  Call<CalculateMiningFeeResponse> calculateMiningFee(
      @Body CalculateMiningFeeRequest calculateMiningFeeRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/keychain/local")
  Call<KeyResponse> createKey(@Path("coin") String coin);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/generate")
  Call<WalletResponse> generateWallet(
      @Path("coin") String coin,
      @Query("includeKeychains") Boolean includeKeychains,
      @Body GenerateWalletRequest generateWalletRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/share")
  Call<ShareWalletResponse> shareWallet(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body ShareWalletRequest shareWalRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/walletshare/{walletId}/acceptshare")
  Call<AcceptWalletShareResponse> acceptWalletShare(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body AcceptWalletShareRequest acceptWalletShareRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/signtx")
  Call<SignTransactionResponse> signTransaction(
      @Path("coin") String coin, @Body SignTransactionRequest signTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/signtx")
  Call<SignTransactionResponse> signWalletTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SignWalletTransactionRequest signWalletTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/signtxtss")
  Call<SignTSSTransactionResponse> signTSSTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SignTSSTransactionRequest signTSSTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/recovertoken")
  Call<RecoverETHTokenResponse> recoverETHToken(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body RecoverTokenRequest recoverTokenRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/consolidateAccount/build")
  Call<ConsolidateAccountResponse> consolidateAccount(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body ConsolidateAccountRequest consolidateAccountRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/consolidateunspents")
  Call<TransactionResponse> consolidateUnspents(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body UnspentsRequest unspentsRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/fanoutunspents")
  Call<TransactionResponse> fanOutUnspents(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body UnspentsRequest unspentsRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/sweep")
  Call<TransactionResponse> sweepFunds(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body SweepFundsRequest sweepFundsRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/acceleratetx")
  Call<TransactionResponse> accelerateTransaction(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body AccelerateTransactionRequest accelerateTransactionRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/canonicaladdress")
  Call<CanonicalizeAddressResponse> canonicalizeAddress(
      @Path("coin") String coin, @Body CanonicalizeAddressRequest canonicalizeAddressRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/verifyaddress")
  Call<VerifyAddressResponse> verifyAddress(
      @Path("coin") String coin, @Body VerifyAddressRequest verifyAddressRequest);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/{coin}/pendingapprovals/{approvalId}")
  Call<ResolvePendingApprovalResponse> resolvePendingApproval(
      @Path("coin") String coin,
      @Path("approvalId") String approvalId,
      @Body ResolvePendingApprovalRequest resolvePendingApprovalRequest);
}
