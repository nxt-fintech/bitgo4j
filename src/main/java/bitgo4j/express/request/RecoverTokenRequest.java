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
public class RecoverTokenRequest {
  private String tokenContractAddress;

  private String recipient;

  private String walletPassphrase;

  private String prv;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("tokenContractAddress", tokenContractAddress)
        .append("recipient", recipient)
        .append("walletPassphrase", walletPassphrase)
        .append("prv", prv)
        .toString();
  }
}
