package bitgo4j.wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.wallet.request.BuildTransactionRequest;
import bitgo4j.wallet.request.CreateAddressRequest;
import bitgo4j.wallet.request.InitiateTransactionRequest;
import bitgo4j.wallet.request.InitiateTrustlineTransactionRequest;
import bitgo4j.wallet.request.MakeUnspentReservationRequest;
import bitgo4j.wallet.request.ModifyUnspentReservationRequest;
import bitgo4j.wallet.request.SendHalfSignedTransactionRequest;
import bitgo4j.wallet.request.UpdateWalletRequest;
import bitgo4j.wallet.response.AddressResponse;
import bitgo4j.wallet.response.AverageFeeResponse;
import bitgo4j.wallet.response.BalanceReserveDataResponse;
import bitgo4j.wallet.response.BuildTransactionResponse;
import bitgo4j.wallet.response.FreezeWalletResponse;
import bitgo4j.wallet.response.InitiateTransactionResponse;
import bitgo4j.wallet.response.ListTotalBalanceResponse;
import bitgo4j.wallet.response.ListWalletResponse;
import bitgo4j.wallet.response.MaximumSpendableResponse;
import bitgo4j.wallet.response.PotentialStuckTxsResponse;
import bitgo4j.wallet.response.SendHalfSignedTransactionResponse;
import bitgo4j.wallet.response.SpendingLimitsAndCurrentAmountSpentResponse;
import bitgo4j.wallet.response.StakedBalanceDataResponse;
import bitgo4j.wallet.response.TotalRewardsDataResponse;
import bitgo4j.wallet.response.UnspentReservationResponse;
import bitgo4j.wallet.response.UnspentsResponse;
import bitgo4j.wallet.response.WalletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockWalletClientImplTest {
  private static WalletClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().wallet();
  }

  @Test
  public void createTest_200() {
    CreateAddressRequest request = new CreateAddressRequest();
    AddressResponse response =
        client.createAddress(
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
            () -> client.createAddress("uq2pn", "42071f678c07cbf1dc644a75d1210801", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getPotentialStuckTxsTest_200() {
    List<PotentialStuckTxsResponse> response =
        client.getPotentialStuckTxs(
            "c50d3231t36yqnc68na7n06vvr7g1743vf38ir805pbjv5m1dqgh0ggw7qqh2sdtn7xa4indi2s9de34ewv0qvif4lzfeqrlc0jrvbptuoapkujex1dv",
            "5478ee9e9f7046ac2eb656b6e3de141a");
    assertNotNull(response);
  }

  @Test
  public void getPotentialStuckTxsTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getPotentialStuckTxs(
                    "fiifxeuipzgg4bbr16mgua9fcnjxl1xojb4uawrjl1hc15btvx9n9dsclp8azhjasbqenu6xg88ykpjhhz3pqb4pr9gqrtadvzsbtssoxbr2g6u326fyuq4lidj3sk7gw",
                    "dc9b0ffd78a03d9ca4cbf6fa154d0941"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getAverageFeeTest_200() {
    AverageFeeResponse response =
        client.getAverageFee(
            "wonanylv4is94kxgp10v0nt5ojlpu4dqp351zoinyh6gns16xbi8q3yy7kx69ckxx5s8ciur3yqvsqtkd9umbfi6jjetgvug2hnaumpfonkny1dsi8qi7sq71jq333h1v3v0xdzrokzcyoxxbabrqef30hyn",
            0);
    assertNotNull(response);
  }

  @Test
  public void getAverageFeeTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getAverageFee(
                    "nziudi4vkxr9vwcdv91jh5lw8272iluvfj68549h2g1qvlxckfr5ubymb7us26mjnoc3cy71xc2",
                    0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("8x3qm4ewb8o1r03soaz0ev6xdvpowm5rgizemxcv6kdj52rtm6mjx4ops", error.getError());
    assertEquals("194x", error.getRequestId());
    assertEquals("Wilfred Reilly", error.getName());
  }

  // TODO: implement
  @Test
  public void listTransfersTest_200() {}

  // TODO: implement
  @Test
  void addTest_200() {}

  @Test
  public void listByCoinTest_200() {
    ListWalletResponse response =
        client.listByCoin(
            "r6ed1d1g4gyoz74ggqv17d8moogieziwie1q34wy3uruv2jkq5l04r", "", 0, false, "", false);
    assertNotNull(response);
  }

  @Test
  public void listByCoinTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listByCoin("xuvllsd56md8hg1pl6e0nju", "", 0, false, "", false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "tysdoz8crrk5t5nzoo1sxcwor9r6q9zqls632y0qn6u3ir7pi5eqo5t0xtc7ub5bt8nq3u3kosv7kq8bxe3icxvp8yynjkkqkfyd4vlpk60trckghjdpyk6bexxrvemou04xsttq",
        error.getError());
    assertEquals("wxu7", error.getRequestId());
    assertEquals("Garrett Mayert DVM", error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void listByCoinTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.listByCoin(
                    "ffrpg1ggk95hyglfbqtmxuzz72yj1pmmq8rditjn7v8xcyplrynm44ozfdk1dw4v4bupwquh98iiqm0qhm6wxxdratcjrb3y916uhsz6ww8uh8kszmmd0lvhyfg5bu8felpkmue6nsxjghvy27p1wnado63a3c2v5jmaiutpab5u47e83otja1t9kma44z7twg",
                    "",
                    0,
                    false,
                    "",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: 200 and 400 has same url path
  @Disabled
  @Test
  public void listTest_200() {
    ListWalletResponse response =
        client.list(
            "", List.of(false), List.of(""), false, List.of(""), "", 0, "", List.of(""), false);
    assertNotNull(response);
  }

  @Test
  public void listTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.list(
                    "",
                    List.of(false),
                    List.of(""),
                    false,
                    List.of(""),
                    "",
                    0,
                    "",
                    List.of(""),
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getByAddressTest_200() {
    WalletResponse response =
        client.getByAddress(
            "ejdbjeoap1y7dqle1g7vam19wne9uy5uocz3lx7s78jtbjfzvnuhi05sexo8locvuxzfoirht3igxjc1qz",
            "1e4jm14icx5mpljxo8uf40r2oacapquomcrhbfx4ug6oefwdh5uu2xc0cw8d7g4vhydeko3xeqf6umm0jnf53fw6u4dy9djsiuhd2d");
    assertNotNull(response);
  }

  @Test
  public void getByAddressTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getByAddress(
                    "tryr3eu8np6m2ybq5fe2en6sjuhpf9d7ovwgsnj3gzs14akcsi0f5hhrgvrao17ck00a2vcnvn4l07pw6lvocps8d72wtrfv4l6a63ambdf174l0an98a63zh",
                    "y19t6r1z8wq2vitwnipff59fxhdk0oqop4cjoya5tk139ntraayqcro5jcew6qhe25rrcfgchc5902ohqjkmtga6fymszc7huvavo62wm8a3j5wdz2x3otas59l6ubyw5npfr2pn2s8qr1psl9cmgakplb3azrz87u4mt4ckiwi8yxobjxc2paxe6f30mbdq7xwwugw"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("y64gkhxlimnryvkaosmaueu14h9ufm9b04rirqher9rsfrokeavlyl7p6xh", error.getError());
    assertEquals("1548", error.getRequestId());
    assertEquals("Miss Dot Koelpin", error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void getByAddressTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getByAddress(
                    "pl1dxo891rwcearjtkly8biw4r14edbhh8tuulcgwg753bo9zyywdo70p1o",
                    "iwrtayav1i9w1bmehllvps1fk4qn5b7vuekn0lcmja8gn972"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getTest_200() {
    WalletResponse response =
        client.get(
            "cye76bs62tyzs2ef76vrquhca9rxh23pr8o0w4kjae4v4jtpwnpdacjyzxfva9rxgkjfvdo412gjzxdomc1gtr23hrrb6rgckfen74r4byxo7mptk5scjj2pttzx7pn7qwy5rqh9llol585anb2a",
            "4743252dad4545f28a675b9876a38575",
            false);
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "jdyeqgdti8qf5f5u0dmv340fhl7on4416g7s73p22jbemh2u85itfg3u52nj1omg59y8mdc4m7l3akm1qhzjn9exchdvc550jwm1vysa3y8yhypn6dz9b3q1x9u0gt2a57yhb",
                    "03bd58c20e9378773d0f714a573e111f",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void getTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "ncsrwuyq5n68anezomrar8obwq", "e148d942ddda3b4b6fa67bf5381c6ef0", false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void updateTest_200() {
    UpdateWalletRequest request = new UpdateWalletRequest();
    WalletResponse response =
        client.update(
            "mn8vp92m0d7l2qc4mcn1yvkkthz3o5ig6ag8h8sqi1fjolc5yglezmwwi1yvcud45uw2db3r7s437p5421aey2zbqznlne3z032lcyqkt17frid4w4hmv1x",
            "152417061585af31a1efd656dcbc6327",
            request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_400() {
    UpdateWalletRequest request = new UpdateWalletRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "rwkf2j1oq0cap7ecv0993bltsqpues7xzc71tyjw2vz5kz8tbo2us213r245po69ctf2h7t2lvsxwpbk6eflrtnwfct7zh8c7e5ndccrjxtelpgwegbixanbbn7ccidy80po9vvtz11bkw3a",
                    "5c4779fb0901066d039ef529ca1bea28",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void updateTest_403() {
    UpdateWalletRequest request = new UpdateWalletRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "bd0bf503j8ab8mjduutx3mmntqr3idxuhgcs6koeajhko7obk63q71v8agwkjcnd19hnfkuyc0m6gkjc7x5qnyfp3ieoq5xxjsrb7v6x5p55bi1hi8py35cv9h4rzloaformhash2vz4uhes4mp15d8k00q0d0j9hp0dqlzwxwn0gh9zvkkdqn011c53g",
                    "bcf1ec163d7b98cd128fac3c8b15fab2",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void updateTest_404() {
    UpdateWalletRequest request = new UpdateWalletRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "xwxqccfnsscpm97t1su7vn6zh38snkxk9xggqwbci6zvz7y1h1ki8n6xsb6dftbsjja9qxnouk1178h9t823gn3bz5q6ofg55guzw9alt3slywc1c8haxv512ur5xyz4",
                    "f447dc2c66bbb2f6154fc58c5bbe09cb",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void deleteTest_200() {
    WalletResponse response =
        client.delete(
            "6rjun9ll6iwkvkzfnshhdtshy1mtljqr8ce4mfldipcc9vpn41wk5n6crvkfleq7dqp5f6axqwdkpbzru4oo3rku7c5r6ty55r0x91qkqoq9b13o99mhyy205wwqz3b2cxldho0nylkqdoaitgtc04w5ofhu65auz37468rm2vm359",
            "bd78ec160876dd3f4330ac397d7866a9");
    assertNotNull(response);
  }

  @Test
  public void deleteTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.delete("ht88rv5f", "d71159d39eae4bc0cdd72164493d5cab"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void deleteTest_403() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.delete(
                    "vbtmgyzpywerfx5ddewrc09f9o01faa89lqjol7t7cevtr3pk4zcg1cmyo6kzkud19tsqmas4bhsdx1vjjpazc870rrr7jno3vc14q481h5lyivxah2eurdu863wgsvu4fvxv19r",
                    "6ea217a6ca0cdf7437fb8ae7a456376a"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "lsl1py5n94lpx502punjb8d8rfjwjknhk2aeppcbvg8j68mq4um3geltrvy1nn", error.getError());
    assertEquals("es44", error.getRequestId());
    assertEquals("Marquerite Miller", error.getName());
  }

  @Test
  public void removeUserTest_200() {
    WalletResponse response =
        client.removeUser(
            "4sc7takpddvcexvkzrq6z8cezf9v7bfhn0cknj0t4ib6qbmnrp5cq4h3qif6i2hmyx3n4s64gdbz5bkmm51xyoc0dk6mfomcq21f3zdcmgurdtr4ochqe28dvy2ey387y3x5eypr9lxho1hhn",
            "38f4eef1901fa8ae7ff29ece562f9f0c",
            "9a18b1744e7f5aa0c99ddea9541c5507");
    assertNotNull(response);
  }

  @Test
  public void removeUserTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.removeUser(
                    "vqh58xfqmhqrp3t4pehkuyijjhxqs4r47zcxne6bgvo06l5ucsf6x4gdbpsqo8n0in2bequ2ythgc0zdwvl16wsv82c8jarq3di8quvczomctn6cbfj4u1ju1q2zhjfmynon3lxduye373w6r8fsovlq8c930njggod0gsg5xsu2qrnsry",
                    "7d6dacc155c2779a6b25709a60a21345",
                    "787c94fe1a527b5a3dbb53dba6c00148"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void removeUserTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.removeUser(
                    "q6mrrbsksplpietndjyz9tyotqhwp8323gwltdtcqux9lmu5sfhffbc51spc0a16lfs33zdd5ibanop15s74fw6gpwmm4147viikffjw5372ic0b9h95ywwffefqvkk4trhr6",
                    "167c676fd767f0dd6a723f562426ecd5",
                    "a290d4d9495e06015f68fd3505f39fe2"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "lsl1py5n94lpx502punjb8d8rfjwjknhk2aeppcbvg8j68mq4um3geltrvy1nn", error.getError());
    assertEquals("es44", error.getRequestId());
    assertEquals("Marquerite Miller", error.getName());
  }

  @Test
  public void freezeTest_200() {
    FreezeWalletResponse response =
        client.freeze(
            "5a4zpaep8819r16bvtwxa41ilkmvqdeza5hb0ys7ole5aawt72i7phz5k2fmmwqglaorobfoaph1nkimowbpbo1zy1d457umri515t995si659nl1rshgyk9vq34casnucv3e1lwxoy2twzvruk5f8uasweizyjqhuifcp7pjf5msl6rzqsad8k",
            "6a712e978876b8dede76524c6f0dc9ab",
            0);
    assertNotNull(response);
  }

  @Test
  public void freezeTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.freeze("073qb3stmq04c9kd", "c21c76468fdbc2a1f838423acac210c6", 0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void freezeTest_403() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.freeze(
                    "8ln4by2onrgfsk9ck2y85i708vmbvd2cqo8dz3mp7a69doqdi8u3julhw1a39gj5r9sbov30ossg5bhg253pgjrpdcb3j4hzq7r1al2rbwiu256mx5d54741heebd9nlzb5t5lq07j7pe",
                    "7e65bf000aa7437cb25f9b03cbaa71e4",
                    0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "qsbktd4xc281kd5lgjt0dzzrcecx2tm37m91mu1b5ooagjsjheoe3xlpr1xju95lc0fk7n1p3qpbx3o9cz78fu9z6o5o35z4y1v2ivl13ddfdjobtiw33sefpwle4rqagmr3tw1a9dn7alce5qdfx89t3z592pomjbsrnl4ho9bwiz1dsgk8gv9v8l6bi1hxvv6",
        error.getError());
    assertEquals("tyns", error.getRequestId());
    assertEquals("Sharyn Haley", error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void freezeTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.freeze("frqsuzrm5d23ypeq84x8ego1", "ebe0e1ef37fb0535688fe71675c32f83", 0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getUnspentsTest_200() {
    UnspentsResponse response =
        client.getUnspents(
            "qxj6y41dudj1h9dc0mma56hhqt6olcvujg2l4kyfa54u8okssxa347fw5rehtbb52wn4y7jhy2f437vs7rn6d1ck5swqbfe7g5gom6fh49xp9azd4nl814eyrh8z26dkra518bsdqtgvvx46o2p1rtiuu2v8ojiy14trmsglvfsgt",
            "4fb0acd76de4951cc7b049fb90f862d3",
            0,
            0,
            0,
            false,
            0,
            0,
            "",
            false);
    assertNotNull(response);
  }

  @Test
  public void getUnspentsTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getUnspents(
                    "mhl2psaghs6tgqodqltfxc5evm0mja8sv5i40vqlfch4lfjfb41x40lqfd4l5eyuscaqw2cyrroguio6i829dithgujmabw73a5d28foli75b80uttoq651vkl33tnqwy6b3slsio52jpjmk6uwuhxwr49efb2qs2i15l",
                    "521b1db5df97dcb049469c6edf40d514",
                    0,
                    0,
                    0,
                    false,
                    0,
                    0,
                    "",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getUnspentsTest_403() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getUnspents(
                    "jipix9kwg0zdew60wexelo3sr46tyq92spcfiyqu11yahsfazoc52ehyh7c4jg97kdx8vb1wlk701y587rz9kwx587eanbfkcebgs5bmsgfrr6d8mmfipwbrvp13zd9szbkk9kb892qjpkrltv1e4n8zvbt214jz35y0ft23kacft",
                    "4d1c32f938d153bf6655936080148986",
                    0,
                    0,
                    0,
                    false,
                    0,
                    0,
                    "",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("6d8s64wysyugzyyyy7dkzglhyi1qin3f5wat00i", error.getError());
    assertEquals("884y", error.getRequestId());
    assertEquals("Amos Beer", error.getName());
  }

  @Test
  public void getUnspentsTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getUnspents(
                    "purezysynxb2e5cihvcag73rudyiwqzs8bs6ykp965myhkkwzi5smrfyw1egzd2h963tkyh6wjcmk7s88t",
                    "9dc4085d09a05fa0376ccba612cb17cc",
                    0,
                    0,
                    0,
                    false,
                    0,
                    0,
                    "",
                    false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "lwg4us6oykdh89lvyozvbrepxif6709enz47q5t09f058oug2kmsswkauygvwlh46imgg6vjll9wng7f1co1vqmhfb2wlps4mfq36mjrom1pzl4ne33ayexasol5qvf4i102miqeg44sa6krzgpmkfp9l99z0clyck0rrqfli0mdvg",
        error.getError());
    assertEquals("zm18", error.getRequestId());
    assertEquals("Devin Robel", error.getName());
  }

  @Test
  public void getMaximumSpendableTest_200() {
    MaximumSpendableResponse response =
        client.getMaximumSpendable(
            "bwd6niuk7c3zq52dsev1vwjvkbwcnmnawsf2k89votkykg63x69opryjot8uhbtydtmvkd83zk8grzbllei9tir9o3ggddmax1y6p03yhzdsqxdt4afyrip4g7tz9lerh2kmp6y6o42eerw8mq7byjpjosuhe2hheubwpat7e55m",
            "9cd33e0e5799bd73b679eb4c05210ac6",
            false,
            false,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0);
    assertNotNull(response);
  }

  @Test
  public void getMaximumSpendableTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getMaximumSpendable(
                    "1emaiwsmptup4cthvofi5wyqf6ghokdq2ws11ofrvib00atkn28ehzv3me6ayit1niprmf4lo78kmav0ddu3s5o6jubxy4erfcp8lkf2eqhz8nthnzu1zhqje0y2quhoamp05lf7ndv339",
                    "732f10782dbcc61cdab475dfbf363a3c",
                    false,
                    false,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getMaximumSpendableTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getMaximumSpendable(
                    "jl5eqtbqh5cr5gro35nfzabfm25p4z8pdmgnfds1tvcdz1hrv1z3g3iduroumtesv9qni7e768kudkhq0cz4mg",
                    "e420675430ce04cb7b135403b78536be",
                    false,
                    false,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("j413qd4rlshmprw59bw4elnavsk7yxfkc9hiokswgzwrjru4", error.getError());
    assertEquals("07l9", error.getRequestId());
    assertEquals("Chung Blanda PhD", error.getName());
  }

  @Test
  public void getSpendingLimitAndCurrentAmountSpentTest_200() {
    SpendingLimitsAndCurrentAmountSpentResponse response =
        client.getSpendingLimitAndCurrentAmountSpent(
            "zoh8w47v8x4toz6l3pr5ha5xxk2q0x1yigqezqt9mv6hyqupeiewfq3cqrdrz74o6qwrguofygjtqghh0uxtlqstyr52nqqc26kkjkc4vj45rqceza06",
            "e4b8d811da1c9660573616ec18b28a2e");
    assertNotNull(response);
  }

  @Test
  public void getSpendingLimitAndCurrentAmountSpentTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getSpendingLimitAndCurrentAmountSpent(
                    "vlaszm1gp5ly72d5yq7941ej6tgdok5uegp57u4qcks7u1v5tjs1ud9ujfbl3ey351gdyh1mkacqtvdotp2hr5x07ehluq9izwq2bgkw4s9t2eqirrvt9q1fhnea7cxllepxjheh1t",
                    "67cf9ff48cd4ad8681c4f3e2386eb07b"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getSpendingLimitAndCurrentAmountSpentTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getSpendingLimitAndCurrentAmountSpent(
                    "igh8w92ngruqvjj6a2449hks1akvqrj089d8g9dwrytgmsv18okj16xy9gz3esygwdy8djl811xnjl1tm3r5h6yty4abf9g1xsot5ybkhg6xkwhagzlypelavvkj4jjuge3cqvx7wjido5c8doavd4glcvuob0jd43nze",
                    "a04ead651b0fa639dacbd65cf9eb96d6"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "sq8d8nkalu0c3u15uze7ed9riffuajxmk7as2682y2f0sidx415kli70qp0us7bmxyrtnx55yc6aorjund15hb377bfuoh9w25n2nru8xzqasr12u42o66ifa5p2qptkw9bwp83uso7j0s5khy2ez2e0xi5qtsd71xz0rc4o6vwvc9udkeuv",
        error.getError());
    assertEquals("7xau", error.getRequestId());
    assertEquals("Jewel Abernathy", error.getName());
  }

  @Test
  public void makeUnspentReservationTest_200() {
    MakeUnspentReservationRequest request = new MakeUnspentReservationRequest();
    UnspentReservationResponse response =
        client.makeUnspentReservation("80551f25df3e2ebb4ad48aa11b246488", request);
    assertNotNull(response);
  }

  @Test
  public void makeUnspentReservationTest_400() {
    MakeUnspentReservationRequest request = new MakeUnspentReservationRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.makeUnspentReservation("e41d3feb0919b2e73c638a81505198a6", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("rw7ov", error.getError());
    assertEquals("twn6", error.getRequestId());
    assertEquals("Tiny Bartoletti", error.getName());
  }

  @Test
  public void releaseUnspentReservationTest_200() {
    UnspentReservationResponse response =
        client.releaseUnspentReservation(
            "c2b064c606695b67f60d37d3089b1720", List.of("53danw9vgfq18g7n1f1kzybq3ot4lo2"));
    assertNotNull(response);
  }

  @Test
  public void releaseUnspentReservationTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.releaseUnspentReservation(
                    "a913fc04f1a1bf09add655e733241386",
                    List.of(
                        "1ekiw4nqkpisvv7ezyxcl4sl8wxi71ufwo8wnq6cp8uo4auqpb367rcrhaa3u1lkf4ib177ahblq6odgzcjeufbv13pzzsc")));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "0o4psdsnpvzbdewjojj3toq5ov850y1li7jc46v9k89v6xdf1vee3q9aoof0cucz0cwoyuge24mtt6f",
        error.getError());
    assertEquals("5lpl", error.getRequestId());
    assertEquals("Chang Lubowitz", error.getName());
  }

  @Test
  public void listUnspentReservationTest_200() {
    UnspentReservationResponse response =
        client.listUnspentReservation("45a81ba8321e4c65d19b2b6b6556d60e", "", 0, "", "");
    assertNotNull(response);
  }

  @Test
  public void listUnspentReservationTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listUnspentReservation("3185a147d34a6bc42d2b5eeb832c98fe", "", 0, "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("zuphem0gb77l", error.getError());
    assertEquals("0m84", error.getRequestId());
    assertEquals("Claudia West", error.getName());
  }

  @Test
  public void modifyUnspentReservationTest_200() {
    ModifyUnspentReservationRequest request = new ModifyUnspentReservationRequest();
    UnspentReservationResponse response =
        client.modifyUnspentReservation("0dc57dee34172b8338bef3e09b9c3ccd", request);
    assertNotNull(response);
  }

  @Test
  public void modifyUnspentReservationTest_400() {
    ModifyUnspentReservationRequest request = new ModifyUnspentReservationRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.modifyUnspentReservation("fe22a515c25c603eac211a011933433b", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "phsdbyx1apkqo305iq3a7eww3smy1e6rjqcldlnksonpqe92wueoongwo6jkjz7pblr6xanhyemmu0k2rkylnxkr7c9dmqds25a82h7une91oll0r3j",
        error.getError());
    assertEquals("9191", error.getRequestId());
    assertEquals("Elvin Morissette", error.getName());
  }

  @Test
  public void listTotalBalancesTest_200() {
    ListTotalBalanceResponse response =
        client.listTotalBalances(
            List.of(""), List.of(false), List.of(""), List.of(""), "", List.of(""), false);
    assertNotNull(response);
  }

  // FIXME: 200 and 400 have same url path
  @Disabled
  @Test
  public void listTotalBalancesTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.listTotalBalances(
                    List.of(""), List.of(false), List.of(""), List.of(""), "", List.of(""), false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("awg18fd38lj75gtf8tqpqtua0xuntqwvrnux1jiglurk5w00", error.getError());
    assertEquals("096i", error.getRequestId());
    assertEquals("Bridgett Bauch", error.getName());
  }

  @Test
  public void buildTransactionTest_200() {
    BuildTransactionRequest request = new BuildTransactionRequest();
    BuildTransactionResponse response =
        client.buildTransaction(
            "nekapsr2dszcjkvz2lphl45oge5raezsz0p67989iyslrvbqse2pzhv7nd7sz80vg2qgmbgwgc4qx57hsxiithdpxjqiju3ygma5aexmjyi7hxhtu36wohnyzqpqv0rl9s2kzjhckfngzb75bn9z7r9",
            "4ef321a93fa9874d4bb0761f2bb01548",
            request);
    assertNotNull(response);
  }

  @Test
  public void buildTransactionTest_400() {
    BuildTransactionRequest request = new BuildTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.buildTransaction(
                    "ch8frqzwg6yj372tpw22391f3rehzlmu45uzayo6yy8pohs8gzcxhz5384c1znj8iz9n877n6i0c",
                    "59dc4517669f7f68041b44ec9b556de5",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void initiateTransactionTest_202() {
    InitiateTransactionRequest request = new InitiateTransactionRequest();
    InitiateTransactionResponse response =
        client.initiateTransaction("fmp", "5a0c091b8520e1e7e07923a8f1cf65c7", request);
    assertNotNull(response);
  }

  @Test
  public void initiateTransactionTest_400() {
    InitiateTransactionRequest request = new InitiateTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.initiateTransaction(
                    "41ru0gve74e2o34l1qvyw4ehfff5cnt1ey69kl3wwegs1ysema0dmxc60xaavsck0me9he56il39rea5454g27tufsloh4yzom30p3bhwkvauoa1k0zrk8yhtbgg24htk5k49g2sqldp6i8i9zwezb9y9recma43zdyb",
                    "2f67881380f805aefcee8ed7f4ee7e14",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void sendHalfSignedTransactionTest_200() {
    SendHalfSignedTransactionRequest request = new SendHalfSignedTransactionRequest();
    SendHalfSignedTransactionResponse response =
        client.sendHalfSignedTransaction(
            "jna1h834ywp6bw21jq9c8r9htdib0yzk61lewkjedwnh69ablecytp5hgc9y8xzihj6j8i98go7l9zf6ykvn8dtyuao9wlfmcd3pkjkph1mfa7300f4iy85j6omznngj6cuzsbgc",
            "3018c80c25d30c6c192937f4c59c5088",
            request);
    assertNotNull(response);
  }

  @Test
  public void sendHalfSignedTransactionTest_202() {
    SendHalfSignedTransactionRequest request = new SendHalfSignedTransactionRequest();
    SendHalfSignedTransactionResponse response =
        client.sendHalfSignedTransaction(
            "uu6rqdbpg8ds7xzkkso2gjf97ikkn8q0d0na22pdqm3i4cx9e7x5330x6akyh6cpgdxpcbs21lvlkzdgabuiqui8ck93cgpq6q99l04o0gm2zk1dbhy24qjmllns8c6obq7xz9bvnnns19ac9cn0z82z4chxlnldghn6flennvrgd71",
            "e81ef0d05a00529cd8eb0abfea061e59",
            request);
    assertNotNull(response);
  }

  @Test
  public void sendHalfSignedTransactionTest_400() {
    SendHalfSignedTransactionRequest request = new SendHalfSignedTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.sendHalfSignedTransaction(
                    "jt45kgddd6w9e5ri3qa5xlwve6iggtg2w7dmuwp25muyto6xwcxpjzvfm5mcnml3fxsc24kkuukd07bubvpqdyg9gnu3e16d6q13cw00n2wlloh1zbbrgjn",
                    "4552044e1209f97eb552053bd8e2df92",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void initiateTrustLineTransactionTest_202() {
    InitiateTrustlineTransactionRequest request = new InitiateTrustlineTransactionRequest();
    InitiateTransactionResponse response =
        client.initiateTrustLineTransaction(
            "qu7wig3cv4i4d20gz8yfolucm83v9ug8l5shcdl1za8drsd84fxg2u8ngisti5kyq69srltz3e9tsypr2qodzwmawejmba0pi0trsidbjtjar2gjhw9g4ubopaos9nhplozjdx043bglge0mk2",
            "599c2d6c230c2341d21bec1bac89a878",
            request);
    assertNotNull(response);
  }

  @Test
  public void initiateTrustLineTransactionTest_400() {
    InitiateTrustlineTransactionRequest request = new InitiateTrustlineTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.initiateTrustLineTransaction(
                    "rr69sdjzeo92sypyadyc72up060fcjzpgq0um6hen3a9poztj50yu1l1eeh3zm54e43ws",
                    "2ccb7bf398df019ce2bc0a20e888258d",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getBalanceReserveDataTest_200() {
    BalanceReserveDataResponse response = client.getBalanceReserveData("cspr");
    assertNotNull(response);
  }

  @Test
  public void getBalanceReserveDataTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.getBalanceReserveData("tcspr"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("rg2v2g37vn3i3jyvfplihn3mhhuf71uxgbt3x4y17z7b43967spxcgdyn", error.getError());
    assertEquals("yaui", error.getRequestId());
    assertEquals("Stormy Gislason", error.getName());
  }

  @Test
  public void getStackedBalanceDataTest_200() {
    List<StakedBalanceDataResponse> response =
        client.getStackedBalanceData(
            "l7952rd9fe46daoaxbz3z9jfuggs90vag9eo6zmeaz40zq85u4nfl5lyvkrwf97r4h2f2xmockv0nd4505iphacjoud3p0pwnbkdnux9mf6js0krp6jgc0gzzt8s3ogf9kmzdyo3ruwv4ood4nj52j2g7x9ktnudhnx00wltbsbgp21",
            "f2ce4eeb5f8b7b424b54087100fac5cf");
    assertNotNull(response);
  }

  @Test
  public void getStackedBalanceDataTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getStackedBalanceData(
                    "d9xme1tyjxmhbi87s535l463gbvdj4250doivsw4gx78nw9tx9o1scgeqzoono1nli0qpjbs92tp8uud3fcgmr74qmcjab96cyhkcunuo00fjmjbojel60",
                    "8574b8b402e3c67d1cbcb696fc0d4f32"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "amwwe84mdo5xupgun5zk22f3b0dl62065y9lti6m6whgky62olgdod4cgk3gurowdlrey5k9sxn26tcen5vaa9ky8bq8845s",
        error.getError());
    assertEquals("6j1c", error.getRequestId());
    assertEquals("Benny Hills", error.getName());
  }

  @Test
  public void getTotalRewardsDataTest_200() {
    List<TotalRewardsDataResponse> response =
        client.getTotalRewardsData(
            "5cft1ld7azsfmr6icts2knno6ly7d3o076tjbdpcq2dz6wbdto8r3h1mbmk2si15kfd3yc2jdllpte58q8h8frag61ru7k6fqj0ipv0l0lsn59xm7pv17j2bpaj",
            "473bf0ded9126e74b871a3986f30712b");
    assertNotNull(response);
  }

  @Test
  public void getTotalRewardsDataTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getTotalRewardsData(
                    "sy6u16jbh1h7svpukak0i3cgg7ozpa8qck7ws6ggl8hs3tuoonveo2xrxf6uxy9gcdswv4e5739vw3cnu130l8oz5emyc65lc1kpz4zy2i5puff4l5gu0yo6orcvzoft9pbg3ewsuaytub3tv6ermg2zyb",
                    "9c673b3e591d66c79aa9466f7c623194"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("1i0uozswje0cl5ybeiukd7d6bqoabkttomaqntmmqpct75t4", error.getError());
    assertEquals("7m2b", error.getRequestId());
    assertEquals("Mabelle Kohler V", error.getName());
  }
}
