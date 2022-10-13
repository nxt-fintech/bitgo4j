package bitgo4j.webhook;

import bitgo4j.webhook.request.AddBlockWebhookRequest;
import bitgo4j.webhook.request.AddWalletWebhookRequest;
import bitgo4j.webhook.request.RemoveBlockWebhookRequest;
import bitgo4j.webhook.request.RemoveWalletWebhookRequest;
import bitgo4j.webhook.request.SimulateBlockWebhookRequest;
import bitgo4j.webhook.request.SimulateWalletWebhookRequest;
import bitgo4j.webhook.response.BlockWebhookResponse;
import bitgo4j.webhook.response.ListBlockWebhookResponse;
import bitgo4j.webhook.response.ListWalletWebhookResponse;
import bitgo4j.webhook.response.RemoveBlockWebhookResponse;
import bitgo4j.webhook.response.RemoveWalletWebhookResponse;
import bitgo4j.webhook.response.SimulateBlockWebhookResponse;
import bitgo4j.webhook.response.SimulateWalletWebhookResponse;
import bitgo4j.webhook.response.WalletWebhookResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface WebhookService {
  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/webhooks")
  Call<WalletWebhookResponse> addWalletWebhook(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body AddWalletWebhookRequest request);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/wallet/{walletId}/webhooks")
  Call<ListWalletWebhookResponse> listWalletWebhooks(
      @Path("coin") String coin, @Path("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @HTTP(method = "DELETE", path = "/api/v2/{coin}/wallet/{walletId}/webhooks", hasBody = true)
  Call<RemoveWalletWebhookResponse> removeWalletWebhook(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Body RemoveWalletWebhookRequest request);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/wallet/{walletId}/webhooks/{webhookId}/simulate")
  Call<SimulateWalletWebhookResponse> simulateWalletWebhook(
      @Path("coin") String coin,
      @Path("walletId") String walletId,
      @Path("webhookId") String webhookId,
      @Body SimulateWalletWebhookRequest request);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/webhooks")
  Call<BlockWebhookResponse> addBlockWebhook(
      @Path("coin") String coin, @Body AddBlockWebhookRequest request);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/{coin}/webhooks")
  Call<ListBlockWebhookResponse> listBlockWebhooks(@Path("coin") String coin);

  @Headers({"Accept: application/json"})
  @HTTP(method = "DELETE", path = "/api/v2/{coin}/webhooks", hasBody = true)
  Call<RemoveBlockWebhookResponse> removeBlockWebhook(
      @Path("coin") String coin, @Body RemoveBlockWebhookRequest request);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/{coin}/webhooks/{webhookId}/simulate")
  Call<SimulateBlockWebhookResponse> simulateBlockWebhook(
      @Path("coin") String coin,
      @Path("webhookId") String webhookId,
      @Body SimulateBlockWebhookRequest request);
}
