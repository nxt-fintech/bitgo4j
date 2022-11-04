package bitgo4j.express;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.express.request.AccelerateTransactionRequest;
import bitgo4j.express.request.AcceptWalletShareRequest;
import bitgo4j.express.request.CalculateMiningFeeRequest;
import bitgo4j.express.request.CanonicalizeAddressRequest;
import bitgo4j.express.request.ConsolidateAccountRequest;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.CryptRequest;
import bitgo4j.express.request.GenerateWalletRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.request.RecoverTokenRequest;
import bitgo4j.express.request.ResolvePendingApprovalRequest;
import bitgo4j.express.request.SendToManyRequest;
import bitgo4j.express.request.SendTransactionRequest;
import bitgo4j.express.request.ShareWalletRequest;
import bitgo4j.express.request.SignTSSTransactionRequest;
import bitgo4j.express.request.SignTransactionRequest;
import bitgo4j.express.request.SignWalletTransactionRequest;
import bitgo4j.express.request.SweepFundsRequest;
import bitgo4j.express.request.UnspentsRequest;
import bitgo4j.express.request.VerifyAddressRequest;
import bitgo4j.express.response.AcceptWalletShareResponse;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.CalculateMiningFeeResponse;
import bitgo4j.express.response.CanonicalizeAddressResponse;
import bitgo4j.express.response.ConsolidateAccountResponse;
import bitgo4j.express.response.DecryptResponse;
import bitgo4j.express.response.EncryptResponse;
import bitgo4j.express.response.KeyResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.RecoverETHTokenResponse;
import bitgo4j.express.response.ResolvePendingApprovalResponse;
import bitgo4j.express.response.ShareWalletResponse;
import bitgo4j.express.response.SignTSSTransactionResponse;
import bitgo4j.express.response.SignTransactionResponse;
import bitgo4j.express.response.TransactionResponse;
import bitgo4j.express.response.VerifyAddressResponse;
import bitgo4j.express.response.WalletResponse;

public class ExpressClientImpl implements ExpressClient {
  private final ExpressService service;

  public ExpressClientImpl(BitGo4jConfig config) {
    service = createService(ExpressService.class, config);
  }

  @Override
  public LoginResponse login(LoginRequest loginRequest) {
    return executeSync(service.login(loginRequest));
  }

  @Override
  public AddressResponse createAddress(
      String coin, String walletId, CreateAddressRequest createAddress) {
    return executeSync(service.createAddress(coin, walletId, createAddress));
  }

  @Override
  public PingResponse ping() {
    return executeSync(service.ping());
  }

  @Override
  public TransactionResponse sendTransaction(
      String coin, String walletId, SendTransactionRequest sendTransactionRequest) {
    return executeSync(service.sendTransaction(coin, walletId, sendTransactionRequest));
  }

  @Override
  public TransactionResponse sendToMany(
      String coin, String walletId, SendToManyRequest sendToManyRequest) {
    return executeSync(service.sendToMany(coin, walletId, sendToManyRequest));
  }

  @Override
  public EncryptResponse encryptMessages(CryptRequest cryptRequest) {
    return executeSync(service.encryptMessages(cryptRequest));
  }

  @Override
  public DecryptResponse decryptMessages(CryptRequest cryptRequest) {
    return executeSync(service.decryptMessages(cryptRequest));
  }

  @Override
  public CalculateMiningFeeResponse calculateMiningFee(
      CalculateMiningFeeRequest calculateMiningFeeRequest) {
    return executeSync(service.calculateMiningFee(calculateMiningFeeRequest));
  }

  @Override
  public KeyResponse createKey(String coin) {
    return executeSync(service.createKey(coin));
  }

  @Override
  public WalletResponse generateWallet(
      String coin, Boolean includeKeyChains, GenerateWalletRequest generateWalletRequest) {
    return executeSync(
        service.generateWallet(coin, includeKeyChains, generateWalletRequest));
  }

  @Override
  public ShareWalletResponse shareWallet(
      String coin, String walletId, ShareWalletRequest shareWalletRequest) {
    return executeSync(service.shareWallet(coin, walletId, shareWalletRequest));
  }

  @Override
  public AcceptWalletShareResponse acceptWalletShare(
      String coin, String walletId, AcceptWalletShareRequest acceptWalletShareRequest) {
    return executeSync(service.acceptWalletShare(coin, walletId, acceptWalletShareRequest));
  }

  @Override
  public SignTransactionResponse signTransaction(
      String coin, SignTransactionRequest signTransactionRequest) {
    return executeSync(service.signTransaction(coin, signTransactionRequest));
  }

  @Override
  public SignTransactionResponse signWalletTransaction(
      String coin, String walletId, SignWalletTransactionRequest signWalletTransactionRequest) {
    return executeSync(
        service.signWalletTransaction(coin, walletId, signWalletTransactionRequest));
  }

  @Override
  public SignTSSTransactionResponse signTSSTransaction(
      String coin, String walletId, SignTSSTransactionRequest signTSSTransactionRequest) {
    return executeSync(service.signTSSTransaction(coin, walletId, signTSSTransactionRequest));
  }

  @Override
  public RecoverETHTokenResponse recoverETHToken(
      String coin, String walletId, RecoverTokenRequest recoverTokenRequest) {
    return executeSync(service.recoverETHToken(coin, walletId, recoverTokenRequest));
  }

  @Override
  public ConsolidateAccountResponse consolidateAccount(
      String coin, String walletId, ConsolidateAccountRequest consolidateAccountRequest) {
    return executeSync(
        service.consolidateAccount(coin, walletId, consolidateAccountRequest));
  }

  @Override
  public TransactionResponse consolidateUnspents(
      String coin, String walletId, UnspentsRequest unspentsRequest) {
    return executeSync(service.consolidateUnspents(coin, walletId, unspentsRequest));
  }

  @Override
  public TransactionResponse fanOutUnspents(
      String coin, String walletId, UnspentsRequest unspentsRequest) {
    return executeSync(service.fanOutUnspents(coin, walletId, unspentsRequest));
  }

  @Override
  public TransactionResponse sweepFunds(
      String coin, String walletId, SweepFundsRequest sweepFundsRequest) {
    return executeSync(service.sweepFunds(coin, walletId, sweepFundsRequest));
  }

  @Override
  public TransactionResponse accelerateTransaction(
      String coin, String walletId, AccelerateTransactionRequest accelerateTransactionRequest) {
    return executeSync(service.accelerateTransaction(coin, walletId, accelerateTransactionRequest));
  }

  @Override
  public CanonicalizeAddressResponse canonicalizeAddress(
      String coin, CanonicalizeAddressRequest canonicalizeAddressRequest) {
    return executeSync(service.canonicalizeAddress(coin, canonicalizeAddressRequest));
  }

  @Override
  public VerifyAddressResponse verifyAddress(
      String coin, VerifyAddressRequest verifyAddressRequest) {
    return executeSync(service.verifyAddress(coin, verifyAddressRequest));
  }

  @Override
  public ResolvePendingApprovalResponse resolvePendingApproval(
      String coin, String approvalId, ResolvePendingApprovalRequest resolvePendingApprovalRequest) {
    return executeSync(
        service.resolvePendingApproval(coin, approvalId, resolvePendingApprovalRequest));
  }

}
