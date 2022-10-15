package bitgo4j.walletshare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.walletshare.request.CreateWalletShareRequest;
import bitgo4j.walletshare.request.RejectWalletShareRequest;
import bitgo4j.walletshare.request.UpdateWalletShareRequest;
import bitgo4j.walletshare.response.CancelWalletShareResponse;
import bitgo4j.walletshare.response.ListWalletShareResponse;
import bitgo4j.walletshare.response.ResendWalletShareEmailResponse;
import bitgo4j.walletshare.response.UpdateWalletShareResponse;
import bitgo4j.walletshare.response.WalletShareResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockWalletShareClientImplTest {
  private static WalletShareClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().walletShare();
  }

  @Test
  public void requestTest_200() {
    client.request(
        "ikh4fekub9sxdwgha6rgwu0kk07sjhzg21spusuqzac62wgrmps5z5y8hulm",
        "a717454501a20e8b1441eb737e79a750");
  }

  @Test
  public void requestTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.request(
                    "p130cqlacftnh8oy4b579kv95m2efp7", "f030611aa21f60da535e82859c05609e"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("u0lslgwgujn8uyv8q08calskey69dvh4l", error.getError());
    assertEquals("p4hl", error.getRequestId());
    assertEquals("Mrs. Jimmie Feil", error.getName());
  }

  @Test
  public void createTest_200() {
    CreateWalletShareRequest request = new CreateWalletShareRequest();
    WalletShareResponse response =
        client.create("lhli", "85389256fa6853ccdfe973c905470419", request);
    assertNotNull(response);
  }

  @Test
  public void createTest_400() {
    CreateWalletShareRequest request = new CreateWalletShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.create(
                    "90qgr0hk3iyrq9sdpr4nqxxivwvs56biocvuo1nacpkz8r28ztzrfzjevnvyifqmaolfdgvptotxjxf95h66w",
                    "b38de1c312c724945e2d325b7c12e23f",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "npjoiqpr4z4x1x5ttxcmofshoj88zk55muutuqjxnh8nvyxyunr71y2s0r5rp2wsd", error.getError());
    assertEquals("960m", error.getRequestId());
    assertEquals("Laila Padberg", error.getName());
  }

  @Test
  public void rejectTest_200() {
    RejectWalletShareRequest request = new RejectWalletShareRequest();
    client.reject("9123b912411d67acf58514f4882bada4", request);
  }

  @Test
  public void rejectTest_400() {
    RejectWalletShareRequest request = new RejectWalletShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.reject("4565a375877a0c60c215177826d2a8f7", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("nfjo3rne", error.getError());
    assertEquals("47m9", error.getRequestId());
    assertEquals("Nadia Wintheiser", error.getName());
  }

  @Test
  public void listTest_200() {
    ListWalletShareResponse response = client.list();
    assertNotNull(response);
  }

  @Test
  public void getTest_200() {
    WalletShareResponse response =
        client.get(
            "dy7eiwb8uodh9hn7mh9nefi4aa4mas1ypxyw2we1g8dszdnxsz94z0j5fdv0rpi05y01k6umzvtacte0",
            "3f7d560585f3d8233a62ca4c88ce9346");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.get(
                    "j9udqiw1xg9d832v1f1w7u3i70okz74m4r16fu8d3l0ua3fcwugfe9kb5tgy4pjw4k9n1x246fudtzvyewyc0p4t164qv0yzzv",
                    "a40bdf1a5e87d38a05d963e23e939a94"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "6hx8vhkrhbai4avivbyudqa3pdylxd3ddamteqpppiysquzy22ux89tcpx7fkxtz9lvlm032ap0bmroa3p4lbn2qxfusu5y6hqvarb82huerktr2blc4wzacolcx1rrvh04cthj4ampsxh311cq4s53kvo5c4y39blctl11tn5cf7zs7e",
        error.getError());
    assertEquals("8nc6", error.getRequestId());
    assertEquals("Ms. Jackson Ferry", error.getName());
  }

  @Test
  public void updateTest_200() {
    UpdateWalletShareRequest request = new UpdateWalletShareRequest();
    UpdateWalletShareResponse response =
        client.update(
            "kweri8izszhvxdl3rzpg18cup9837mviwxnf9nqdwll6ihymcv5zvz3ciari69vcatfkiotgvg0u50awbtyfkbo7zpkgitp4hhyp5j0uc8z27yb6ms7plrd6pq647e1h5w3h251nn9x87b",
            "ec27e5dd291455613d351b8637597332",
            request);
    assertNotNull(response);
  }

  @Test
  public void cancelTest_200() {
    CancelWalletShareResponse response =
        client.cancel(
            "ze908df84q807dltd245orr6ka3tzfcm4x6p2z0rdhj7dd7ecdtu6brs5t03qeayyaf8i2x2ukd1iapur5zkxhtuyccyime27wn5cphyddf6u0g06s96wndm4lmrcskqxau519tvgm1jyp",
            "a85a7c17cfdfeaffb94552df882bb486");
    assertNotNull(response);
  }

  @Test
  public void resendTest_200() {
    ResendWalletShareEmailResponse response =
        client.resendMail(
            "4vfz1wuhm94yb4rc9byc2lnct1z9zyzn1crycrhar43jfdl6v8lfkatrxup41oy0a6vnw6yp0r33mi6rgiuv5bf74w87bdezb4zyfruyxeoepjuoewuiyqybeoffnzsb7ru7gk4qkga4rc2gpbjxsq0bqilnrgbsja",
            "acdfd9790f2c87bdc48d41ea57c5bacb");
    assertNotNull(response);
  }

  @Test
  public void resendTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.resendMail(
                    "c8bbj6l4w5re9121gxzec09ay3ajnxhppkfv1ht9toaq2fajkhj353ras5zxggz8y4j2g67qioe3z763pro56dtxlny5tyhxdtblwmabwdyoqdovc3uljqjt08cgv8",
                    "95b4fbad0e4e8d0eb80b1b667d3865e7"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "ngiwi9i81uicq5gg0eggm550vnrslt943ihiy5b6livvdtvs8s50c72fordxsx2x8iin32kcxsnnulo0yuzk3pto1hnld2",
        error.getError());
    assertEquals("9t3n", error.getRequestId());
    assertEquals("Felisha Reichel", error.getName());
  }

  @Test
  public void resendTest_401() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.resendMail(
                    "7zn8a4m0b9m01ei7y5j92357zvwbeodqn5rzln6ldubqcs1o8kpkjmotgoz2gxkecygvxf51k75wl8i7ha9lzsdkgi559",
                    "86ca3219f436d60f3d34c2af61ee28ab"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("es9ltzls8g2eo083ftp3ehlnqqfzhb4j9tz9egt8atfw", error.getError());
    assertEquals("373t", error.getRequestId());
    assertEquals("Efrain Wyman", error.getName());
  }
}
