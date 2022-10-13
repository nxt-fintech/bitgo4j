package bitgo4j.enterprise;

import bitgo4j.enterprise.request.AddUserRequest;
import bitgo4j.enterprise.request.FreezeEnterpriseRequest;
import bitgo4j.enterprise.request.RemoveUserRequest;
import bitgo4j.enterprise.request.UpdateEnterpriseRequest;
import bitgo4j.enterprise.response.EnterpriseResponse;
import bitgo4j.enterprise.response.EnterpriseWalletLimitResponse;
import bitgo4j.enterprise.response.FreezeEnterpriseResponse;
import bitgo4j.enterprise.response.ListEnterpriseUsersResponse;
import bitgo4j.enterprise.response.ListEnterprisesResponse;
import bitgo4j.enterprise.response.UserResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EnterpriseService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/enterprise/{enterpriseId}")
  Call<EnterpriseResponse> get(@Path("enterpriseId") String enterpriseId);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/enterprise/{enterpriseId}")
  Call<EnterpriseResponse> update(
      @Path("enterpriseId") String enterpriseId,
      @Body UpdateEnterpriseRequest updateEnterpriseRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/enterprise")
  Call<ListEnterprisesResponse> list();

  @Headers({"Accept: application/json"})
  @GET("/api/v1/enterprise/{enterpriseId}/user")
  Call<ListEnterpriseUsersResponse> listUsers(
      @Path("enterpriseId") String enterpriseId,
      @Query("allowInactiveAdmins") Boolean allowInactiveAdmins);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/enterprise/{enterpriseId}/user")
  Call<UserResponse> addUser(
      @Path("enterpriseId") String enterpriseId, @Body AddUserRequest addUserRequest);

  @Headers({"Accept: application/json"})
  @HTTP(method = "DELETE", path = "/api/v2/enterprise/{enterpriseId}/user", hasBody = true)
  Call<UserResponse> removeUser(
      @Path("enterpriseId") String enterpriseId, @Body RemoveUserRequest removeUserRequest);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/enterprise/{enterpriseId}/freeze")
  Call<FreezeEnterpriseResponse> freeze(
      @Path("enterpriseId") String enterpriseId,
      @Body FreezeEnterpriseRequest freezeEnterpriseRequest);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/enterprise/{enterpriseId}/walletLimits")
  Call<List<EnterpriseWalletLimitResponse>> getWalletLimits(
      @Path("enterpriseId") String enterpriseId,
      @Query("coin") String coin,
      @Query("isCustodial") String custodial);
}
