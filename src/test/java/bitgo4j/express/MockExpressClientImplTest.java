package bitgo4j.express;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.LoginResponse;
import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockExpressClientImplTest {
  private static ExpressClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().express();
  }

  @Test
  public void createAddressTest_200() {
    CreateAddressRequest request = new CreateAddressRequest();
    AddressResponse response =
        client.createAddress(
            "ffx9qeipgsnp9y0w6y2lca491jslitlj1h97gn8b33mv0cys2znbkqmav",
            "d250dee57d3421234696c21e932d7e3a",
            request);
    assertNotNull(response);
  }

  @Test
  public void createAddressTest_400() {
    CreateAddressRequest request = new CreateAddressRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.createAddress("uq2pn", "42071f678c07cbf1dc644a75d1210801", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void loginTest_200() {
    LoginRequest request = new LoginRequest();
    LoginResponse response = client.login(request);
    assertNotNull(response);
  }

  // TODO: cope with same mock url path
  @Disabled
  @Test
  public void loginTest_401() {
    LoginRequest request = new LoginRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.login(request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "lfh5kc8js3kpwzeet1walatg50k74cn9p35jkddhmmiycpzdv7u8ucaun9743a8p5c3evbvwim7tjwjvvbldfkngx9suwvg2a003lyvi7fwznc9w5h9i6",
        error.getError());
    assertEquals("u306", error.getRequestId());
    assertEquals("Lynwood Tromp", error.getName());
  }
}
