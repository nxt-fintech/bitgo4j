package bitgo4j.webhook.response;

import bitgo4j.webhook.common.Webhook;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListWalletWebhooksResponseTest {
  @Mock List<Webhook> webhooks;

  @InjectMocks ListWalletWebhookResponse listWalletWebhooksResponse;

  @Test
  void testToString() {
    String result = listWalletWebhooksResponse.toString();
    String expected = "ListWalletWebhookResponse[webhooks=webhooks]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetWebhooks() {
    listWalletWebhooksResponse.setWebhooks(List.of(new Webhook()));
  }
}
