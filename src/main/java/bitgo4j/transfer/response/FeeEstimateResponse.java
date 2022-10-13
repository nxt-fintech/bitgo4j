package bitgo4j.transfer.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.transfer.common.Eip1559;
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
public class FeeEstimateResponse {
  private Integer feePerKb;

  private Integer cpfpFeePerkb;

  private Integer numBlocks;

  private Integer confidence;

  private Integer multiplier;

  // TODO: check
  //  private Object feeByBlockTarget;

  private String feeEstimate;

  private String gasLimitEstimate;

  private String minGasPrice;

  private String minGasLimit;

  private String maxGasLimit;

  private String minGasIncreaseBy;

  private Eip1559 eip1559;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("feePerKb", feePerKb)
        .append("cpfpFeePerKb", cpfpFeePerkb)
        .append("numBlocks", numBlocks)
        .append("confidence", confidence)
        .append("multiplier", multiplier)
        //        .append("feeByBlockTarget", feeByBlockTarget)
        .append("feeEstimate", feeEstimate)
        .append("gasLimitEstimate", gasLimitEstimate)
        .append("minGasPrice", minGasPrice)
        .append("minGasLimit", minGasLimit)
        .append("maxGasLimit", maxGasLimit)
        .append("minGasIncreaseBy", minGasIncreaseBy)
        .append("eip1559", eip1559)
        .toString();
  }
}
