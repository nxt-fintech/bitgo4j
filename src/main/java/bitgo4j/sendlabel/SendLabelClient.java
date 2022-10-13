package bitgo4j.sendlabel;

import bitgo4j.sendlabel.response.SendLabelResponse;
import java.util.List;

public interface SendLabelClient {
  List<SendLabelResponse> list(String coin, String address, String enterpriseId);

  SendLabelResponse create(String coin, String address, String enterpriseId, String label);

  SendLabelResponse get(String id);

  SendLabelResponse update(String id, String label);

  SendLabelResponse delete(String id);
}
