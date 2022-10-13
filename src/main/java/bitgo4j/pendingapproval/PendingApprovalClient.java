package bitgo4j.pendingapproval;

import bitgo4j.pendingapproval.request.UpdatePendingApprovalRequest;
import bitgo4j.pendingapproval.response.ListPendingApprovalsResponse;
import bitgo4j.pendingapproval.response.PendingApprovalResponse;
import java.util.List;

public interface PendingApprovalClient {
  ListPendingApprovalsResponse list(
      String prevId,
      Integer limit,
      List<String> coin,
      String enterpriseId,
      List<String> state,
      String walletId);

  PendingApprovalResponse get(String id);

  PendingApprovalResponse update(
      String id, UpdatePendingApprovalRequest updatePendingApprovalRequest);
}
