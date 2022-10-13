package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
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
