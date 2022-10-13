package bitgo4j.walletshare;

import bitgo4j.walletshare.request.CreateWalletShareRequest;
import bitgo4j.walletshare.request.RejectWalletShareRequest;
import bitgo4j.walletshare.request.UpdateWalletShareRequest;
import bitgo4j.walletshare.response.CancelWalletShareResponse;
import bitgo4j.walletshare.response.ListWalletShareResponse;
import bitgo4j.walletshare.response.ResendWalletShareEmailResponse;
import bitgo4j.walletshare.response.UpdateWalletShareResponse;
import bitgo4j.walletshare.response.WalletShareResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface WalletShareService {
  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/requestreshare")
  Call<Void> request(@Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/share")
  Call<WalletShareResponse> create(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body CreateWalletShareRequest createWalletShareRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/wallet/{walletId}/rejectreshare")
  Call<Void> reject(@Path("walletId") String walletId, @Body RejectWalletShareRequest userId);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/walletshares")
  Call<ListWalletShareResponse> list();

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/walletshare/{shareId}")
  Call<WalletShareResponse> get(@Path("coin") String coin, @Path("shareId") String shareId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/walletshare/{shareId}")
  Call<UpdateWalletShareResponse> update(
      @Path("coin") String coin,
      @Path("shareId") String shareId,
      @Body UpdateWalletShareRequest state);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/{coin}/walletshare/{shareId}")
  Call<CancelWalletShareResponse> cancel(
      @Path("coin") String coin, @Path("shareId") String shareId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/walletshare/{shareId}/resendemail")
  Call<ResendWalletShareEmailResponse> resendMail(
      @Path("coin") String coin, @Path("shareId") String shareId);
}
