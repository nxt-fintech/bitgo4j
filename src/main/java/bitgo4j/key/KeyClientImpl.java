package bitgo4j.key;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.key.request.CreateKeyRequest;
import bitgo4j.key.response.KeyResponse;
import bitgo4j.key.response.ListKeysResponse;

public class KeyClientImpl implements KeyClient {
  private final KeyService service;

  public KeyClientImpl(BitGo4jConfig config) {
    service = createService(KeyService.class, config);
  }

  @Override
  public KeyResponse get(String coin, String id) {
    return executeSync(service.get(coin, id));
  }

  @Override
  public ListKeysResponse list(String coin) {
    return executeSync(service.list(coin));
  }

  @Override
  public KeyResponse create(String coin, CreateKeyRequest createKeyRequest) {
    return executeSync(service.create(coin, createKeyRequest));
  }
}
