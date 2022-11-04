package bitgo4j.express;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.express.request.AccelerateTransactionRequest;
import bitgo4j.express.request.AcceptWalletShareRequest;
import bitgo4j.express.request.CanonicalizeAddressRequest;
import bitgo4j.express.request.ConsolidateAccountRequest;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.CryptRequest;
import bitgo4j.express.request.GenerateWalletRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.request.RecoverTokenRequest;
import bitgo4j.express.request.ResolvePendingApprovalRequest;
import bitgo4j.express.request.SendToManyRequest;
import bitgo4j.express.request.SendTransactionRequest;
import bitgo4j.express.request.ShareWalletRequest;
import bitgo4j.express.request.SignTSSTransactionRequest;
import bitgo4j.express.request.SignTransactionRequest;
import bitgo4j.express.request.SignWalletTransactionRequest;
import bitgo4j.express.request.SweepFundsRequest;
import bitgo4j.express.request.UnspentsRequest;
import bitgo4j.express.request.VerifyAddressRequest;
import bitgo4j.express.response.AcceptWalletShareResponse;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.CanonicalizeAddressResponse;
import bitgo4j.express.response.ConsolidateAccountResponse;
import bitgo4j.express.response.DecryptResponse;
import bitgo4j.express.response.EncryptResponse;
import bitgo4j.express.response.KeyResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.RecoverETHTokenResponse;
import bitgo4j.express.response.ResolvePendingApprovalResponse;
import bitgo4j.express.response.ShareWalletResponse;
import bitgo4j.express.response.SignTSSTransactionResponse;
import bitgo4j.express.response.SignTransactionResponse;
import bitgo4j.express.response.TransactionResponse;
import bitgo4j.express.response.VerifyAddressResponse;
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

  @Test
  public void consolidateUnspentsTest_200() {
    UnspentsRequest request = new UnspentsRequest();
    TransactionResponse response = client.consolidateUnspents("s4qgj12ft6k67bjihs3yh1cohkobr15nqtt9t6m78vmgj1b9fmt1cdo25nx5stibxci72eo1lm6c28uchn95wbst236am4gdf8kcuzj52c1kh4gpv3lssrggbv4q66awv5v40f0ny0fhv0gehulk9pw3ugy58udggg090oj0","ff5dbcb489565297886a653b6a67d54f", request);
    assertNotNull(response);
  }

  @Test
  public void consolidateUnspentsTest_400() {
    UnspentsRequest request = new UnspentsRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.consolidateUnspents("4338t3vjio59dbpm3c1zqaxgvihhig12lkwqht7b4hut8os96tcgb7kko21f8gpsardox3n6dg5ua257jys307u2067cai0o0ru6ji8", "0742b7c29bc4188cb2a90ae13e27176f", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void fanOutUnspentsTest_200() {
    UnspentsRequest request = new UnspentsRequest();
    TransactionResponse response = client.fanOutUnspents("hoyq0gqmlpbyov5g8yjhwfqap5i67a6sx553suot440u5zo8sf41nto7htcz74zobdofu8hi9v9uplz69rpl559k0r5moqakzkd9erp7gpydcof6tosm","81797c155ed67084c62b81d7ade85616", request);
    assertNotNull(response);
  }

  @Test
  public void fanOutUnspentsTest_400() {
    UnspentsRequest request = new UnspentsRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.fanOutUnspents("k3zq8dy92y3dd0zki96va4o9wh358v62v6f3r7v1wkqixg20o74v4cdk1wcnndef03421a9gol3afjf0txlaygio6555v3qv7rqqwjwjz2tzllmhewocwzhqnj67fx6e7is3aa95sj9i2tc278rdau8atkf9hfebhcgh9izb40zw9fosflox0c3n0", "2c2d0f5272f0696611d6e0eea3fd9192", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void sweepFundsTest_200() {
    SweepFundsRequest request = new SweepFundsRequest();
    TransactionResponse response = client.sweepFunds("mh28qh5ekivo8t6apr0hso0khyvj9jz0bs24segwmr2dw37tpt1ywlha7o90vbuhjl2pusg3ozbaihy65ytutph6bq29hq2u2v25oa1qzttt4h7cs","dc67120d08f69c7e9188c7859568373c", request);
    assertNotNull(response);
  }

  @Test
  public void sweepFundsTest_400() {
    SweepFundsRequest request = new SweepFundsRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.sweepFunds("1461smgs11m3qsacnphi5chjpfn9wfxn342lgp46rejz077klwwpwnc88xv3x0ui7edqy47bcygg072eo5dsrr46s7qwr77rlj1zoqqo43m79nqn78oycc", "038289759d62006dd5551ab6ad0e31ac", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void accelerateTransactionTest_200() {
    AccelerateTransactionRequest request = new AccelerateTransactionRequest();
    TransactionResponse response = client.accelerateTransaction("btc","f1a2c7ee582abe82ff15129bc6fb70ba", request);
    assertNotNull(response);
  }

  @Test
  public void accelerateTransactionTest_400() {
    AccelerateTransactionRequest request = new AccelerateTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.accelerateTransaction("tbtc", "d157b25e09abaf9715d270c57ace35be", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void canonicalizeAddressTest_200() {
    CanonicalizeAddressRequest request = new CanonicalizeAddressRequest();
    CanonicalizeAddressResponse response = client.canonicalizeAddress("xyyvvijq9yn9oec2wshyayujjn9vyqjxtkk0orxygn8mk9m7vg5pqr3nzm3ayxrxgb4yfp3175wtbi9f7qc818av5dtzwl56yf4acwcf9y6gkawzbk2irjm", request);
    assertNotNull(response);
  }

  @Test
  public void verifyAddressTest_200() {
    VerifyAddressRequest request = new VerifyAddressRequest();
    VerifyAddressResponse response = client.verifyAddress("ootsooojkzyg694qd9rsf0jgureufhfv7uqf2rzzu0cpuczlc9l81j94jr5w9gv8f2bw57ld37b0zxugbdq4x1bmtju7y41y5zopfp9qap3s8izvx4wpi09k7nxwh63ys50bttjzkhvn", request);
    assertNotNull(response);
  }

  @Test
  public void resolvePendingApprovalTest_200() {
    ResolvePendingApprovalRequest request = new ResolvePendingApprovalRequest();
    ResolvePendingApprovalResponse response = client.resolvePendingApproval("46pmd2yhamb3qq8znui7sg01rfgls6jyihhgf15x18dn0vyujwrj63ocd1u98t6odubpwnoxg1on54x5llcthkn5vb5jn04prh41y2sgthhb5s395adcdwlozp9y6m5lphzgs0t7mw1ghzilvzv4hli835n03kq33k0iv5exc5p", "ca978e24dcddacfbe06621bea7437c01",request);
    assertNotNull(response);
  }
}
