package bitgo4j.policy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.policy.request.PolicyRequest;
import bitgo4j.policy.response.PolicyResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockPolicyClientImplTest {
  private static PolicyClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().policy();
  }

  @Test
  public void addTest_200() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.add(
            "52b2vtsa2rirpivn9403gt7ec4y0y90m9dxd1pd9ocy5zppps2ko98z7hvp6ztbqv271hnrbtu4dhaa8qwe0hmrrf7slxcbl6umez2atof1w52pw0407mzfkp6n04pmjbqfsj32v6sbg4s3plc4",
            "f0f409843c35045cd5a0a4d14edc5216",
            request);
    assertNotNull(response);
  }

  @Test
  public void addTest_202() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.add(
            "5oeon5ujftshwpmr6wcmjlshpb6o9lzma04xx8u3xbmlv1rmcln1m5f9hhvv47nfhzksayqgljenzl1hly2gj2px65w6iqh5h7ijc2m3gj5ofhwa1r3uefk4fd5q2jenaek115q88hvnpooy4osnq",
            "dd631c456d42355aaedb6745723644bc",
            request);
    assertNotNull(response);
  }

  @Test
  public void addTest_400() {
    PolicyRequest request = new PolicyRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.add(
                    "5ydkj26q8gnmcim4xhpjlf8ckbcmb3dzts5ggveekldp51mva6a2bkasv0e8fr5x00ov7i3icyfzpvzr97u2t9sx9h90ogtzfjot5ftm51geskfn6srsn3zwnv5a330f6evyta8hkft4bxvr8c9eu1a83ueyrynp5o0zccfvvckv902wtcy",
                    "ba9a81666401c34d6f8c9efe935a04d3",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void updateTest_200() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.update(
            "olegaajufa8l10379rao1xbrj3jccanayr384uwtptqkwunk3j8ohx5bmfvznwr70te9bm5uyh25x086lc1v1ae68mw638ew1z6b15azk5dj9zffi6xlp5xzzca9sbld",
            "bd10c692d844e64200444bf203e7d5d1",
            request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_202() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.update(
            "gz4pyybhcz57p259h5t5ebvz5jmsygr4ug", "e09e0fe8fbe64bb2dd2819f7a0cf823c", request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_400() {
    PolicyRequest request = new PolicyRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "svmexdnv039mj03oih8emmybxsh3cxi5tqenctnzucr0en075qoc8v59z2558mgnetbqupmx1th8wnttdv9i62o0oibgdd87nmfryrraxloneqwnz",
                    "b4046427102f17763eb5cde2faa0faf0",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void deleteTest_200() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.delete(
            "yov0skwt9klbqvfvjlz1hzemk53jxsnjrv1nth4w1ukhdo5020kw2i",
            "7d6c6b021788a2ec9e5b21bddf3c3559",
            request);
    assertNotNull(response);
  }

  @Test
  public void deleteTest_202() {
    PolicyRequest request = new PolicyRequest();
    PolicyResponse response =
        client.delete(
            "zerf6ofmeq0jqme5se389pceuy3oeor7tux6zjkysavqwq3ce0dwyqrlwz2i9g3sk7fp2vxse5c15izn7ucb3h0glx0og76a87owpvrdznhl3pnaekxsujrrdsl8zqlu8w58ej1pl4abswx4kefzhvpwt4lo2z3g0jq3skffs05hi9s65z4srp9",
            "97ac52d0a30ac891baac8bb6b886b514",
            request);
    assertNotNull(response);
  }

  @Test
  public void deleteTest_400() {
    PolicyRequest request = new PolicyRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.delete(
                    "ipugg2iccbrn0kp8hlqkexlyc8fk9oo88ng32ky27nvywic2x7xstcuxinwwmuh5ryqvzhyqxxbf4hw0u7",
                    "576823bc71e804fe54c579be03c4d8f4",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }
}
