package bitgo4j.ping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.TestingUtils;
import bitgo4j.ping.response.PingResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PingClientImplTest {
  private static PingClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).useTest().build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().ping();
  }

  @Test
  public void pingTest() {
    PingResponse response = client.ping();

    assertNotNull(response);
    assertEquals("service is ok!", response.getStatus());
    assertEquals("BitGo Testnet", response.getEnvironment());
    assertEquals("testnet", response.getConfigEnv());
    assertNull(response.getConfigVersion());
  }
}
