package bitgo4j.address;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.address.request.CreateAddressRequest;
import bitgo4j.address.request.DeployAddressRequest;
import bitgo4j.address.request.ForwardTokensFromAddressRequest;
import bitgo4j.address.request.UpdateAddressRequest;
import bitgo4j.address.response.AddressResponse;
import bitgo4j.address.response.DeployAddressResponse;
import bitgo4j.address.response.ForwardTokensFromAddressResponse;
import bitgo4j.address.response.ListAddressResponse;
import bitgo4j.address.response.ProofResponse;
import bitgo4j.exception.BitGo4jException;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockAddressClientImplTest {
  private static AddressClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().address();
  }

  @Test
  public void listTest_200() {
    ListAddressResponse response =
        client.list(
            "3i1jf48pt30je4z30o1gu81viscqu83dv7hc2ht5l4y3e7smkg79ng0qyydawoaj7666exnhpnp2v76i1vkm6a6cwk1ucwd7v27ihi6qidfkwkvkk2v7unz",
            "0bce534051ab666dcb5ee4c2d33fcdde",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null);
    assertNotNull(response);
  }

  // FIXME: cope with multiple response type
  @Disabled
  @Test
  public void listTest_202() {
    ListAddressResponse response =
        client.list(
            "56ok9jgzpzfumdlkgk708m252wf1gnuqrl1ug6fzm9fuicz0vbriudwrv0hiawxegqx",
            "046e98a31db9ecfe3400fced549f3a75",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null);
    assertNotNull(response);
  }

  @Test
  public void listTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.list(
                    "bc664afxfy17ei0bestwngu6jqh2tu2aoc6dg8ys52hl0w37ysbkylhjnjhh0rnrx5g6vp1jwx0jhkoqcsyx2iyheofrsdoa2xkz1r9mvel9lgy2oo5emke9jzeyqwt8ae27t96gg66798mz23n572gj4yqwcp5ojtnqbgz21x6pov0omnah",
                    "d5fb03ebbad0ecd17cfdec0a3402ba2f",
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void createTest_200() {
    CreateAddressRequest request = new CreateAddressRequest();
    AddressResponse response =
        client.create(
            "ffx9qeipgsnp9y0w6y2lca491jslitlj1h97gn8b33mv0cys2znbkqmav",
            "d250dee57d3421234696c21e932d7e3a",
            request);
    assertNotNull(response);
  }

  @Test
  public void createTest_400() {
    CreateAddressRequest request = new CreateAddressRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.create("uq2pn", "42071f678c07cbf1dc644a75d1210801", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void deployTest_200() {
    DeployAddressRequest request = new DeployAddressRequest();
    DeployAddressResponse response =
        client.deploy(
            "188k8968pfmt3luw1t2t5ub7pilfeoqxn5fzvvcypud6w74yhc4ugjnvh239fofb6aobndco0ggmzeptr9djy2bwbjr41z14p53lcu",
            "7760861c7a21343641fe9820b51da9c9",
            "f6993b92496df24b9e9a52dfc0df7bae",
            request);
    assertNotNull(response);
  }

  @Test
  public void deployTest_400() {
    DeployAddressRequest request = new DeployAddressRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.deploy(
                    "g6nk5q3t5oha3u6etlq9dqq84ttbp8men056jun191sg6yte46uii0m8a5l9uwsvno13dm9h3mr721ytirshhnfa1vg2dzyosj1hht",
                    "6b73798cc2bde508509a9b0d93323a26",
                    "a066cc70e2ebee9c416306d0afa4c7c3",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void forwardTest_200() {
    ForwardTokensFromAddressRequest request = new ForwardTokensFromAddressRequest();
    ForwardTokensFromAddressResponse response =
        client.forwardTokens(
            "pwn3tx9nf57707nysf7mpgtjhpxbfej39mc4ira6v",
            "8174d24c577545bce25efd40973bd054",
            "0475bae9c2a33ca38cb6c120cee60255",
            request);
    assertNotNull(response);
  }

  @Test
  public void forwardTest_400() {
    ForwardTokensFromAddressRequest request = new ForwardTokensFromAddressRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.forwardTokens(
                    "dyfh6tr5xufwedjx589v7g9bom1q18",
                    "75c0f7055d17d0337de0cb0c10ecd671",
                    "d970a4a0f69071607b8db63e4c1c07d1",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getTest_200() {
    AddressResponse response =
        client.get(
            "j1rc6caxqs5m2k2xgcs24ku1dcj7j05tp4n6tmi53exq77d5n484xsk7avob19",
            "b20a2ad84efac58df2d2772ade1bd27a",
            "ii90",
            null,
            null);
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "iro9ufe4nqjty9rrxz5w0we7auual1kqniwsadac3rpp6n9jqdapt97bffo5lzk7wwv5kmsmrwvcu1iakg9yh34sj1thl3rqogn",
                    "6f19b40e3b7f628aebbd17664c25c849",
                    "5dv2",
                    null,
                    null));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void updateTest_200() {
    UpdateAddressRequest request = new UpdateAddressRequest(null);
    AddressResponse response =
        client.update(
            "sgt908jb38ydomnrhvfsv5538hfuec3af",
            "176d23cdb21029620828feedb0aa2273",
            "j3zl",
            null,
            null,
            request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_400() {
    UpdateAddressRequest request = new UpdateAddressRequest(null);
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "xiawt7nxex56q7dwhct1c73gokz6bd9uqr7xghj04nd9k65cc0gecienn23",
                    "107cd3d23289371d20d50cab4fde5f37",
                    "n1k4",
                    null,
                    null,
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "01olkwbcbi2h2w5wkd2sbo24dxhvzdjqlxt9dinfn92iu6pnhbgu0723pgb1se8gz2qmwzpqllu350vwpfhwu398yuc5myo667nnh7qf",
        error.getError());
    assertEquals("1934", error.getRequestId());
    assertEquals("Tegan Tromp", error.getName());
  }

  @Test
  public void getProofTest_200() {
    ProofResponse response =
        client.getProof(
            "x2axycwuzy3cj8jpr12efpr7vgk8avcznz3rtn8oxxmes6y4uxxan1uygufs7zdxovumnu7fbone4sbi2fc8fzrd0r7cct6gx7yxrlfrajz3n3hyoenp7fyb3qkj6qymxa0twn2ctrthpfksgqtdvt7wzr1edul4o9",
            "b22f6f1f58eeec09a100fa903a54c449",
            "10g6");
    assertNotNull(response);
  }

  @Test
  public void getProofTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getProof(
                    "uqmjse36f3o7wibxp7s7u050k5p9zlbkrxoun",
                    "555aff65bc9cfe3bc8018f58d219167b",
                    "73x6"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }
}
