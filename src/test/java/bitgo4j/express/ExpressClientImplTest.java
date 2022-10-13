package bitgo4j.express;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.TestingUtils;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.express.request.AccelerateTransactionRequest;
import bitgo4j.express.request.AcceptWalletShareRequest;
import bitgo4j.express.request.CalculateMiningFeeRequest;
import bitgo4j.express.request.CanonicalizeAddressRequest;
import bitgo4j.express.request.ConsolidateAccountRequest;
import bitgo4j.express.request.CreateAddressRequest;
import bitgo4j.express.request.CryptRequest;
import bitgo4j.express.request.GenerateWalletRequest;
import bitgo4j.express.request.LoginRequest;
import bitgo4j.express.request.RecoverTokenRequest;
import bitgo4j.express.request.ResolvePendingApprovalRequest;
import bitgo4j.express.request.SendToManyRequest;
import bitgo4j.express.request.ShareWalletRequest;
import bitgo4j.express.request.SignTransactionRequest;
import bitgo4j.express.request.SweepFundsRequest;
import bitgo4j.express.request.UnspentsRequest;
import bitgo4j.express.request.VerifyAddressRequest;
import bitgo4j.express.response.AddressResponse;
import bitgo4j.express.response.DecryptResponse;
import bitgo4j.express.response.EncryptResponse;
import bitgo4j.express.response.KeyResponse;
import bitgo4j.express.response.LoginResponse;
import bitgo4j.express.response.PingResponse;
import bitgo4j.express.response.VerifyAddressResponse;
import bitgo4j.express.response.WalletResponse;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// FIXME: need to update
@Disabled
public class ExpressClientImplTest {
  private static ExpressClientImpl client;

  private static String token;

  private static String id;

  private static String password;

  private static String otp;

  private static String coin;

  private static String walletId;

  private static String approvalId;

  private static String address;

  @BeforeAll
  static void setUp() throws IOException {
    Properties props = TestingUtils.getProperties();
    token = props.getProperty("API_TOKEN");
    id = props.getProperty("ID");
    password = props.getProperty("PASSWORD");
    otp = props.getProperty("OTP");
    coin = props.getProperty("COIN");
    walletId = props.getProperty("WALLET_ID");
    approvalId = props.getProperty("APPROVAL_ID");
    address = props.getProperty("ADDRESS");

    BitGo4jConfig config = BitGo4jConfig.builder().token(token).useTest().useDocker().build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().express();
  }

  @Test
  public void createAddressTest() {
    CreateAddressRequest request = new CreateAddressRequest();
    AddressResponse response = client.createAddress(coin, walletId, request);
    assertNotNull(response);
  }

  @Test
  public void loginTest() {
    LoginRequest request = new LoginRequest(id, false, otp, password);
    LoginResponse response = BitGo4j.api().express().login(request);
    assertNotNull(response);
  }

  @Test
  public void pingTest() {
    PingResponse response = BitGo4j.api().express().ping();
    assertNotNull(response);
    assertEquals("express server is ok!", response.getStatus());
  }

  // FIXME:
  @Test
  public void sendTransactionThrowExceptionTest() {
    //    Memo memo = new Memo("", "");
    //    StakingOptions stakingOptions = new StakingOptions(0, "");
    //    Reservation reservation = new Reservation("2022-09-30T16:36:38Z");
    //    SendTransactionRequest request =
    //        new SendTransactionRequest(
    //            address,
    //            1,
    //            null,
    //            null,
    //            2,
    //            0,
    //            0,
    //            0,
    //            false,
    //            0,
    //            null,
    //            0,
    //            1000,
    //            0,
    //            0,
    //            "",
    //            false,
    //            Collections.emptyList(),
    //            address,
    //            false,
    //            memo,
    //            null,
    //            "p2sh",
    //            null,
    //            null,
    //            0,
    //            0,
    //            Collections.emptyList(),
    //            0,
    //            0,
    //            1,
    //            "",
    //            "",
    //            "RANDOM",
    //            0,
    //            0,
    //            "trustline",
    //            Collections.emptyList(),
    //            stakingOptions,
    //            "",
    //            reservation,
    //            null,
    //            false);
    //    BitGo4jException exception =
    //        assertThrows(BitGo4jException.class, () -> client.sendTransaction(coin, walletId,
    // request));
    //    BitGo4jError error = exception.getError();
    //
    //    assertEquals("recipients must be empty for CPFP transactions", error.getError());
    //    assertEquals("Invalid", error.getName());
  }

  @Test
  public void sendToManyThrowExceptionTest() {
    SendToManyRequest request = new SendToManyRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.sendToMany(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals(
        " should have required property 'recipients',  should have required property 'nonParticipation',  should match exactly one schema in oneOf",
        error.getError());
    assertEquals("SchemaValidationError", error.getName());
  }

  @Test
  public void encryptAndDecryptMessageTest() {
    CryptRequest request = new CryptRequest("test", password);
    EncryptResponse response = client.encryptMessage(request);
    assertNotNull(response);

    CryptRequest request2 = new CryptRequest(response.getEncrypted(), password);
    DecryptResponse response2 = client.decryptMessage(request2);
    assertNotNull(response2);
  }

  @Test
  public void calculateMiningFeeThrowExceptionTest() {
    CalculateMiningFeeRequest request = new CalculateMiningFeeRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.calculateMiningFee(request));
    BitGo4jError error = exception.getError();

    assertEquals("expecting positive nP2shInputs", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void createKeyTest() {
    KeyResponse response = client.createKey(coin);
    assertNotNull(response);
  }

  @Test
  public void generateWalletTest() {
    GenerateWalletRequest request =
        new GenerateWalletRequest(
            "my test wallet",
            "secretpassphrase",
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
    WalletResponse response = client.generateWallet(coin, false, request);
    assertNotNull(response);
  }

  @Test
  public void shareWalletThrowExceptionTest() {
    ShareWalletRequest request = new ShareWalletRequest("", "admin", "", "", false, false, true);
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.shareWallet(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals("Missing parameter: email", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void acceptWalletThrowExceptionTest() {
    AcceptWalletShareRequest request = new AcceptWalletShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.acceptWalletShare(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals("wallet share not found", error.getError());
    assertEquals("NotFound", error.getName());
  }

  @Test
  public void signTransactionThrowExceptionTest() {
    SignTransactionRequest request = new SignTransactionRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.signTransaction(coin, request));
    BitGo4jError error = exception.getError();

    assertEquals("missing txPrebuild parameter", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void recoverTokenThrowExceptionTest() {
    RecoverTokenRequest request = new RecoverTokenRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.recoverToken(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals("token recovery only supported for eth wallets", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void consolidateAccountThrowExceptionTest() {
    ConsolidateAccountRequest request = new ConsolidateAccountRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.consolidateAccount(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertNotNull(error);
  }

  @Test
  public void consolidateUnspentsThrowExceptionTest() {
    UnspentsRequest request = new UnspentsRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.consolidateUnspents(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals(
        "There are too few unspents that meet the given parameters to consolidate",
        error.getError());
    assertEquals("Invalid", error.getName());
  }

  @Test
  public void fanOutUnspentsThrowExceptionTest() {
    UnspentsRequest fanOutUnspents = new UnspentsRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.fanOutUnspents(coin, walletId, fanOutUnspents));
    BitGo4jError error = exception.getError();

    assertEquals("walletPassphrase property missing", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void sweepFundsThrowExceptionTest() {
    SweepFundsRequest request = new SweepFundsRequest();
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.sweepFunds(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals("Missing parameter: address", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void accelerateTransactionThrowExceptionTest() {
    AccelerateTransactionRequest request = new AccelerateTransactionRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.accelerateTransaction(coin, walletId, request));
    BitGo4jError error = exception.getError();

    assertEquals("expecting cpfpTxIds to be an array of length 1", error.getError());
    assertNull(error.getName());
  }

  @Test
  public void canonicalizeAddressThrowExceptionTest() {
    CanonicalizeAddressRequest request = new CanonicalizeAddressRequest(address, "base58");
    BitGo4jException exception =
        assertThrows(BitGo4jException.class, () -> client.canonicalizeAddress(coin, request));
    BitGo4jError error = exception.getError();

    assertEquals(
        "only Litecoin/Bitcoin Cash/Bitcoin SV address canonicalization is supported",
        error.getError());
    assertNull(error.getName());
  }

  @Test
  public void verifyAddressTest() {
    VerifyAddressRequest request = new VerifyAddressRequest(address);
    VerifyAddressResponse response = client.verifyAddress(coin, request);
    assertNotNull(response);
  }

  @Test
  public void resolvePendingApprovalThrowExceptionTest() {
    ResolvePendingApprovalRequest request = new ResolvePendingApprovalRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class, () -> client.resolvePendingApproval(coin, approvalId, request));
    BitGo4jError error = exception.getError();

    assertNotNull(error);
  }
}
