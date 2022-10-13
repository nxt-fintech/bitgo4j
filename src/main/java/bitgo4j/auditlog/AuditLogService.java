package bitgo4j.auditlog;

import bitgo4j.auditlog.response.ListAuditLogResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface AuditLogService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/auditlog")
  Call<ListAuditLogResponse> list(
      @Query("coin") List<String> coin,
      @Query("enterpriseId") String enterpriseId,
      @Query("limit") Integer limit,
      @Query("prevId") String prevId,
      @Query("type") List<String> type,
      @Query("walletId") String walletId);
}
