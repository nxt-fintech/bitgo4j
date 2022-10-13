package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AcceptWalletShareRequest {
  private String userPassword;

  private String newWalletPassphrase;

  private String overrideEncryptedPrv;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("userPassword", userPassword)
        .append("newWalletPassphrase", newWalletPassphrase)
        .append("overrideEncryptedPrv", overrideEncryptedPrv)
        .toString();
  }
}
