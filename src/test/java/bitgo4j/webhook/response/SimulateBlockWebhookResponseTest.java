package bitgo4j.webhook.response;

import bitgo4j.webhook.common.WebhookNotification;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SimulateBlockWebhookResponseTest {
  @Mock List<WebhookNotification> webhookNotifications;

  @InjectMocks SimulateBlockWebhookResponse simulateBlockWebhookResponse;

  @Test
  void testToString() {
    String result = simulateBlockWebhookResponse.toString();
    String expected = "SimulateBlockWebhookResponse[webhookNotifications=webhookNotifications]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetWebhookNotifications() {
    simulateBlockWebhookResponse.setWebhookNotifications(List.of(new WebhookNotification()));
  }
}
