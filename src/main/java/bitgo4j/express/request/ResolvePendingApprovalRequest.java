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
public class ResolvePendingApprovalRequest {
  private String state;

  private String walletPassphrase;

  private String xprv;

  private String otp;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("state", state)
        .append("walletPassphrase", walletPassphrase)
        .append("xprv", xprv)
        .append("otp", otp)
        .toString();
  }
}
