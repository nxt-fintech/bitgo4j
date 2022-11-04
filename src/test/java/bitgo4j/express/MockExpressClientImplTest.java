package bitgo4j.express;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.express.request.AcceptWalletShareRequest;
import bitgo4j.express.request.ConsolidateAccountRequest;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.CryptRequest;
import bitgo4j.express.request.GenerateWalletRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.request.RecoverTokenRequest;
import bitgo4j.express.request.SendToManyRequest;
import bitgo4j.express.request.SendTransactionRequest;
import bitgo4j.express.request.ShareWalletRequest;
import bitgo4j.express.request.SignTSSTransactionRequest;
import bitgo4j.express.request.SignTransactionRequest;
import bitgo4j.express.request.SignWalletTransactionRequest;
import bitgo4j.express.response.AcceptWalletShareResponse;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.ConsolidateAccountResponse;
import bitgo4j.express.response.DecryptResponse;
import bitgo4j.express.response.EncryptResponse;
import bitgo4j.express.response.KeyResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.RecoverETHTokenResponse;
import bitgo4j.express.response.ShareWalletResponse;
import bitgo4j.express.response.SignTSSTransactionResponse;
import bitgo4j.express.response.SignTransactionResponse;
import bitgo4j.express.response.TransactionResponse;
import bitgo4j.express.response.WalletResponse;
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

  @Test
  public void sendToManyTest_200() {
    SendToManyRequest request = new SendToManyRequest();
    TransactionResponse response = client.sendToMany("68tvgqvs", "eac4945655423dc8f20c08e04e600f75", request);
    assertNotNull(response);
  }

  @Test
  public void sendToManyTest_202() {
    SendToManyRequest request = new SendToManyRequest();
    TransactionResponse response = client.sendToMany("bp5rb88687tny5f06rk2luhvuqsvydlsfnndfbbpcsmapywhmsp25u5dvn5ylioe", "7382897354341d0417da73bb5599df38", request);
    assertNotNull(response);
  }

  @Test
  public void sendToManyTest_400() {
    SendToManyRequest request = new SendToManyRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.sendToMany("b7g5apyiv9v4n1avd14m93358ao9bioo2568i9q46z1mvx9t7ow", "5d3fee166c8430b575004193fb2bbfe2", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void encryptMessagesTest_200() {
    CryptRequest request = new CryptRequest();
    EncryptResponse response = client.encryptMessages(request);
    assertNotNull(response);
  }

  @Test
  public void decryptMessagesTest_200() {
    CryptRequest request = new CryptRequest();
    DecryptResponse response = client.decryptMessages(request);
    assertNotNull(response);
  }

  // TODO: cope with same url path
  @Disabled
  @Test
  public void decryptMessagesTest_500() {
    CryptRequest request = new CryptRequest();
    DecryptResponse response = client.decryptMessages(request);
    assertNotNull(response);
  }

  @Test
  public void createKeyTest_200() {
    KeyResponse response = client.createKey("9kudeo1613suua1b7tkf");
    assertNotNull(response);
  }

  @Test
  public void generateWalletTest_200() {
    GenerateWalletRequest request = new GenerateWalletRequest();
    WalletResponse response = client.generateWallet("s0ug3r63x62l63mbjlydjht3chcly5c6lo6wixvo3k0zwccbretnps1nm91c6vlfubryjzru7tou8jdpqweyxvu1woiir83f79yj431mgxf8u9htabg6oxm0hok17yq4k5jba81g65h", false, request);
    assertNotNull(response);
  }

  @Test
  public void shareWalletTest_200() {
    ShareWalletRequest request = new ShareWalletRequest();
    ShareWalletResponse response = client.shareWallet("4r75v7kb2nc6gkb196l8rrjep4z1zbxsfkuomc2qizmlk9hlbi0vj42j16x90ybh9rxzs22iand8j54fhmxbwwn1u6yg73sulqo95hhtiw9zbngc", "e4a370fe645fb21673da7c9dea55426d", request);
    assertNotNull(response);
  }

  @Test
  public void acceptWalletShareTest_200() {
    AcceptWalletShareRequest request = new AcceptWalletShareRequest();
    AcceptWalletShareResponse response = client.acceptWalletShare("86s2paxfknw0nj5zuzto7onz3u7r6514vq38sibwpise4c8mqu4tlb4mdcd40axquaipyi", "851b2d7f41465040c0e785c12aad52bd", request);
    assertNotNull(response);
  }

  @Test
  public void signTransactionTest_200() {
    SignTransactionRequest request = new SignTransactionRequest();
    SignTransactionResponse response = client.signTransaction("olab9g7vuy7ukbjuyn4sa0wvk58t3birinbjbbecs4x56m04n6w7rscyg48r3802r1nxpuyd1efwh9ju", request);
    assertNotNull(response);
  }

  @Test
  public void signWalletTransactionTest_200() {
    SignWalletTransactionRequest request = new SignWalletTransactionRequest();
    SignTransactionResponse response = client.signWalletTransaction("yqxiu4ktk445ujatsymy64b69yz1bhtx9i93j91ip3b8t1y73yhseautyaw680eabkhvmx8l356vnvd1t3mtq1eauks3paglw0cck0izyjz086na74qv7t2ucn3iveglx0s7wiqfd1h8dk9mke7gvm7ri8w9ngpy218kuz855qs34jqm6tiqblwfledozs3", "858cf3c9725dcd3e6b9a3f9107b12d6e", request);
    assertNotNull(response);
  }

  // TODO: missing json file
  @Disabled
  @Test
  public void signTSSTransactionTest_200() {
    SignTSSTransactionRequest request = new SignTSSTransactionRequest();
    SignTSSTransactionResponse response = client.signTSSTransaction("yqxiu4ktk445ujatsymy64b69yz1bhtx9i93j91ip3b8t1y73yhseautyaw680eabkhvmx8l356vnvd1t3mtq1eauks3paglw0cck0izyjz086na74qv7t2ucn3iveglx0s7wiqfd1h8dk9mke7gvm7ri8w9ngpy218kuz855qs34jqm6tiqblwfledozs3", "858cf3c9725dcd3e6b9a3f9107b12d6e", request);
    assertNotNull(response);
  }

  @Test
  public void recoverETHTokenTest_200() {
    RecoverTokenRequest request = new RecoverTokenRequest();
    RecoverETHTokenResponse response = client.recoverETHToken("2f1dkdcisx5qty75m4d7j2wgzlim707qnuyyh22rnp0jxkka4oz3cqeftl6pgnhwo5iarum657pels1vmrpxw3qmb8rgf6yw3scz3oi35ovx7v9f7n09x7qmxmm52r0d3i5z54cn6fomgyuu31jn1ocfgummy88ok8oz1y21368nw0vpi4bb9gq771jh3r", "7fff7da1ebf07478ed35462603dc7fa6", request);
    assertNotNull(response);
  }

  @Test
  public void recoverETHTokenTest_400() {
    RecoverTokenRequest request = new RecoverTokenRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.recoverETHToken("ywr6xfic5epqojnkpduvip5nggu8y6omxgzj4b4bmk8395tjq6kef919rg2gwgc4z0gav8txk4e7l5359y2qvt", "dcde5da732ac6bb5d82f9163646ad18b", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void consolidateAccountTest_200() {
    ConsolidateAccountRequest request = new ConsolidateAccountRequest();
    ConsolidateAccountResponse response = client.consolidateAccount("algo","24743966beb4b144af3c680f4725b532", request);
    assertNotNull(response);
  }

  @Test
  public void consolidateAccountTest_400() {
    ConsolidateAccountRequest request = new ConsolidateAccountRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.consolidateAccount("txtz", "3a88cd1b2f51823657c79c87844cef89", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }
}
