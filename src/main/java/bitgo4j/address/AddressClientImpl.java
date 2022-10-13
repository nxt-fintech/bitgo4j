package bitgo4j.address;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.address.request.CreateAddressRequest;
import bitgo4j.address.request.DeployAddressRequest;
import bitgo4j.address.request.ForwardTokensFromAddressRequest;
import bitgo4j.address.request.UpdateAddressRequest;
import bitgo4j.address.response.AddressResponse;
import bitgo4j.address.response.DeployAddressResponse;
import bitgo4j.address.response.ForwardTokensFromAddressResponse;
import bitgo4j.address.response.ListAddressResponse;
import bitgo4j.address.response.ProofResponse;

public class AddressClientImpl implements AddressClient {
  private final AddressService service;

  public AddressClientImpl(BitGo4jConfig config) {
    service = createService(AddressService.class, config);
  }

  @Override
  public ListAddressResponse list(
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
      Boolean pendingDeployment) {
    return executeSync(
        service.list(
            coin,
            walletId,
            labelContains,
            limit,
            mine,
            prevId,
            segwit,
            sort,
            chain,
            includeBalances,
            includeTokens,
            includeTotalAddressCount,
            returnBalancesForToken,
            pendingDeployment));
  }

  @Override
  public AddressResponse create(
      String coin, String walletId, CreateAddressRequest createAddressRequest) {
    return executeSync(service.create(coin, walletId, createAddressRequest));
  }

  @Override
  public DeployAddressResponse deploy(
      String coin, String walletId, String addressId, DeployAddressRequest deployAddressRequest) {
    return executeSync(service.deploy(coin, walletId, addressId, deployAddressRequest));
  }

  @Override
  public ForwardTokensFromAddressResponse forwardTokens(
      String coin,
      String walletId,
      String addressId,
      ForwardTokensFromAddressRequest forwardTokensFromAddressRequest) {
    return executeSync(
        service.forwardTokens(coin, walletId, addressId, forwardTokensFromAddressRequest));
  }

  @Override
  public AddressResponse get(
      String coin, String walletId, String addressOrId, String dt, String memoId) {
    return executeSync(service.get(coin, walletId, addressOrId, dt, memoId));
  }

  @Override
  public AddressResponse update(
      String coin,
      String walletId,
      String addressOrId,
      String dt,
      String memoId,
      UpdateAddressRequest updateAddressRequest) {
    return executeSync(
        service.update(coin, walletId, addressOrId, dt, memoId, updateAddressRequest));
  }

  @Override
  public ProofResponse getProof(String coin, String walletId, String addressOrId) {
    return executeSync(service.getProof(coin, walletId, addressOrId));
  }
}
