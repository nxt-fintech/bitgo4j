package bitgo4j.transfer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.transfer.request.UpdateCommentRequest;
import bitgo4j.transfer.response.FeeEstimateResponse;
import bitgo4j.transfer.response.ListTransferResponse;
import bitgo4j.transfer.response.TransferResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockTransferClientImplTest {
  private static TransferClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().transfer();
  }

  @Test
  public void listEnterpriseTest_200() {
    ListTransferResponse response =
        client.listEnterprise("f7b5d38f8c2d5fd560ac961252d14c40", "", "", 0, "", "", "");
    assertNotNull(response);
  }

  @Test
  public void listEnterpriseTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listEnterprise("f27c06b6b2dd99590b948186b6b3f94b", "", "", 0, "", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listEnterpriseTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listEnterprise("d6de3d7578a8e389f08617b07be1b693", "", "", 0, "", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "kk46nhqgx4dcp9p1cc4zmeqv8f3t5en7jswnt0i0ucfix1i4wglo4eoib2zphejjls4oci7v8yi538j3iaeap76e5z34xf9awwa93ry1booetoem6eajjkn7ucfzc1umuptvuauumsvg1rj07ocjk2fktsfd6u047xlhqkspjhtjy9bbqsqpkdsrn37f78vglalwe",
        error.getError());
    assertEquals("hmou", error.getRequestId());
    assertEquals("Mr. Jody Kirlin", error.getName());
  }

  @Test
  public void listEnterpriseByCoinTest_200() {
    ListTransferResponse response =
        client.listEnterpriseByCoin(
            "2fea5skmtfm",
            "8a0731a2907627bf6bceaaa02b0e5544",
            "7827506715119469412652256069063424248532022");
    assertNotNull(response);
  }

  @Test
  public void listEnterpriseByCoinTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.listEnterpriseByCoin(
                    "lpqwifq6w9sk6bh088",
                    "b3bc2f58b15d2e3d32dd4fa3e0082191",
                    "-950493025011124184556649153680528665057955214951311288557541959129629617467818323376931630"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listEnterpriseByCoinTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.listEnterpriseByCoin(
                    "nxfeezgpb6ittuelch",
                    "419c7cc66e2c912d6af7a41e41e1bbc6",
                    "-1207870207850221983437847555435862304603409779"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "vdu923k5fx0lefdquh6r7q24xppqkcph50s83wd4ay741112fc13lfsdnc669un857l32vrnxtzdsebpztpvvupi7kmty1d178a0krk5uevc6o2lh9zpab8243vl6jqdstiy1h5bfc0d0naaa4rzlo0amp808yy7r2ywwaubko9oyl33ceob6mvgpcznn0l34",
        error.getError());
    assertEquals("2030", error.getRequestId());
    assertEquals("Delmer Renner", error.getName());
  }

  @Test
  public void getFeeEstimateTest_200() {
    FeeEstimateResponse response =
        client.getFeeEstimate(
            "l88h4z59rgqoo1dy6lc3nu7l8lnsajhvtid9igna78bl8sdrq80qnh4kplbeb6htay08mbr411vel1sv9r3mus1q4ek",
            0,
            "",
            "",
            "",
            false);
    assertNotNull(response);
  }

  @Test
  public void getFeeEstimateTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getFeeEstimate(
                    "7m3rc3hg2ski4zx3h4byiqb9tsmnc2rl7plus9n25q87j7dg1kybpxs91dq63tjh56xkjzxkfzpofrj93jb967wbnixdhjcd8h1rfxcruukcg9fk7mbftvbjbs0iito0d51o6kw2ob4m2zp0vop06t9ee67wm61nmjamhnl90kmopjtu5661wijvb",
                    0,
                    "",
                    "",
                    "",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "vydt0dj7h5zrufeqwjubyfd6dhudd8wrwkp6mofnf15fcimdwnqbn3sv6a87ajq1gvn1yj9lno5ghyv28itcct2373bgph9vp7elxh8tj9w16b4fcdkea60ouhv31y5bt9aw20evu9tjfkcugjefcs2oi7a17550at3y2b93z7s6rrm1w5wxu4n5jeadnsiqm2l0",
        error.getError());
    assertEquals("ocb3", error.getRequestId());
    assertEquals("Dr. Darryl Lueilwitz", error.getName());
  }

  @Test
  public void listTest_200() {
    ListTransferResponse response =
        client.list(
            "240soghvwpn8sgh66vs66f1nxj18q5yvak380oatb3mlsog28erk2e7h7i1sz4hezjg0cwank4buymuaph2j8txmwrozzeaid4m3iur36da616yr0d97qfby09g7u1oqu8m9w93hpqgnbx6796v8mcyuj1ttukijgyo17984e",
            "f87523eb7d6b01d08969e1b010a76a47",
            false,
            ",",
            "",
            "",
            0,
            "",
            "",
            "",
            0,
            0,
            "",
            "",
            List.of(""),
            false,
            List.of(""));
    assertNotNull(response);
  }

  @Test
  public void listtest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.list(
                    "8uo2ymnx",
                    "b9069ac188c3aec9d53de96b9a091826",
                    false,
                    ",",
                    "",
                    "",
                    0,
                    "",
                    "",
                    "",
                    0,
                    0,
                    "",
                    "",
                    List.of(""),
                    false,
                    List.of("")));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listtest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.list(
                    "p61g2rzq2epkgx8v8lav8oyd3ybwi8kmkiif89zu2q23fet42n6sbgq60mco7e2z6vnmihdcj3xsvb0e6opblp2o21u777kr58pip3g2t1vy8jqwru049q6eg70hmcbo7phmv88vckyx64ftnvho",
                    "432bc17b1d3a1bf73c1f966c628b4838",
                    false,
                    ",",
                    "",
                    "",
                    0,
                    "",
                    "",
                    "",
                    0,
                    0,
                    "",
                    "",
                    List.of(""),
                    false,
                    List.of("")));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "qsdfgh0owg07upv4lxr3ty4o9la7iwq4lclciteilqowfbslel68q9wgo530h85u0h8nyophv93ea6rxlffrbt70yovvteok9ismki5639q",
        error.getError());
    assertEquals("h084", error.getRequestId());
    assertEquals("Josef Gibson", error.getName());
  }

  @Test
  public void getTest_200() {
    TransferResponse response =
        client.get(
            "dy608w",
            "7f388468e1214c87516fb838967c4fd8",
            "gsr1s75qw18wn8ufeumuatibrjm34w8twojkssw9h1jixur18coy83hx6jov2w2zz851rgop4zdajuei0krl8qlgfy3huqd20cxglin6sl6yu7xvg15dtlkvuwrcwad0skfua7kb3cqpw203ggj5bcooqpkkfyuy2021y60pt88b2ttw12tdiw4wohppp8tgigrv");
    assertNotNull(response);
  }

  @Test
  public void getTest_206() {
    TransferResponse response =
        client.get(
            "q620cvrjzb5ayjeum7grcp",
            "6a47d504fe11bd46e826a03ad0639190",
            "6au9jofwgd7gdm04vr2mwpytdm6lr9xx");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "ze46q3zwt42wpmvlv2gaugy1dobo5iv3i24i291pyz9aou9b6jgmx106f7dgjbeb2yw44ifa2jwhb99mlnxhs2csuyqc7mc1xe3el1eaxpsbd9iloton8pqzm8yo1ol66761pkopjl9e7po9wngooltkomgk07hpqx1t7jakd650lxbdkap4ubrmf3d4dp4msg",
                    "afba0a0aa5ab3c2e96774890df454515",
                    "bt80bjdnp8lgb2kchzdle8myklactajph0jamox2yh5js6ok82xl1v2u9hr5k8aftz2hrxyxv6zuwyyinldcwnoh0sg9l4o6pt4lx239d"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getBySequenceIdTest_200() {
    TransferResponse response =
        client.getBySequenceId(
            "fm3xxfby4yrmq74r7q93hnh5lwr4imzhp8ad31kpg9mkwssijw1a5xa0t3g6ly5hwzj9rfh3h5j69151ionarw0xlg9l22ucflgzzxqwbha3zsqg7",
            "b9c1eb1ac52d5862a6ef7da1428208cb",
            "h55n");
    assertNotNull(response);
  }

  @Test
  public void getBySequenceIdTest_206() {
    TransferResponse response =
        client.getBySequenceId("3b3ppa", "b78be17d59626765a9036ce3b06e1546", "mf13");
    assertNotNull(response);
  }

  @Test
  public void getBySequenceIdTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getBySequenceId(
                    "qc08ezrbn9bwp0p0dw8dbt2o6b1ujjysk6tpv1or4jmn1zsjddruskavwg2ufxjxdcfyh93mxvuyl9tyeyhxw3pzpsnmqoazrvisvsvt7gt3jm595wym9urx1ypd0t5ck2ee61hy2qqxbr",
                    "55620056259c54f3d52255fdee22862a",
                    "1338"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void updateCommentTest_200() {
    UpdateCommentRequest request = new UpdateCommentRequest();
    TransferResponse response =
        client.updateComment(
            "21525xhewxx6rqgbbyte5yvhb4hhkw5afcoakcs8fvnd2x02x3gq9tr4uow8i33yo",
            "767720e6ced0853c75f237586bd48705",
            "w09ze2g0vezgxrufid366ob2ygdztafh2y6vf9629lmky3ujyk6gnq0lzjnofsqxkcw4an276e0n24h3t3ppx95m3ruldtr8ws",
            request);
    assertNotNull(response);
  }

  @Test
  public void updateCommentTest_400() {
    UpdateCommentRequest request = new UpdateCommentRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.updateComment(
                    "uej6ucgkna6sdhxlecwgty9vo7ki82tg25cldu5mdehvn6d9356wjgx6xhr20s6dkds3oexwawpda1j9rl1kzvxfaotr3eztze3fvgr",
                    "09c9e5be93ad3757629804d5a89aa307",
                    "p7hbrv9hkmyf9yo8wze8qjnv2x0u3g3woqf6o1095326luqsfndaoeuc8s78whsumhw59ro5zcyt3vf1o95ymg9bj1t1trxvqkkyd",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void updateCommentTest_401() {
    UpdateCommentRequest request = new UpdateCommentRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.updateComment(
                    "8lgzkr", "5fa4e40de0a7c809a6a5f95a0cf99f3f", "jpju1", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("u8eh48zw6wkr5lzm3w6hgie31nkwgwa2", error.getError());
    assertEquals("i968", error.getRequestId());
    assertEquals("Tracy Frami", error.getName());
  }
}
