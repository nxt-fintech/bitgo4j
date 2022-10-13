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
public class SweepFundsRequest {
  private String address;

  private String walletPassphrase;

  private String xprv;

  private String otp;

  private String feeTxConfirmTarget;

  private String feeRate;

  private String maxFeeRate;

  private Boolean allowPartialSweep;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("walletPassphrase", walletPassphrase)
        .append("xprv", xprv)
        .append("otp", otp)
        .append("feeTxConfirmTarget", feeTxConfirmTarget)
        .append("feeRate", feeRate)
        .append("maxFeeRate", maxFeeRate)
        .append("allowPartialSweep", allowPartialSweep)
        .toString();
  }
}
