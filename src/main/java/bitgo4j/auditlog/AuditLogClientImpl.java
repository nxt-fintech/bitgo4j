package bitgo4j.auditlog;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.auditlog.response.ListAuditLogResponse;
import java.util.List;

public class AuditLogClientImpl implements AuditLogClient {
  private final AuditLogService service;

  public AuditLogClientImpl(BitGo4jConfig config) {
    service = createService(AuditLogService.class, config);
  }

  @Override
  public ListAuditLogResponse list(
      List<String> coin,
      String enterpriseId,
      Integer limit,
      String prevId,
      List<String> type,
      String walletId) {
    return executeSync(service.list(coin, enterpriseId, limit, prevId, type, walletId));
  }
}
