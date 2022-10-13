package bitgo4j.enterprise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.enterprise.request.AddUserRequest;
import bitgo4j.enterprise.request.FreezeEnterpriseRequest;
import bitgo4j.enterprise.request.RemoveUserRequest;
import bitgo4j.enterprise.request.UpdateEnterpriseRequest;
import bitgo4j.enterprise.response.EnterpriseResponse;
import bitgo4j.enterprise.response.EnterpriseWalletLimitResponse;
import bitgo4j.enterprise.response.FreezeEnterpriseResponse;
import bitgo4j.enterprise.response.ListEnterpriseUsersResponse;
import bitgo4j.enterprise.response.ListEnterprisesResponse;
import bitgo4j.enterprise.response.UserResponse;
import bitgo4j.exception.BitGo4jException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MockEnterpriseClientImplTest {
  private static EnterpriseClientImpl client;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    String token = props.getProperty("API_TOKEN");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().enterprise();
  }

  @Test
  public void getTest_200() {
    EnterpriseResponse response = client.get("1433e566bf9b416a55f202e7708abeee");
    assertNotNull(response);
  }

  @Test
  public void getTest_400() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.get("224e9314dad799333276d2960cb78287"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getTest_404() {
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.get("c5d7e4afd77a406958d4d1646503f5b5"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "2qj82vw0irimgp724jf7vbktl84ll2ehb5oudwqqde1u477xg9f0v5luns3jimrhb0dfoflbjlt78nin5s1x9iqju7loujcaqtd3qw",
        error.getError());
    assertEquals("6v8o", error.getRequestId());
    assertEquals("Rex Lindgren", error.getName());
  }

  @Test
  public void updateTest_200() {
    UpdateEnterpriseRequest request = new UpdateEnterpriseRequest();
    EnterpriseResponse response = client.update("71dc32bcffa01ba535c04cd2514956d4", request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_202() {
    UpdateEnterpriseRequest request = new UpdateEnterpriseRequest();
    EnterpriseResponse response = client.update("b987f4f96257b044c1e9d74801dfc28f", request);
    assertNotNull(response);
  }

  @Test
  public void updateTest_400() {
    UpdateEnterpriseRequest request = new UpdateEnterpriseRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.update("ca6aff1f07168b0ed6ae818389753f95", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "r07iduuauf9c4tudv4v1aqqr081p2ouoi051l30rpnc9dkungjdhdncs2d4ufqz593gwpojdbfif8ppg3qbr7iixj3l5dvqal86pu70ldy28xssv0ftlc1s4woqiy1148c",
        error.getError());
    assertEquals("05r3", error.getRequestId());
    assertEquals("Tequila Considine", error.getName());
  }

  @Test
  public void updateTest_404() {
    UpdateEnterpriseRequest request = new UpdateEnterpriseRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.update("a32d5201b2d4c14a0621b648dc621744", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "2l96mo24k4b5oqvcev4pzqooq4o39guezybpmjnxez5nosoqxjk0nygpqhsg9uyy0z5dadai40xbxu485if1t7iadywoooewh8hknye1o9ukvb6rgn55p0hsqdw33dbf262h8lb7o0mrrsupsmabwm2cekgi570p6nc",
        error.getError());
    assertEquals("2j0e", error.getRequestId());
    assertEquals("Sherly Heathcote", error.getName());
  }

  @Test
  public void listTest_200() {
    ListEnterprisesResponse response = client.list();
    assertNotNull(response);
  }

  // FIXME: 200, 400 and 404 have same url path
  @Disabled
  @Test
  public void listTest_400() {
    BitGo4jException exception = assertThrows(BitGo4jException.class, () -> client.list());
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "xui16q4x5q9jydlwsze0p5wjpub2gd1zxg3io0mhuobrk8xuuffqvgunv2o343neqj5qmmlyibs7juue09c2vjrie1iz05wzt2xbsex790g34xt",
        error.getError());
    assertEquals("4182", error.getRequestId());
    assertEquals("Mr. Allie Buckridge", error.getName());
  }

  // FIXME: 200, 400 and 404 have same url path
  @Disabled
  @Test
  public void listTest_404() {
    BitGo4jException exception = assertThrows(BitGo4jException.class, () -> client.list());
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "uh41ftmg1utacw7dmbzaj9ojyhxrsoxwg2fmuhqnerybay6i01bgxpnu6pcki4nzeuc89i9qjrb9k1twvvzulczt9nz4p084vk8a3gqn8vusvmgdiizqjen6pm0oknnvulmxpnbopaq2a97ffqwduupoc2jg5zv4psadayekad05pi",
        error.getError());
    assertEquals("3879", error.getRequestId());
    assertEquals("Miss Daren Hackett", error.getName());
  }

  @Test
  public void listUsersTest_200() {
    ListEnterpriseUsersResponse response =
        client.listUsers("dcf09be5e3808be5529cc53c81247cb5", false);
    assertNotNull(response);
  }

  @Test
  public void listUsersTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listUsers("f451fca3ee44b281e7da271b68cd3ccd", false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void listUsersTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.listUsers("f3d0bfcc8e411a9d16e26af98c11ba53", false));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "loy66zrywg02um3ergrrbq6p4rprzivhprtr5vdocpiqczxwnxqqwc5404gg20d9ermts99cxjjbfs5ddl94ef7v707b9xo0qoww32zzfeyy75r2lef07z14p",
        error.getError());
    assertEquals("k6k7", error.getRequestId());
    assertEquals("Dr. Son Tromp", error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void addUserTest_200() {
    AddUserRequest request = new AddUserRequest();
    UserResponse response = client.addUser("5c73b8f95cadb1a10875856371c0d517", request);
    assertNotNull(response);
  }

  @Test
  public void addUserTest_202_pendingApproval() {
    AddUserRequest request = new AddUserRequest();
    UserResponse response = client.addUser("4da06246636173f5e3f5e3d7d883e812", request);
    assertNotNull(response);
  }

  @Test
  public void addUserTest_202_pendingApprovals() {
    AddUserRequest request = new AddUserRequest();
    UserResponse response = client.addUser("4c8ef51929b3920c7ad31222506c42e2", request);
    assertNotNull(response);
  }

  @Test
  public void addUserTest_400() {
    AddUserRequest request = new AddUserRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.addUser("c194447993c49c91fd1d321dc959832a", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void addUserTest_404() {
    AddUserRequest request = new AddUserRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.addUser("66652e5178cf6ae03015c7b22256324a", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "qsyi1u4ejbiiz68rrlw6cl1loxu25d09deq9jzez06s4vtw1udlopa9ki5tdk3hr2x1fo1v2zd2he74gtdrq7qy2h3m2c5hlsv4vrokpm6v5g6llwmb4s9gfsulj2ajnl7hp8gddfvhl17q97zz3iqwrg936o30hfi56vg11vr",
        error.getError());
    assertEquals("fl28", error.getRequestId());
    assertEquals("Alonzo Lockman", error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void removeUserTest_200() {
    RemoveUserRequest request = new RemoveUserRequest();
    UserResponse response = client.removeUser("04e36ef8d6320fe5a22eb3ef49183fd5", request);
    assertNotNull(response);
  }

  @Test
  public void removeUserTest_202() {
    RemoveUserRequest request = new RemoveUserRequest();
    UserResponse response = client.removeUser("a91d6e0ed78bdf4b43dd291f793d524a", request);
    assertNotNull(response);
  }

  @Test
  public void removeUserTest_400() {
    RemoveUserRequest request = new RemoveUserRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.removeUser("e6f96cb1671306692e33b8d84191c6f3", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void removeUserTest_404() {
    RemoveUserRequest request = new RemoveUserRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.removeUser("2817821b19d053942f328bd669b2310f", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("2s3izwbyxyf60ztkop0cxrr9i", error.getError());
    assertEquals("rlxg", error.getRequestId());
    assertEquals("Ms. Jimmy O'Kon", error.getName());
  }

  @Test
  public void freezeTest_200() {
    FreezeEnterpriseRequest request = new FreezeEnterpriseRequest();
    FreezeEnterpriseResponse response = client.freeze("042935737e8c3948cf564287c88d10e1", request);
    assertNotNull(response);
  }

  @Test
  public void freezeTest_400() {
    FreezeEnterpriseRequest request = new FreezeEnterpriseRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.freeze("d18e10e4f5eda399b7c1baf34e3484eb", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  // FIXME: cope with null response
  @Disabled
  @Test
  public void freezeTest_401() {
    FreezeEnterpriseRequest request = new FreezeEnterpriseRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.freeze("7d04cfdf7e0738dd5cc50b51991cee5f", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getWalletLimitsTest_200() {
    List<EnterpriseWalletLimitResponse> response =
        client.getWalletLimits("53f57c618ac90dc535d3ceee33809059", "", "");
    assertNotNull(response);
  }

  @Test
  public void getWalletLimitsTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.getWalletLimits("8845b96646ca4091482e463a4c5a29d1", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertNull(error.getError());
    assertNull(error.getRequestId());
    assertNull(error.getName());
  }

  @Test
  public void getWalletLimitsTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.getWalletLimits("0d0efa10125e6d98b6aaf3d7527e156f", "", ""));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("gbs5mnhctztlzshmbpefc", error.getError());
    assertEquals("1e71", error.getRequestId());
    assertEquals("Ms. Emilia Larson", error.getName());
  }
}
