package bitgo4j.wallet;

import bitgo4j.wallet.request.AddWalletRequest;
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

public interface WalletClient {
  AddressResponse createAddress(
      String coin, String walletId, CreateAddressRequest createAddressRequest);

  List<PotentialStuckTxsResponse> getPotentialStuckTxs(String coin, String walletId);

  AverageFeeResponse getAverageFee(String coin, Integer numBlocks);

  ListTransferResponse listTransfers(
      String coin,
      String walletId,
      Boolean allTokens,
      String dateGte,
      String dateLt,
      String height,
      Integer limit,
      String prevId,
      String state,
      String type,
      Integer valueGte,
      Integer valueLt,
      String id,
      String pendingApprovalId,
      List<String> address,
      Boolean includeHex,
      List<String> memoId);

  WalletResponse add(String coin, AddWalletRequest addWalletRequest);

  ListWalletResponse listByCoin(
      String coin,
      String prevId,
      Integer limit,
      Boolean allTokens,
      String searchLabel,
      Boolean showAllWallets);

  ListWalletResponse list(
      String coin,
      List<Boolean> deleted,
      List<String> enterprise,
      Boolean enterpriseIsNull,
      List<String> id,
      String labelContains,
      Integer limit,
      String prevId,
      List<String> type,
      Boolean expandCustodialWallet);

  WalletResponse getByAddress(String coin, String address);

  WalletResponse get(String coin, String walletId, Boolean allTokens);

  WalletResponse update(String coin, String walletId, UpdateWalletRequest updateWalletRequest);

  WalletResponse delete(String coin, String walletId);

  WalletResponse removeUser(String coin, String walletId, String userId);

  FreezeWalletResponse freeze(String coin, String walletId, Integer duration);

  UnspentsResponse getUnspents(
      String coin,
      String walletId,
      Integer limit,
      Integer maxValue,
      Integer minConfirms,
      Boolean enforceMinConfirmsForChange,
      Integer minHeight,
      Integer minValue,
      String prevId,
      Boolean segwit);

  MaximumSpendableResponse getMaximumSpendable(
      String coin,
      String walletId,
      Boolean allTokens,
      Boolean enforceMinConfirmsForChange,
      Integer feeRate,
      Integer limit,
      Integer maxFeeRate,
      Integer maxValue,
      Integer minConfirms,
      Integer minHeight,
      Integer minValue,
      Integer numBlocks);

  SpendingLimitsAndCurrentAmountSpentResponse getSpendingLimitAndCurrentAmountSpent(
      String coin, String walletId);

  UnspentReservationResponse makeUnspentReservation(
      String walletId, MakeUnspentReservationRequest makeUnspentReservationRequest);

  UnspentReservationResponse releaseUnspentReservation(String walletId, List<String> id);

  UnspentReservationResponse listUnspentReservation(
      String walletId, String prevId, Integer limit, String expireTimeGt, String expireTimeLte);

  UnspentReservationResponse modifyUnspentReservation(
      String walletId, ModifyUnspentReservationRequest modifyUnspentReservationRequest);

  ListTotalBalanceResponse listTotalBalances(
      List<String> coin,
      List<Boolean> deleted,
      List<String> enterprise,
      List<String> id,
      String labelContains,
      List<String> type,
      Boolean expandCustodialWallet);

  BuildTransactionResponse buildTransaction(
      String coin, String walletId, BuildTransactionRequest buildTransactionRequest);

  InitiateTransactionResponse initiateTransaction(
      String coin, String walletId, InitiateTransactionRequest initiateTransactionRequest);

  SendHalfSignedTransactionResponse sendHalfSignedTransaction(
      String coin,
      String walletId,
      SendHalfSignedTransactionRequest sendHalfSignedTransactionRequest);

  InitiateTransactionResponse initiateTrustLineTransaction(
      String coin,
      String walletId,
      InitiateTrustlineTransactionRequest initiateTrustlineTransactionRequest);

  BalanceReserveDataResponse getBalanceReserveData(String coin);

  List<StakedBalanceDataResponse> getStackedBalanceData(String coin, String walletId);

  List<TotalRewardsDataResponse> getTotalRewardsData(String coin, String walletId);
}
