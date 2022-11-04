package bitgo4j.transfer.common;

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
public class Eip1559 {
  //  private String maxPriorityFeePerGas;
  //
  //  private String maxFeePerGas;

  private String baseFee;

  private String gasUsedRatio;

  private String safeLowMinerTip;

  private String normalMinerTip;

  private String standardMinerTip;

  private String fastestMinerTip;

  private String ludicrousMinerTip;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("baseFee", baseFee)
        .append("gasUsedRatio", gasUsedRatio)
        .append("safeLowMinerTip", safeLowMinerTip)
        .append("normalMinerTip", normalMinerTip)
        .append("standardMinerTip", standardMinerTip)
        .append("fastestMinerTip", fastestMinerTip)
        .append("ludicrousMinerTip", ludicrousMinerTip)
        .toString();
  }
}
