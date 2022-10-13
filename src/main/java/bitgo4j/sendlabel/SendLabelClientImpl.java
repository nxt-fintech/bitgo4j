package bitgo4j.sendlabel;

import static bitgo4j.ServiceGenerator.createService;
import static bitgo4j.ServiceGenerator.executeSync;

import bitgo4j.BitGo4jConfig;
import bitgo4j.sendlabel.response.SendLabelResponse;
import java.util.List;

public class SendLabelClientImpl implements SendLabelClient {
  private final SendLabelService service;

  public SendLabelClientImpl(BitGo4jConfig config) {
    service = createService(SendLabelService.class, config);
  }

  @Override
  public List<SendLabelResponse> list(String coin, String address, String enterpriseId) {
    return executeSync(service.list(coin, address, enterpriseId));
  }

  @Override
  public SendLabelResponse create(String coin, String address, String enterpriseId, String label) {
    return executeSync(service.create(coin, address, enterpriseId, label));
  }

  @Override
  public SendLabelResponse get(String id) {
    return executeSync(service.get(id));
  }

  @Override
  public SendLabelResponse update(String id, String label) {
    return executeSync(service.update(id, label));
  }

  @Override
  public SendLabelResponse delete(String id) {
    return executeSync(service.delete(id));
  }
}
