package bitgo4j.express;

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
import bitgo4j.express.response.SignTransactionResponse;
import bitgo4j.express.response.TransactionResponse;
import bitgo4j.express.response.VerifyAddressResponse;
import bitgo4j.express.response.WalletResponse;

public interface ExpressClient {
  AddressResponse createAddress(
      String coin, String walletId, CreateAddressRequest createAddressRequest);

  LoginResponse login(LoginRequest loginRequest);

  PingResponse ping();

  TransactionResponse sendTransaction(
      String coin, String walletId, SendTransactionRequest sendTransactionRequest);

  TransactionResponse sendToMany(String coin, String walletId, SendToManyRequest sendToManyRequest);

  EncryptResponse encryptMessages(CryptRequest cryptRequest);

  DecryptResponse decryptMessages(CryptRequest cryptRequest);

  CalculateMiningFeeResponse calculateMiningFee(
      CalculateMiningFeeRequest calculateMiningFeeRequest);

  KeyResponse createKey(String coin);

  WalletResponse generateWallet(
      String coin, Boolean includeKeyChains, GenerateWalletRequest generateWalletRequest);

  ShareWalletResponse shareWallet(
      String coin, String walletId, ShareWalletRequest shareWalletRequest);

  AcceptWalletShareResponse acceptWalletShare(
      String coin, String walletId, AcceptWalletShareRequest acceptWalletShareRequest);

  SignTransactionResponse signTransaction(
      String coin, SignTransactionRequest signTransactionRequest);

  SignTransactionResponse signWalletTransaction(
      String coin, String walletId, SignWalletTransactionRequest signWalletTransactionRequest);

  SignTransactionResponse signTSSTransaction(String coin, String walletId, SignTSSTransactionRequest signTSSTransactionRequest);
  RecoverETHTokenResponse recoverETHToken(
      String coin, String walletId, RecoverTokenRequest recoverTokenRequest);

  ConsolidateAccountResponse consolidateAccount(
      String coin, String walletId, ConsolidateAccountRequest consolidateAccountRequest);

  TransactionResponse consolidateUnspents(
      String coin, String walletId, UnspentsRequest unspentsRequest);

  TransactionResponse fanOutUnspents(String coin, String walletId, UnspentsRequest unspentsRequest);

  TransactionResponse sweepFunds(String coin, String walletId, SweepFundsRequest sweepFundsRequest);

  TransactionResponse accelerateTransaction(
      String coin, String walletId, AccelerateTransactionRequest accelerateTransactionRequest);

  CanonicalizeAddressResponse canonicalizeAddress(
      String coin, CanonicalizeAddressRequest canonicalizeAddressRequest);

  VerifyAddressResponse verifyAddress(String coin, VerifyAddressRequest verificationRequest);

  ResolvePendingApprovalResponse resolvePendingApproval(
      String coin, String approvalId, ResolvePendingApprovalRequest resolvePendingApprovalRequest);
}
