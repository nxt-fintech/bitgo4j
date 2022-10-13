package bitgo4j.transfer;

import bitgo4j.transfer.request.ChangeFeeRequest;
import bitgo4j.transfer.request.UpdateCommentRequest;
import bitgo4j.transfer.response.ChangeFeeResponse;
import bitgo4j.transfer.response.FeeEstimateResponse;
import bitgo4j.transfer.response.ListTransferResponse;
import bitgo4j.transfer.response.TransferResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TransferService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/enterprise/{enterpriseId}/transfer")
  Call<ListTransferResponse> listEnterprise(
      @Path("enterpriseId") String enterpriseId,
      @Query("dateGte") String dateGte,
      @Query("dateLt") String dateLt,
      @Query("limit") Integer limit,
      @Query("prevId") String prevId,
      @Query("state") String state,
      @Query("type") String type);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/transfer")
  Call<ListTransferResponse> listEnterpriseByCoin(
      @Path("coin") String coin,
      @Query("enterpriseId") String enterpriseId,
      @Query("height") String height);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/tx/fee")
  Call<FeeEstimateResponse> getFeeEstimate(
      @Path("coin") String coin,
      @Query("numBlocks") Integer numBlocks,
      @Query("recipient") String recipient,
      @Query("data") String data,
      @Query("amount") String amount,
      @Query("hop") Boolean hop);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/transfer")
  Call<ListTransferResponse> list(
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
  @GET("/api/v2/{coin}/wallet/{walletId}/transfer/{transferId}")
  Call<TransferResponse> get(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("transferId") String transferId);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/transfer/sequenceId/{sequenceId}")
  Call<TransferResponse> getBySequenceId(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("sequenceId") String sequenceId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/transfer/{transferId}/comment")
  Call<TransferResponse> updateComment(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("transferId") String transferId,
      @Body UpdateCommentRequest updateCommentRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/tx/changeFee")
  Call<ChangeFeeResponse> changeFee(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body ChangeFeeRequest changeFeeRequest);
}
