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
import bitgo4j.express.request.SendTransactionRequest;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.TransactionResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockExpressClientImplTest {
  private static ExpressClientImpl client;

  @BeforeAll
  static void setUp() {
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

  @Test
  public void pingTest_200() {
    PingResponse response = client.ping();
    assertNotNull(response);
  }

  @Test
  public void sendTransactionTest_200() {
    SendTransactionRequest request = new SendTransactionRequest();
    TransactionResponse response = client.sendTransaction("yd38titaq5u2dpakf9nv4oujjgn3gw1pk1upv5pzmrnhop4perhk0df4wzqgtdx2h6n2o2gihpym8zavad7bky477gn", "f7cbb7d69da8c689f51c1d354235cdb3", request);
    assertNotNull(response);
  }

  @Test
  public void sendTransactionTest_202() {
    SendTransactionRequest request = new SendTransactionRequest();
    TransactionResponse response = client.sendTransaction("a5vfprkgctu074gfjvz6", "8224a3c845b0439f4a54dee1928e051d", request);
    assertNotNull(response);
  }

  @Test
  public void sendTransactionTest_400() {
    SendTransactionRequest request = new SendTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.sendTransaction("ty47pytcmi0z08ct47hhnbwueb5l6szb3", "08334f1408b1eb87e9b16df6e2abdc7f", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

}
