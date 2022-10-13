package bitgo4j.transfer;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.transfer.request.ChangeFeeRequest;
import bitgo4j.transfer.request.UpdateCommentRequest;
import bitgo4j.transfer.response.ChangeFeeResponse;
import bitgo4j.transfer.response.FeeEstimateResponse;
import bitgo4j.transfer.response.ListTransferResponse;
import bitgo4j.transfer.response.TransferResponse;
import java.util.List;

public class TransferClientImpl implements TransferClient {
  private final TransferService service;

  public TransferClientImpl(BitGo4jConfig config) {
    service = createService(TransferService.class, config);
  }

  @Override
  public ListTransferResponse listEnterprise(
      String enterpriseId,
      String dateGte,
      String dateLt,
      Integer limit,
      String prevId,
      String state,
      String type) {
    return executeSync(
        service.listEnterprise(enterpriseId, dateGte, dateLt, limit, prevId, state, type));
  }

  @Override
  public ListTransferResponse listEnterpriseByCoin(
      String coin, String enterpriseId, String height) {
    return executeSync(service.listEnterpriseByCoin(coin, enterpriseId, height));
  }

  @Override
  public FeeEstimateResponse getFeeEstimate(
      String coin, Integer numBlocks, String recipient, String data, String amount, Boolean hop) {
    return executeSync(
        service.getFeeEstimate(coin, numBlocks, recipient, data, amount, hop));
  }

  @Override
  public ListTransferResponse list(
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
        service.list(
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

  @Override
  public TransferResponse get(String coin, String walletId, String transferId) {
    return executeSync(service.get(coin, walletId, transferId));
  }

  @Override
  public TransferResponse getBySequenceId(String coin, String walletId, String sequenceId) {
    return executeSync(service.getBySequenceId(coin, walletId, sequenceId));
  }

  @Override
  public TransferResponse updateComment(
      String coin, String walletId, String transferId, UpdateCommentRequest updateCommentRequest) {
    return executeSync(service.updateComment(coin, walletId, transferId, updateCommentRequest));
  }

  @Override
  public ChangeFeeResponse changeFee(
      String coin, String walletId, ChangeFeeRequest changeFeeRequest) {
    return executeSync(service.changeFee(coin, walletId, changeFeeRequest));
  }
}
