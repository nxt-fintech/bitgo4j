package bitgo4j.transactionrequest;

import bitgo4j.transactionrequest.request.CreateTransactionRequestRequest;
import bitgo4j.transactionrequest.request.SignatureShareRequest;
import bitgo4j.transactionrequest.request.UpdateTransactionRequestRequest;
import bitgo4j.transactionrequest.response.ListTransactionRequestResponse;
import bitgo4j.transactionrequest.response.SignatureShareResponse;
import bitgo4j.transactionrequest.response.TransactionRequestResponse;
import bitgo4j.transactionrequest.response.TransferResponse;
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

public interface TransactionRequestService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/enterprise/{enterpriseId}/txrequests")
  Call<ListTransactionRequestResponse> getByEnterprise(
      @Path("enterpriseId") String enterpriseId,
      @Query("prevId") String prevId,
      @Query("limit") Integer limit,
      @Query("latest") Boolean latest,
      @Query("states") List<String> states,
      @Query("txRequestIds") List<String> txRequestIds,
      @Query("idempotencyKeys") List<String> idempotencyKeys,
      @Query("walletIds") List<String> walletIds);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/txrequests")
  Call<TransactionRequestResponse> create(
      @Path("walletId") String walletId,
      @Body CreateTransactionRequestRequest createTransactionRequestRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/wallet/{walletId}/txrequests")
  Call<ListTransactionRequestResponse> getByWallet(
      @Path("walletId") String walletId,
      @Query("prevId") String prevId,
      @Query("limit") Integer limit,
      @Query("latest") Boolean latest,
      @Query("states") List<String> states,
      @Query("txRequestIds") List<String> txRequestIds,
      @Query("idempotencyKeys") List<String> idempotencyKeys);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/wallet/{walletId}/txrequests/{id}")
  Call<TransactionRequestResponse> update(
      @Path("walletId") String walletId,
      @Path("id") String id,
      @Body UpdateTransactionRequestRequest updateTransactionRequestRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/txrequests/{id}/signatureshares")
  Call<SignatureShareResponse> createSignatureShare(
      @Path("walletId") String walletId,
      @Path("id") String id,
      @Body SignatureShareRequest signatureShareRequest);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/wallet/{walletId}/txrequests/{id}/signatureshares")
  Call<List<SignatureShareResponse>> deleteSignatureShare(
      @Path("walletId") String walletId, @Path("id") String id);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/txrequests/{id}/transactions/{transactionIdx}/signatureshares")
  Call<SignatureShareResponse> createSignatureShare(
      @Path("walletId") String walletId,
      @Path("id") String id,
      @Path("transactionIdx") String transactionIdx,
      @Body SignatureShareRequest signatureShareRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/txrequests/{id}/transfers")
  Call<TransferResponse> createTransferResponse(
      @Path("walletId") String walletId, @Path("id") String id);
}
