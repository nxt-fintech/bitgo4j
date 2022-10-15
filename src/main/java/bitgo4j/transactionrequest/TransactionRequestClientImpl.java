package bitgo4j.transactionrequest;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.transactionrequest.request.CreateTransactionRequestRequest;
import bitgo4j.transactionrequest.request.SignatureShareRequest;
import bitgo4j.transactionrequest.request.UpdateTransactionRequestRequest;
import bitgo4j.transactionrequest.response.ListTransactionRequestResponse;
import bitgo4j.transactionrequest.response.SignatureShareResponse;
import bitgo4j.transactionrequest.response.TransactionRequestResponse;
import bitgo4j.transactionrequest.response.TransferResponse;
import java.util.List;

public class TransactionRequestClientImpl implements TransactionRequestClient {
  private final TransactionRequestService service;

  public TransactionRequestClientImpl(BitGo4jConfig config) {
    service = createService(TransactionRequestService.class, config);
  }

  @Override
  public ListTransactionRequestResponse getByEnterprise(
      String enterpriseId,
      String prevId,
      Integer limit,
      Boolean latest,
      List<String> states,
      List<String> txRequestIds,
      List<String> idempotencyKeys,
      List<String> walletIds) {
    return executeSync(
        service.getByEnterprise(
            enterpriseId, prevId, limit, latest, states, txRequestIds, idempotencyKeys, walletIds));
  }

  @Override
  public TransactionRequestResponse create(
      String walletId, CreateTransactionRequestRequest createTransactionRequestRequest) {
    return executeSync(service.create(walletId, createTransactionRequestRequest));
  }

  @Override
  public ListTransactionRequestResponse getByWallet(
      String walletId,
      String prevId,
      Integer limit,
      Boolean latest,
      List<String> states,
      List<String> txRequestIds,
      List<String> idempotencyKeys) {
    return executeSync(
        service.getByWallet(
            walletId, prevId, limit, latest, states, txRequestIds, idempotencyKeys));
  }

  @Override
  public TransactionRequestResponse update(
      String walletId, String id, UpdateTransactionRequestRequest updateTransactionRequestRequest) {
    return executeSync(service.update(walletId, id, updateTransactionRequestRequest));
  }

  @Override
  public SignatureShareResponse createSignatureShare(
      String walletId, String id, SignatureShareRequest signatureShareRequest) {
    return executeSync(service.createSignatureShare(walletId, id, signatureShareRequest));
  }

  @Override
  public List<SignatureShareResponse> deleteSignatureShare(String walletId, String id) {
    return executeSync(service.deleteSignatureShare(walletId, id));
  }

  @Override
  public SignatureShareResponse createSignatureShare(
      String walletId,
      String id,
      String transactionIdx,
      SignatureShareRequest signatureShareRequest) {
    return executeSync(
        service.createSignatureShare(walletId, id, transactionIdx, signatureShareRequest));
  }

  @Override
  public TransferResponse createTransferResponse(String walletId, String id) {
    return executeSync(service.createTransferResponse(walletId, id));
  }
}
