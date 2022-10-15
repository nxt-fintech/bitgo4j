package bitgo4j.key;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.key.request.CreateKeyRequest;
import bitgo4j.key.response.KeyResponse;
import bitgo4j.key.response.ListKeysResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockKeyClientImplTest {
  private static KeyClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().key();
  }

  @Test
  public void getTest_200() {
    KeyResponse response =
        client.get(
            "bij6858zpufhx2hjd30cw7idpzyfy5cjjn1p0rh3v1qmak6whplkl7soeca5",
            "500b166c52fddc837fd768b2dfb08c39");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "re269hq7ujepgvtjljzwfvjmocevvogysolgnz8hwvgwcjw8s29opacp31xhuaowqtycydgexfguffuc3778er8hb8tccykk2exmmeltqz9gysdkyc51hiye8au9fx3d15raen2sxigswdy8ue76rmonrx5ecumoy08xznptoyngnbcj5m2vwv0de691utul5hea8j4",
                    "bc864eb28335c744a5dac0ba2fa47819"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "rte3e6dtwcbp4pjuiwgwm2dkooaq9zs6iodap0i1tb5xzunrvy7lgo5i573y50iombcr66m1zjh9urbhfi4grbrp213nj8umftdvzo2hvgrwsq0n98h735x2290i",
        error.getError());
    assertEquals("33r9", error.getRequestId());
    assertEquals("Bobbie Reilly", error.getName());
  }

  // FIXME: 400 and 404 has different response type
  @Disabled
  @Test
  public void getTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "v704f5q1ksq2bcksxiey0at524ecqe6aql46xd01hs2hhz8jmcpwwwjs8986gsag7cwb",
                    "8cb50fac29430da42ba9dbe4acb71615"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listTest_200() {
    ListKeysResponse responses =
        client.list(
            "d3lh4g1u9t377cgstpx2w52xumhjgyuzhippieebay6mrvyk40pl2p48u7qcs6y0mfvdlx2e28h6hy179xyqkl7cavf0u4c6hd0cifporju7zzrlyog1hpj8mxavw68ypan8pbrkrygxjr63exuaze4p3evcvya77r5z2tdyy2dvy");
    assertNotNull(responses);
  }

  @Test
  public void listTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.list("nvb8xbx9uipilkn8wt9dgmnvyp75twjyhzdet"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "rw0vbjdjtsddlbpibydn5hcjv4pkludnnxsqbygl5mng785hlb5djk7ueeklxg69oris0y3pbgdczybzescx0ukp8grpyieg6gh3mum0iotl",
        error.getError());
    assertEquals("yk6i", error.getRequestId());
    assertEquals("Melia Predovic", error.getName());
  }

  @Test
  public void createTest_200() {
    CreateKeyRequest request = new CreateKeyRequest();
    KeyResponse response =
        client.create(
            "jdjpuv056g2psbrqj8g4c2utv7qrufa3upa51cp2h1f8cbwghb40nu74qut4ig29wxoig2la5jpd111f1pdsdl5ggom6qphzf4pu83awiyusk67j3b4nsgprt8qt5bfzd3q6luydp0",
            request);
    assertNotNull(response);
  }

  @Test
  public void createTest_400() {
    CreateKeyRequest request = new CreateKeyRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.create("ocv1kis43lm4py", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "49bvolb0xghcv0och9csauzyi0zxv2ik50jyi3gzwfd5gppmwdyflrvun1x879qpepup4dt",
        error.getError());
    assertEquals("byq7", error.getRequestId());
    assertEquals("Oralee Schneider", error.getName());
  }
}
