package bitgo4j.webhook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.webhook.request.AddBlockWebhookRequest;
import bitgo4j.webhook.request.AddWalletWebhookRequest;
import bitgo4j.webhook.request.RemoveBlockWebhookRequest;
import bitgo4j.webhook.request.RemoveWalletWebhookRequest;
import bitgo4j.webhook.request.SimulateBlockWebhookRequest;
import bitgo4j.webhook.request.SimulateWalletWebhookRequest;
import bitgo4j.webhook.response.BlockWebhookResponse;
import bitgo4j.webhook.response.ListBlockWebhookResponse;
import bitgo4j.webhook.response.ListWalletWebhookResponse;
import bitgo4j.webhook.response.RemoveBlockWebhookResponse;
import bitgo4j.webhook.response.RemoveWalletWebhookResponse;
import bitgo4j.webhook.response.SimulateBlockWebhookResponse;
import bitgo4j.webhook.response.SimulateWalletWebhookResponse;
import bitgo4j.webhook.response.WalletWebhookResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockWebhookClientImplTest {
  private static WebhookClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().webhook();
  }

  @Test
  public void addWalletWebhookTest_200() {
    AddWalletWebhookRequest request = new AddWalletWebhookRequest();
    WalletWebhookResponse response =
        client.addWalletWebhook(
            "gn4nli6qa4womx4m5tu8dataspdosu51wlzxh934yoxb4ystlzbf7sulaqrl3e2z10oafzs5yfhv9qgljlx7m6d2enm8",
            "2d6142f170f9aa821897d0540afbc886",
            request);
    assertNotNull(response);
  }

  @Test
  public void addWalletWebhookTest_400() {
    AddWalletWebhookRequest request = new AddWalletWebhookRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.addWalletWebhook(
                    "si7xp2r7yaogjq7bfd3tb0ju3eh0r5jqjerbt3m2x0lpzw3b21jrpmitmu",
                    "147c598238f78c9f1b1091ddcdc58bd8",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listWalletWebhooksTest_200() {
    ListWalletWebhookResponse response =
        client.listWalletWebhooks(
            "zteqqwgzgzibi6nme9bynio8vc9b3fmoivvd8sucmlojne88xcl3qfltvfe28f8by0md",
            "ead984639a209e6b85ce69711faef0e2");
    assertNotNull(response);
  }

  @Test
  public void listWalletWebhooksTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.listWalletWebhooks(
                    "83dlywk60iojeuabsh5oilwhhot1gj90q6ygb3ee74hwkrn4fx1rkelv05tiko4haz9ao37vj16439ij85cuqquh6kmegx53tg6vqwdqgu8ogitkrafy6mriz88vryz91rpv5mma27en7k20cci7hw827uyyzzh3hc8alq802fazfx3y06kwvieqna986t1y942c6r5f",
                    "5f70e1296501bff2695e26d6fe6f4ce5"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void removeWalletWebhookTest_200() {
    RemoveWalletWebhookRequest request = new RemoveWalletWebhookRequest();
    RemoveWalletWebhookResponse response =
        client.removeWalletWebhook(
            "ywlklcmm6hh9szrda0qig8zmkjm6f3vxfcug6pawxa6w69okki",
            "35e9982a964849d6085b1a16d81e2d3f",
            request);
    assertNotNull(response);
  }

  @Test
  public void removeWalletWebhookTest_400() {
    RemoveWalletWebhookRequest request = new RemoveWalletWebhookRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.removeWalletWebhook(
                    "emxrhuz1g1tddg3lsmbmcsicl5ylsv1yjh6znuv2qzqkn1us2mf966rn1271acd6menl52dg5fhmek0xct642yrss7kezl99lt9mn386l3untj37wknyr01vdxpbat97v1nw1cc8cw3qa8xumjv1esj9s4dmoglspjxwno8m8dzlnmhfopa3vz0q5jpylql",
                    "1f467cb34ae5ec49fc134f65cef40225",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void simulateWalletWebhookTest_200() {
    SimulateWalletWebhookRequest request = new SimulateWalletWebhookRequest();
    SimulateWalletWebhookResponse response =
        client.simulateWalletWebhook(
            "g4z19yr5evgo7e",
            "1e00a4d14c721204461ad11c1f595837",
            "c63040a33cebaad210938b0acd9e0406",
            request);
    assertNotNull(response);
  }

  @Test
  public void simulateWalletWebhookTest_400() {
    SimulateWalletWebhookRequest request = new SimulateWalletWebhookRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.simulateWalletWebhook(
                    "hx1shodjlap1sx30u6uetqg6lj7xw9knogi93g9eaonffoh4g6nh99t11lp3im2jbro76bbn3sbmoox8ttrmjwhi9z0gechcuzzx5srb6opv1fngbeueskp77zitapggkafc470qp6g0g1pgvx013p8x8js1dbgtzic3savd1pigt344gbxl0ank363c3ylwhuiu",
                    "1ede0aa761dda7bd27c4a2707b439f81",
                    "c582d8724d65af107b707001100d733c",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void addBlockWebhookTest_200() {
    AddBlockWebhookRequest request = new AddBlockWebhookRequest();
    BlockWebhookResponse response =
        client.addBlockWebhook(
            "voh18eqh7263jx501z0dg75vy6efvsz8f41fxafl749lab8xaoxf4vq3key8h4usgucuobd4wo8poadpz00z7l2phslkrrdy9ik5g",
            request);
    assertNotNull(response);
  }

  @Test
  public void addBlockWebhookTest_400() {
    AddBlockWebhookRequest request = new AddBlockWebhookRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.addBlockWebhook(
                    "ny8q3juqhgyzx6u7lx5561qolcn9bqfmuyja6745d3lyo3jkqmh8i55mx1575dojmj1tcczbi4ewqsyxp0d1mds1b4b2ldmuiqdrggqgv0u20d27a96q76525jzoqvagtnz8ev2",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "7do6b1l5mn0kol0khfl7tunmsdnikgptbyw8x22sbu092di3fc7020j84iqt93uqc71mn2559vu04pqfvykoyf2uuyo8msug44gphkptkoq0ok86xrsr4yg1mijai775wmzo3",
        error.getError());
    assertEquals("4f68", error.getRequestId());
    assertEquals("Jerold Conroy", error.getName());
  }

  @Test
  public void listBlockWebhooksTest_200() {
    ListBlockWebhookResponse response =
        client.listBlockWebhooks(
            "l5cnpnrzfakkol6wm71twdg7u18o84ee99w77fmohxgkui4hxwuh6une1lj0p7b1o3gfxheu7zsp679n9g03fvh5m1dcy68waii5aqbel7o1lmwo1bz5v8bf5ikk3b6nar7rn0ajim8qdht36arpnhc4l8q3c1w7p5fip9uaybg5kj1kcd0o5aghvah7hban");
    assertNotNull(response);
  }

  @Test
  public void removeBlockWebhookTest_200() {
    RemoveBlockWebhookRequest request = new RemoveBlockWebhookRequest();
    RemoveBlockWebhookResponse response =
        client.removeBlockWebhook(
            "fhvrw77uih44fmaaapsr2ytbemz5lbgjjiwprmbjji53ak030h21dtg103i4emgi4y3yeq6bqk83d47gdnqz",
            request);
    assertNotNull(response);
  }

  @Test
  public void simulateBlockWebhookTest_200() {
    SimulateBlockWebhookRequest request = new SimulateBlockWebhookRequest();
    SimulateBlockWebhookResponse response =
        client.simulateBlockWebhook(
            "mu5aq90rvtjl5mzpld8qjojaz9ps6mnmwukrnxa2klxp9lls7rvapm3jmwtlxo68zobc76uxqopzk4jqgl45n88ignlp1fc26f32pxpyh0lan8lhmy7yud2oaeg4wznjye3fylb397k7qwae39x2iylt21uf831h1rbd13o534bgkmckis1",
            "d58c2b9c94cc672275d3e0e81a841395",
            request);
    assertNotNull(response);
  }
}
