package bitgo4j.key.request;

import bitgo4j.BitGo4jConstant;
import bitgo4j.key.common.KeyShare;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateKeyRequest {
  private String encryptedPrv;

  private String provider;

  private String source;

  private String derivedFromParentWithSeed;

  private Boolean disableKRSEmail;

  //  private Object krsSpecific;

  private String enterprise;

  private String identifier;

  private Boolean newFeeAddress;

  private String originalPasscodeEncryptionCode;

  private String pub;

  private String commonPub;

  private String commonKeychain;

  private List<KeyShare> keyShares;

  private String type;

  private String keyType;

  private String userGPGPublicKey;

  private String backupGPGPublicKey;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("encryptedPrv", encryptedPrv)
        .append("provider", provider)
        .append("source", source)
        .append("derivedFromParentWithSeed", derivedFromParentWithSeed)
        .append("disableKRSEmail", disableKRSEmail)
        //        .append("krsSpecific", krsSpecific)
        .append("enterprise", enterprise)
        .append("identifier", identifier)
        .append("newFeeAddress", newFeeAddress)
        .append("originalPasscodeEncryptionCode", originalPasscodeEncryptionCode)
        .append("pub", pub)
        .append("commonPub", commonPub)
        .append("commonKeychain", commonKeychain)
        .append("keyShares", keyShares)
        .append("type", type)
        .append("keyType", keyType)
        .append("userGPGPublicKey", userGPGPublicKey)
        .append("backupGPGPublicKey", backupGPGPublicKey)
        .toString();
  }
}
