package bitgo4j.policy;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.policy.request.PolicyRequest;
import bitgo4j.policy.response.PolicyResponse;

public class PolicyClientImpl implements PolicyClient {
  private final PolicyService service;

  public PolicyClientImpl(BitGo4jConfig config) {
    service = createService(PolicyService.class, config);
  }

  @Override
  public PolicyResponse add(String coin, String walletId, PolicyRequest policyRequest) {
    return executeSync(service.add(coin, walletId, policyRequest));
  }

  @Override
  public PolicyResponse update(String coin, String walletId, PolicyRequest policyRequest) {
    return executeSync(service.update(coin, walletId, policyRequest));
  }

  @Override
  public PolicyResponse delete(String coin, String walletId, PolicyRequest policyRequest) {
    return executeSync(service.delete(coin, walletId, policyRequest));
  }
}
