package bitgo4j.wallet;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
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

public class WalletClientImpl implements WalletClient {
  private final WalletService service;

  public WalletClientImpl(BitGo4jConfig config) {
    service = createService(WalletService.class, config);
  }

  @Override
  public AddressResponse createAddress(
      String coin, String walletId, CreateAddressRequest createAddressRequest) {
    return executeSync(service.createAddress(coin, walletId, createAddressRequest));
  }

  @Override
  public List<PotentialStuckTxsResponse> getPotentialStuckTxs(String coin, String walletId) {
    return executeSync(service.getPotentialStuckTxs(coin, walletId));
  }

  @Override
  public AverageFeeResponse getAverageFee(String coin, Integer numBlocks) {
    return executeSync(service.getAverageFee(coin, numBlocks));
  }

  @Override
  public ListTransferResponse listTransfers(
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
      List<String> memoId) {
    return executeSync(
        service.listTransfers(
            coin,
            walletId,
            allTokens,
            dateGte,
            dateLt,
            height,
            limit,
            prevId,
            state,
            type,
            valueGte,
            valueLt,
            id,
            pendingApprovalId,
            address,
            includeHex,
            memoId));
  }

  // FIXME:
  @Override
  public WalletResponse add(String coin, AddWalletRequest addWalletRequest) {
    return null;
  }

  @Override
  public ListWalletResponse listByCoin(
      String coin,
      String prevId,
      Integer limit,
      Boolean allTokens,
      String searchLabel,
      Boolean showAllWallets) {
    return executeSync(
        service.listByCoin(coin, prevId, limit, allTokens, searchLabel, showAllWallets));
  }

  @Override
  public ListWalletResponse list(
      String coin,
      List<Boolean> deleted,
      List<String> enterprise,
      Boolean enterpriseIsNull,
      List<String> id,
      String labelContains,
      Integer limit,
      String prevId,
      List<String> type,
      Boolean expandCustodialWallet) {
    return executeSync(
        service.list(
            coin,
            deleted,
            enterprise,
            enterpriseIsNull,
            id,
            labelContains,
            limit,
            prevId,
            type,
            expandCustodialWallet));
  }

  @Override
  public WalletResponse getByAddress(String coin, String address) {
    return executeSync(service.getByAddress(coin, address));
  }

  @Override
  public WalletResponse get(String coin, String walletId, Boolean allTokens) {
    return executeSync(service.get(coin, walletId, allTokens));
  }

  @Override
  public WalletResponse update(
      String coin, String walletId, UpdateWalletRequest updateWalletRequest) {
    return executeSync(service.update(coin, walletId, updateWalletRequest));
  }

  @Override
  public WalletResponse delete(String coin, String walletId) {
    return executeSync(service.delete(coin, walletId));
  }

  @Override
  public WalletResponse removeUser(String coin, String walletId, String userId) {
    return executeSync(service.removeUser(coin, walletId, userId));
  }

  @Override
  public FreezeWalletResponse freeze(String coin, String walletId, Integer duration) {
    return executeSync(service.freeze(coin, walletId, duration));
  }

  @Override
  public UnspentsResponse getUnspents(
      String coin,
      String walletId,
      Integer limit,
      Integer maxValue,
      Integer minConfirms,
      Boolean enforceMinConfirmsForChange,
      Integer minHeight,
      Integer minValue,
      String prevId,
      Boolean segwit) {
    return executeSync(
        service.getUnspents(
            coin,
            walletId,
            limit,
            maxValue,
            minConfirms,
            enforceMinConfirmsForChange,
            minHeight,
            minValue,
            prevId,
            segwit));
  }

  @Override
  public MaximumSpendableResponse getMaximumSpendable(
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
      Integer numBlocks) {
    return executeSync(
        service.getMaximumSpendable(
            coin,
            walletId,
            allTokens,
            enforceMinConfirmsForChange,
            feeRate,
            limit,
            maxFeeRate,
            maxValue,
            minConfirms,
            minHeight,
            minValue,
            numBlocks));
  }

  @Override
  public SpendingLimitsAndCurrentAmountSpentResponse getSpendingLimitAndCurrentAmountSpent(
      String coin, String walletId) {
    return executeSync(service.getSpendingLimitAndCurrentAmountSpent(coin, walletId));
  }

  @Override
  public UnspentReservationResponse makeUnspentReservation(
      String walletId, MakeUnspentReservationRequest makeUnspentReservationRequest) {
    return executeSync(service.makeUnspentReservation(walletId, makeUnspentReservationRequest));
  }

  @Override
  public UnspentReservationResponse releaseUnspentReservation(String walletId, List<String> id) {
    return executeSync(service.releaseUnspentReservation(walletId, id));
  }

  @Override
  public UnspentReservationResponse listUnspentReservation(
      String walletId, String prevId, Integer limit, String expireTimeGt, String expireTimeLte) {
    return executeSync(
        service.listUnspentReservation(walletId, prevId, limit, expireTimeGt, expireTimeLte));
  }

  @Override
  public UnspentReservationResponse modifyUnspentReservation(
      String walletId, ModifyUnspentReservationRequest modifyUnspentReservationRequest) {
    return executeSync(
        service.modifyUnspentReservation(walletId, modifyUnspentReservationRequest));
  }

  @Override
  public ListTotalBalanceResponse listTotalBalances(
      List<String> coin,
      List<Boolean> deleted,
      List<String> enterprise,
      List<String> id,
      String labelContains,
      List<String> type,
      Boolean expandCustodialWallet) {
    return executeSync(
        service.listTotalBalances(
            coin, deleted, enterprise, id, labelContains, type, expandCustodialWallet));
  }

  @Override
  public BuildTransactionResponse buildTransaction(
      String coin, String walletId, BuildTransactionRequest buildTransactionRequest) {
    return executeSync(service.buildTransaction(coin, walletId, buildTransactionRequest));
  }

  @Override
  public InitiateTransactionResponse initiateTransaction(
      String coin, String walletId, InitiateTransactionRequest initiateTransactionRequest) {
    return executeSync(
        service.initiateTransaction(coin, walletId, initiateTransactionRequest));
  }

  @Override
  public SendHalfSignedTransactionResponse sendHalfSignedTransaction(
      String coin,
      String walletId,
      SendHalfSignedTransactionRequest sendHalfSignedTransactionRequest) {
    return executeSync(
        service.sendHalfSignedTransaction(coin, walletId, sendHalfSignedTransactionRequest));
  }

  @Override
  public InitiateTransactionResponse initiateTrustLineTransaction(
      String coin,
      String walletId,
      InitiateTrustlineTransactionRequest initiateTrustlineTransactionRequest) {
    return executeSync(
        service.initiateTrustLineTransaction(
            coin, walletId, initiateTrustlineTransactionRequest));
  }

  @Override
  public BalanceReserveDataResponse getBalanceReserveData(String coin) {
    return executeSync(service.getBalanceReserveData(coin));
  }

  @Override
  public List<StakedBalanceDataResponse> getStackedBalanceData(String coin, String walletId) {
    return executeSync(service.getStackedBalanceData(coin, walletId));
  }

  @Override
  public List<TotalRewardsDataResponse> getTotalRewardsData(String coin, String walletId) {
    return executeSync(service.getTotalRewardsData(coin, walletId));
  }
}
