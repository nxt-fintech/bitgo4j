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
public class UnspentsRequest {
  private String walletPassphrase;

  private String xprv;

  private Integer feeRate;

  private Integer maxFeeRate;

  private Integer maxFeePercentage;

  private Integer feeTxConfirmTarget;

  private Integer minValue;

  private Integer maxValue;

  private Integer minHeight;

  private Integer minConfirms;

  private Boolean enforceMinConfirmsForChange;

  private Integer limit;

  private Integer numUnspentsToMake;

  private String targetAddress;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("walletPassphrase", walletPassphrase)
        .append("xprv", xprv)
        .append("feeRate", feeRate)
        .append("maxFeeRate", maxFeeRate)
        .append("maxFeePercentage", maxFeePercentage)
        .append("feeTxConfirmTarget", feeTxConfirmTarget)
        .append("minValue", minValue)
        .append("maxValue", maxValue)
        .append("minHeight", minHeight)
        .append("minConfirms", minConfirms)
        .append("enforceMinConfirmsForChange", enforceMinConfirmsForChange)
        .append("limit", limit)
        .append("numUnspentsToMake", numUnspentsToMake)
        .append("targetAddress", targetAddress)
        .toString();
  }
}
