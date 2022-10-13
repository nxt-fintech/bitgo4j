package bitgo4j.key;

import bitgo4j.key.request.CreateKeyRequest;
import bitgo4j.key.response.KeyResponse;
import bitgo4j.key.response.ListKeysResponse;

public interface KeyClient {
  KeyResponse get(String coin, String id);

  ListKeysResponse list(String coin);

  KeyResponse create(String coin, CreateKeyRequest createKeyRequest);
}
