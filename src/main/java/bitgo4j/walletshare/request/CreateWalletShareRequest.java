package bitgo4j.walletshare.request;

import bitgo4j.BitGo4jConstant;
import bitgo4j.walletshare.common.Keychain;
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
public class CreateWalletShareRequest {
  private String permissions;

  private String message;

  private Boolean reshare;

  private Boolean skipKeychain;

  private Boolean disableEmail;

  private String user;

  private Keychain keychain;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("permissions", permissions)
        .append("message", message)
        .append("reshare", reshare)
        .append("skipKeychain", skipKeychain)
        .append("disableEmail", disableEmail)
        .append("user", user)
        .append("keychain", keychain)
        .toString();
  }
}
