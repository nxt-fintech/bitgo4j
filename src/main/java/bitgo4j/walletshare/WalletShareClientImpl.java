package bitgo4j.walletshare;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.walletshare.request.CreateWalletShareRequest;
import bitgo4j.walletshare.request.RejectWalletShareRequest;
import bitgo4j.walletshare.request.UpdateWalletShareRequest;
import bitgo4j.walletshare.response.CancelWalletShareResponse;
import bitgo4j.walletshare.response.ListWalletShareResponse;
import bitgo4j.walletshare.response.ResendWalletShareEmailResponse;
import bitgo4j.walletshare.response.UpdateWalletShareResponse;
import bitgo4j.walletshare.response.WalletShareResponse;

public class WalletShareClientImpl implements WalletShareClient {
  private final WalletShareService service;

  public WalletShareClientImpl(BitGo4jConfig config) {
    service = createService(WalletShareService.class, config);
  }

  @Override
  public void request(String coin, String walletId) {
    executeSync(service.request(coin, walletId));
  }

  @Override
  public WalletShareResponse create(
      String coin, String walletId, CreateWalletShareRequest createWalletShareRequest) {
    return executeSync(service.create(coin, walletId, createWalletShareRequest));
  }

  @Override
  public void reject(String walletId, RejectWalletShareRequest rejectWalletShareRequest) {
    executeSync(service.reject(walletId, rejectWalletShareRequest));
  }

  @Override
  public ListWalletShareResponse list() {
    return executeSync(service.list());
  }

  @Override
  public WalletShareResponse get(String coin, String shareId) {
    return executeSync(service.get(coin, shareId));
  }

  @Override
  public UpdateWalletShareResponse update(
      String coin, String shareId, UpdateWalletShareRequest updateWalletShareRequest) {
    return executeSync(service.update(coin, shareId, updateWalletShareRequest));
  }

  @Override
  public CancelWalletShareResponse cancel(String coin, String shareId) {
    return executeSync(service.cancel(coin, shareId));
  }

  @Override
  public ResendWalletShareEmailResponse resendMail(String coin, String shareId) {
    return executeSync(service.resendMail(coin, shareId));
  }
}
