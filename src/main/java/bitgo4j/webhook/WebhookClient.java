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

public interface WebhookClient {
  WalletWebhookResponse addWalletWebhook(
      String coin, String walletId, AddWalletWebhookRequest request);

  ListWalletWebhookResponse listWalletWebhooks(String coin, String walletId);

  RemoveWalletWebhookResponse removeWalletWebhook(String coin, String walletId,
      RemoveWalletWebhookRequest request);

  SimulateWalletWebhookResponse simulateWalletWebhook(String coin, String walletId,
      String webhookId, SimulateWalletWebhookRequest request);

  BlockWebhookResponse addBlockWebhook(String coin, AddBlockWebhookRequest request);

  ListBlockWebhookResponse listBlockWebhooks(String coin);

  RemoveBlockWebhookResponse removeBlockWebhook(String coin, RemoveBlockWebhookRequest request);

  SimulateBlockWebhookResponse simulateBlockWebhook(String coin, String webhookId,
      SimulateBlockWebhookRequest request);
}
