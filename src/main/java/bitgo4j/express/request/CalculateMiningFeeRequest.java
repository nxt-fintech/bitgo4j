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
public class CalculateMiningFeeRequest {
  private Integer feeRate;

  private Integer nP2shInputs;

  private Integer nP2pkhInputs;

  private Integer nP2shP2wshInputs;

  private Integer nOutputs;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("feeRate", feeRate)
        .append("nP2shInputs", nP2shInputs)
        .append("nP2pkhInputs", nP2pkhInputs)
        .append("nP2shP2wshInputs", nP2shP2wshInputs)
        .append("nOutputs", nOutputs)
        .toString();
  }
}
