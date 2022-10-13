package bitgo4j.enterprise;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
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

public class EnterpriseClientImpl implements EnterpriseClient {
  private final EnterpriseService service;

  public EnterpriseClientImpl(BitGo4jConfig config) {
    service = createService(EnterpriseService.class, config);
  }

  @Override
  public EnterpriseResponse get(String enterpriseId) {
    return executeSync(service.get(enterpriseId));
  }

  @Override
  public EnterpriseResponse update(
      String enterpriseId, UpdateEnterpriseRequest updateEnterpriseRequest) {
    return executeSync(service.update(enterpriseId, updateEnterpriseRequest));
  }

  @Override
  public ListEnterprisesResponse list() {
    return executeSync(service.list());
  }

  @Override
  public ListEnterpriseUsersResponse listUsers(String enterpriseId, Boolean allowInactiveAdmins) {
    return executeSync(service.listUsers(enterpriseId, allowInactiveAdmins));
  }

  @Override
  public UserResponse addUser(String enterpriseId, AddUserRequest addUserRequest) {
    return executeSync(service.addUser(enterpriseId, addUserRequest));
  }

  @Override
  public UserResponse removeUser(String enterpriseId, RemoveUserRequest removeUserRequest) {
    return executeSync(service.removeUser(enterpriseId, removeUserRequest));
  }

  @Override
  public FreezeEnterpriseResponse freeze(
      String enterpriseId, FreezeEnterpriseRequest freezeEnterpriseRequest) {
    return executeSync(service.freeze(enterpriseId, freezeEnterpriseRequest));
  }

  @Override
  public List<EnterpriseWalletLimitResponse> getWalletLimits(
      String enterpriseId, String coin, String isCustodial) {
    return executeSync(service.getWalletLimits(enterpriseId, coin, isCustodial));
  }
}
