package bitgo4j.pendingapproval;

import bitgo4j.pendingapproval.request.UpdatePendingApprovalRequest;
import bitgo4j.pendingapproval.response.ListPendingApprovalsResponse;
import bitgo4j.pendingapproval.response.PendingApprovalResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PendingApprovalService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/pendingApprovals")
  Call<ListPendingApprovalsResponse> list(
      @Query("prevId") String prevId,
      @Query("limit") Integer limit,
      @Query("coin") List<String> coin,
      @Query("enterpriseId") String enterpriseId,
      @Query("state") List<String> state,
      @Query("walletId") String walletId);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/pendingApprovals/{id}")
  Call<PendingApprovalResponse> get(@Path("id") String id);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/pendingApprovals/{id}")
  Call<PendingApprovalResponse> update(
      @Path("id") String id, @Body UpdatePendingApprovalRequest updatePendingApprovalRequest);
}
