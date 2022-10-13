package bitgo4j.auditlog;

import bitgo4j.auditlog.response.ListAuditLogResponse;
import java.util.List;

public interface AuditLogClient {
  ListAuditLogResponse list(
      List<String> coin,
      String enterpriseId,
      Integer limit,
      String prevId,
      List<String> type, // TODO: Enum
      String walletId);
}
