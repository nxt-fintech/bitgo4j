package bitgo4j.ping;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.ping.response.PingResponse;

public class PingClientImpl implements PingClient {
  private final PingService service;

  public PingClientImpl(BitGo4jConfig config) {
    service = createService(PingService.class, config);
  }

  @Override
  public PingResponse ping() {
    return executeSync(service.ping());
  }
}
