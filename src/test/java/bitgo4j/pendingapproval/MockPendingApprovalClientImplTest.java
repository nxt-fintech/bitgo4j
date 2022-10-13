package bitgo4j.pendingapproval;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.TestingUtils;
import bitgo4j.pendingapproval.request.UpdatePendingApprovalRequest;
import bitgo4j.pendingapproval.response.ListPendingApprovalsResponse;
import bitgo4j.pendingapproval.response.PendingApprovalResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockPendingApprovalClientImplTest {
  private static PendingApprovalClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().pendingApproval();
  }

  @Test
  public void listTest_200() {
    ListPendingApprovalsResponse response =
        BitGo4j.api().pendingApproval().list(null, null, null, null, null, null);
    assertNotNull(response);
  }

  @Test
  public void getTest_200() {
    PendingApprovalResponse response = client.get("599fbfc14473c656b301fc4c1196d049");
    assertNotNull(response);
  }

  @Test
  public void updateTest_200() {
    UpdatePendingApprovalRequest request = new UpdatePendingApprovalRequest();
    PendingApprovalResponse response = client.update("5b32f1c126fdfb72e411008bc7993a9d", request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_202() {
    UpdatePendingApprovalRequest request = new UpdatePendingApprovalRequest();
    PendingApprovalResponse response = client.update("0c177bb22b49c301622fdf17c4d34f4f", request);
    assertNotNull(response);
  }
}
