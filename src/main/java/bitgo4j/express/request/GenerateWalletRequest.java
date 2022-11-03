package bitgo4j.express.request;

import bitgo4j.BitGo4jConstant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class GenerateWalletRequest {
  private String label;

  private String passphrase;

  private String userKey;

  private String backupXpub;

  private String backupXpubProvider;

  private String enterprise;

  private Boolean disableTransactionNotifications;

  private String passcodeEncryptionCode;

  private String coldDerivationSeed;

  private Integer gasPrice;

  private Boolean disableKRSEmail;

  private Integer walletVersion;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("label", label)
        .append("passphrase", passphrase)
        .append("userKey", userKey)
        .append("backupXpub", backupXpub)
        .append("backupXpubProvider", backupXpubProvider)
        .append("enterprise", enterprise)
        .append("disableTransactionNotifications", disableTransactionNotifications)
        .append("passcodeEncryptionCode", passcodeEncryptionCode)
        .append("coldDerivationSeed", coldDerivationSeed)
        .append("gasPrice", gasPrice)
        .append("disableKRSEmail", disableKRSEmail)
        .append("walletVersion", walletVersion)
        .toString();
  }
}
