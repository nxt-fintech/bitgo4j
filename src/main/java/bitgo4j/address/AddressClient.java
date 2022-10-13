package bitgo4j.address;

import bitgo4j.address.request.CreateAddressRequest;
import bitgo4j.address.request.DeployAddressRequest;
import bitgo4j.address.request.ForwardTokensFromAddressRequest;
import bitgo4j.address.request.UpdateAddressRequest;
import bitgo4j.address.response.AddressResponse;
import bitgo4j.address.response.DeployAddressResponse;
import bitgo4j.address.response.ForwardTokensFromAddressResponse;
import bitgo4j.address.response.ListAddressResponse;
import bitgo4j.address.response.ProofResponse;

public interface AddressClient {
  ListAddressResponse list(
      String coin,
      String walletId,
      String labelContains,
      Integer limit,
      Boolean mine,
      String prevId,
      Boolean segwit,
      Integer sort,
      Integer chain,
      Boolean includeBalances,
      Boolean includeTokens,
      Boolean includeTotalAddressCount,
      String returnBalancesForToken,
      Boolean pendingDeployment);

  AddressResponse create(String coin, String walletId, CreateAddressRequest createAddressRequest);

  DeployAddressResponse deploy(
      String coin, String walletId, String addressId, DeployAddressRequest deployAddressRequest);

  ForwardTokensFromAddressResponse forwardTokens(
      String coin,
      String walletId,
      String addressId,
      ForwardTokensFromAddressRequest forwardTokensFromAddressRequest);

  AddressResponse get(String coin, String walletId, String addressOrId, String dt, String memoId);

  AddressResponse update(
      String coin,
      String walletId,
      String addressOrId,
      String dt,
      String memoId,
      UpdateAddressRequest updateAddressRequest);

  ProofResponse getProof(String coin, String walletId, String addressOrId);
}
