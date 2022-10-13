package bitgo4j.sendlabel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.sendlabel.response.SendLabelResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockSendLabelClientImplTest {
  private static SendLabelClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().sendLabel();
  }

  @Test
  public void listTest_200() {
    List<SendLabelResponse> response = client.list("200", "", "");
    assertNotNull(response);
  }

  @Test
  public void listTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.list("400", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "qvk960dba4mnydydvt7b8853r21okgnbv0tb382k4sph9gwqb44dk3wczfyjhbm03pb53vbrfc394cs4tggkv09x5j5ln9cdztiggi1blobba8cpwdcjrqsxih4j5d8rm8w3j9u8xpaqn9afdrc8u2e859gwp500pmfi4fot8qz6mclkieb",
        error.getError());
    assertEquals("wxsb", error.getRequestId());
    assertEquals("Harland Pollich", error.getName());
  }

  @Test
  public void createTest_200() {
    SendLabelResponse response = client.create("200", "", "", "");
    assertNotNull(response);
  }

  @Test
  public void createTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.create("400", "", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("btuu4c7disi7t7tiu3cptne598d2mbqunau7m6tuer2d", error.getError());
    assertEquals("1672", error.getRequestId());
    assertEquals("Garland Goyette", error.getName());
  }

  @Test
  public void getTest_200() {
    SendLabelResponse response = client.get("5d496a4d3eca1072a73357059eea3987");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.get("f2af46f44434273337407c54efc7dd0c"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("hf148szahm8p86n8ly1tpi786jmw4gc23wn2i9b8fenwlfcxbuojv", error.getError());
    assertEquals("qpg5", error.getRequestId());
    assertEquals("Delorse Leannon", error.getName());
  }

  @Test
  public void updateTest_200() {
    SendLabelResponse response = client.update("0ca54c97103ed2a92f7c9553e0eb3f50", "");
    assertNotNull(response);
  }

  @Test
  public void updateTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.update("c14f0cc3fd3c884c8978017ff45c9ec4", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "jnfo78pi11249ni2vykeems55jis1nvc35lxaqzodnat3dj04ll1lgblb09w5ivxgmjk1h7gzqs4yxvt8m1ryxm2az2v1v52s4xvh0nasia1za3989egxgnluoqboodctdjnhbld4ftgicjeg12svt3sr1",
        error.getError());
    assertEquals("8v80", error.getRequestId());
    assertEquals("Leah Braun", error.getName());
  }

  @Test
  public void deleteTest_200() {
    SendLabelResponse response = client.delete("2235cfff42948d8daad9712198091c04");
    assertNotNull(response);
  }

  @Test
  public void deleteTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.delete("2e9ee55fe9851bcfe82a3032cc158ba6"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "yikxowpv0tns7s732xpd5rorb11bvmjan23svhrkmednuutk209r5y9blacyqyy0utan66fd6oppapvkp",
        error.getError());
    assertEquals("tj95", error.getRequestId());
    assertEquals("Landon Hackett", error.getName());
  }
}
