package bitgo4j.key.request;

import bitgo4j.key.common.KeyShare;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateKeyRequestTest {
  @Mock List<KeyShare> keyShares;

  @InjectMocks CreateKeyRequest createKeyRequest;

  @Test
  void testToString() {
    String result = createKeyRequest.toString();
    Assertions.assertEquals(
        "CreateKeyRequest[encryptedPrv=<null>,provider=<null>,source=<null>,derivedFromParentWithSeed=<null>,disableKRSEmail=<null>,enterprise=<null>,identifier=<null>,newFeeAddress=<null>,originalPasscodeEncryptionCode=<null>,pub=<null>,commonPub=<null>,commonKeychain=<null>,keyShares=keyShares,type=<null>,keyType=<null>,userGPGPublicKey=<null>,backupGPGPublicKey=<null>]",
        result);
  }

  @Test
  void testSetEncryptedPrv() {
    createKeyRequest.setEncryptedPrv("encryptedPrv");
  }

  @Test
  void testSetProvider() {
    createKeyRequest.setProvider("provider");
  }

  @Test
  void testSetSource() {
    createKeyRequest.setSource("source");
  }

  @Test
  void testSetDerivedFromParentWithSeed() {
    createKeyRequest.setDerivedFromParentWithSeed("derivedFromParentWithSeed");
  }

  @Test
  void testSetDisableKRSEmail() {
    createKeyRequest.setDisableKRSEmail(Boolean.TRUE);
  }

  @Test
  void testSetEnterprise() {
    createKeyRequest.setEnterprise("enterprise");
  }

  @Test
  void testSetIdentifier() {
    createKeyRequest.setIdentifier("identifier");
  }

  @Test
  void testSetNewFeeAddress() {
    createKeyRequest.setNewFeeAddress(Boolean.TRUE);
  }

  @Test
  void testSetOriginalPasscodeEncryptionCode() {
    createKeyRequest.setOriginalPasscodeEncryptionCode("originalPasscodeEncryptionCode");
  }

  @Test
  void testSetPub() {
    createKeyRequest.setPub("pub");
  }

  @Test
  void testSetCommonPub() {
    createKeyRequest.setCommonPub("commonPub");
  }

  @Test
  void testSetCommonKeychain() {
    createKeyRequest.setCommonKeychain("commonKeychain");
  }

  @Test
  void testSetKeyShares() {
    createKeyRequest.setKeyShares(
        List.of(new KeyShare("from", "to", "publicShare", "privateShare")));
  }

  @Test
  void testSetType() {
    createKeyRequest.setType("type");
  }

  @Test
  void testSetKeyType() {
    createKeyRequest.setKeyType("keyType");
  }

  @Test
  void testSetUserGPGPublicKey() {
    createKeyRequest.setUserGPGPublicKey("userGPGPublicKey");
  }

  @Test
  void testSetBackupGPGPublicKey() {
    createKeyRequest.setBackupGPGPublicKey("backupGPGPublicKey");
  }
}
