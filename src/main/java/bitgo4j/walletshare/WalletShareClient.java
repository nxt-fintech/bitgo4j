package bitgo4j.walletshare;

import bitgo4j.walletshare.request.CreateWalletShareRequest;
import bitgo4j.walletshare.request.RejectWalletShareRequest;
import bitgo4j.walletshare.request.UpdateWalletShareRequest;
import bitgo4j.walletshare.response.CancelWalletShareResponse;
import bitgo4j.walletshare.response.ListWalletShareResponse;
import bitgo4j.walletshare.response.ResendWalletShareEmailResponse;
import bitgo4j.walletshare.response.UpdateWalletShareResponse;
import bitgo4j.walletshare.response.WalletShareResponse;

public interface WalletShareClient {
  void request(String coin, String walletId);

  WalletShareResponse create(
      String coin, String walletId, CreateWalletShareRequest createWalletShareRequest);

  void reject(String walletId, RejectWalletShareRequest rejectWalletShareRequest);

  ListWalletShareResponse list();

  WalletShareResponse get(String coin, String shareId);

  UpdateWalletShareResponse update(
      String coin, String shareId, UpdateWalletShareRequest updateWalletShareRequest);

  CancelWalletShareResponse cancel(String coin, String shareId);

  ResendWalletShareEmailResponse resendMail(String coin, String shareId);
}
