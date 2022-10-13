package bitgo4j.federation;

import bitgo4j.federation.response.FederationResponse;

public interface FederationClient {
  FederationResponse lookUp(String q, String type);
}
