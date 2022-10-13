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

public interface EnterpriseClient {
  EnterpriseResponse get(String enterpriseId);

  EnterpriseResponse update(String enterpriseId, UpdateEnterpriseRequest updateEnterpriseRequest);

  ListEnterprisesResponse list();

  ListEnterpriseUsersResponse listUsers(String enterpriseId, Boolean allowInactiveAdmins);

  UserResponse addUser(String enterpriseId, AddUserRequest addUserRequest);

  UserResponse removeUser(String enterpriseId, RemoveUserRequest removeUserRequest);

  FreezeEnterpriseResponse freeze(
      String enterpriseId, FreezeEnterpriseRequest freezeEnterpriseRequest);

  List<EnterpriseWalletLimitResponse> getWalletLimits(
      String enterpriseId, String coin, String isCustodial);
}
