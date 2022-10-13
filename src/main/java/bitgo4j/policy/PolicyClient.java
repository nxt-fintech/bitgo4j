package bitgo4j.policy;

import bitgo4j.policy.request.PolicyRequest;
import bitgo4j.policy.response.PolicyResponse;

public interface PolicyClient {
  PolicyResponse add(String coin, String walletId, PolicyRequest policyRequest);

  PolicyResponse update(String coin, String walletId, PolicyRequest policyRequest);

  PolicyResponse delete(String coin, String walletId, PolicyRequest policyRequest);
}
