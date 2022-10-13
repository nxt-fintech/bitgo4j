package bitgo4j.transfer;

import bitgo4j.transfer.request.ChangeFeeRequest;
import bitgo4j.transfer.request.UpdateCommentRequest;
import bitgo4j.transfer.response.ChangeFeeResponse;
import bitgo4j.transfer.response.FeeEstimateResponse;
import bitgo4j.transfer.response.ListTransferResponse;
import bitgo4j.transfer.response.TransferResponse;
import java.util.List;

public interface TransferClient {
  ListTransferResponse listEnterprise(
      String enterpriseId,
      String dateGte,
      String dateLt,
      Integer limit,
      String prevId,
      String state,
      String type);

  ListTransferResponse listEnterpriseByCoin(String coin, String enterpriseId, String height);

  FeeEstimateResponse getFeeEstimate(
      String coin, Integer numBlocks, String recipient, String data, String amount, Boolean hop);

  ListTransferResponse list(
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

  TransferResponse get(String coin, String walletId, String transferId);

  TransferResponse getBySequenceId(String coin, String walletId, String sequenceId);

  TransferResponse updateComment(
      String coin, String walletId, String transferId, UpdateCommentRequest updateCommentRequest);

  ChangeFeeResponse changeFee(String coin, String walletId, ChangeFeeRequest changeFeeRequest);
}
