package bitgo4j.federation;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.federation.response.FederationResponse;

public class FederationClientImpl implements FederationClient {
  private final FederationService service;

  public FederationClientImpl(BitGo4jConfig config) {
    service = createService(FederationService.class, config);
  }

  @Override
  public FederationResponse lookUp(String q, String type) {
    return executeSync(service.lookUp(q, type));
  }
}
