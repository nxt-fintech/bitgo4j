package bitgo4j.pendingapproval;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.pendingapproval.request.UpdatePendingApprovalRequest;
import bitgo4j.pendingapproval.response.ListPendingApprovalsResponse;
import bitgo4j.pendingapproval.response.PendingApprovalResponse;
import java.util.List;

public class PendingApprovalClientImpl implements PendingApprovalClient {
  private final PendingApprovalService service;

  public PendingApprovalClientImpl(BitGo4jConfig config) {
    service = createService(PendingApprovalService.class, config);
  }

  @Override
  public ListPendingApprovalsResponse list(
      String prevId,
      Integer limit,
      List<String> coin,
      String enterpriseId,
      List<String> state,
      String walletId) {
    return executeSync(service.list(prevId, limit, coin, enterpriseId, state, walletId));
  }

  @Override
  public PendingApprovalResponse get(String id) {
    return executeSync(service.get(id));
  }

  @Override
  public PendingApprovalResponse update(
      String id, UpdatePendingApprovalRequest updatePendingApprovalRequest) {
    return executeSync(service.update(id, updatePendingApprovalRequest));
  }

}
