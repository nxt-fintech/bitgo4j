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
public class ShareWalletRequest {
  private String email;

  private String permissions;

  private String walletPassphrase;

  private String message;

  private Boolean reshare;

  private Boolean skipKeychain;

  private Boolean disableEmail;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("email", email)
        .append("permissions", permissions)
        .append("walletPassphrase", walletPassphrase)
        .append("message", message)
        .append("reshare", reshare)
        .append("skipKeychain", skipKeychain)
        .append("disableEmail", disableEmail)
        .toString();
  }
}
