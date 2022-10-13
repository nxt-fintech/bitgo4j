package bitgo4j.transactionrequest;

import bitgo4j.transactionrequest.request.CreateTransactionRequestRequest;
import bitgo4j.transactionrequest.request.SignatureShareRequest;
import bitgo4j.transactionrequest.request.UpdateTransactionRequestRequest;
import bitgo4j.transactionrequest.response.ListTransactionRequestResponse;
import bitgo4j.transactionrequest.response.SignatureShareResponse;
import bitgo4j.transactionrequest.response.TransactionRequestResponse;
import bitgo4j.transactionrequest.response.TransferResponse;
import java.util.List;

public interface TransactionRequestClient {
  ListTransactionRequestResponse getByEnterprise(
      String enterpriseId,
      String prevId,
      Integer limit,
      Boolean latest,
      List<String> states,
      List<String> txRequestIds,
      List<String> idempotencyKeys,
      List<String> walletIds);

  TransactionRequestResponse create(
      String walletId, CreateTransactionRequestRequest createTransactionRequestRequest);

  ListTransactionRequestResponse getByWallet(
      String walletId,
      String prevId,
      Integer limit,
      Boolean latest,
      List<String> states,
      List<String> txRequestIds,
      List<String> idempotencyKeys);

  TransactionRequestResponse update(
      String walletId, String id, UpdateTransactionRequestRequest updateTransactionRequestRequest);

  SignatureShareResponse createSignatureShare(
      String walletId, String id, SignatureShareRequest signatureShareRequest);

  List<SignatureShareResponse> deleteSignatureShare(String walletId, String id);

  SignatureShareResponse createSignatureShare(
      String walletId,
      String id,
      String transactionIdx,
      SignatureShareRequest signatureShareRequest);

  TransferResponse createTransferResponse(String walletId, String id);
}
