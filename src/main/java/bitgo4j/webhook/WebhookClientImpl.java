package bitgo4j.webhook;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
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

public class WebhookClientImpl implements WebhookClient {
  private final WebhookService service;

  public WebhookClientImpl(BitGo4jConfig config) {
    service = createService(WebhookService.class, config);
  }

  @Override
  public WalletWebhookResponse addWalletWebhook(
      String coin, String walletId, AddWalletWebhookRequest request) {
    return executeSync(service.addWalletWebhook(coin, walletId, request));
  }

  @Override
  public ListWalletWebhookResponse listWalletWebhooks(String coin, String walletId) {
    return executeSync(service.listWalletWebhooks(coin, walletId));
  }

  @Override
  public RemoveWalletWebhookResponse removeWalletWebhook(String coin, String walletId,
      RemoveWalletWebhookRequest request) {
    return executeSync(service.removeWalletWebhook(coin, walletId, request));
  }

  @Override
  public SimulateWalletWebhookResponse simulateWalletWebhook(String coin, String walletId,
      String webhookId, SimulateWalletWebhookRequest request) {
    return executeSync(service.simulateWalletWebhook(coin, walletId, webhookId, request));
  }

  @Override
  public BlockWebhookResponse addBlockWebhook(String coin, AddBlockWebhookRequest request) {
    return executeSync(service.addBlockWebhook(coin, request));
  }

  @Override
  public ListBlockWebhookResponse listBlockWebhooks(String coin) {
    return executeSync(service.listBlockWebhooks(coin));
  }

  @Override
  public RemoveBlockWebhookResponse removeBlockWebhook(String coin,
      RemoveBlockWebhookRequest request) {
    return executeSync(service.removeBlockWebhook(coin, request));
  }

  @Override
  public SimulateBlockWebhookResponse simulateBlockWebhook(String coin, String webhookId,
      SimulateBlockWebhookRequest request) {
    return executeSync(service.simulateBlockWebhook(coin, webhookId, request));
  }
}

