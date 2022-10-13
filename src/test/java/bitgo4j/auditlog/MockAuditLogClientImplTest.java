package bitgo4j.auditlog;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.TestingUtils;
import bitgo4j.auditlog.response.ListAuditLogResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockAuditLogClientImplTest {
  private static AuditLogClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().auditLog();
  }

  @Test
  public void listTest_200() {
    ListAuditLogResponse response = client.list(null, null, null, null, null, null);
    assertNotNull(response);
  }
}
