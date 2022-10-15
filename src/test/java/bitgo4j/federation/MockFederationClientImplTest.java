package bitgo4j.federation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.federation.response.FederationResponse;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockFederationClientImplTest {
  private static FederationClientImpl client;

  @BeforeAll
  static void setUp() throws Exception {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().federation();
  }

  @Test
  public void lookUpTest_200() {
    FederationResponse response = client.lookUp("t8iskuzpoov82hnlpw8ckxxk", "name");
    assertNotNull(response);
  }

  @Test
  public void lookUpTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.lookUp("9tmru5cdeyldjp3e0e52e", "name"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "jfv4gwqtbf17ef4qoh1pleiowejj8iloepu8dzd7pjb3ujk05ycuxqy6wj6ytdmwiizfu0rbleznchg0cbvop8x0nq5vpfhl655pguywld6e0q63ix52jehquaxim2w7m30urtv3f4wam8z068zu0vp2khlcy5p1m",
        error.getError());
    assertEquals("9b74", error.getRequestId());
    assertEquals("Dr. Mattie Conroy", error.getName());
  }
}
