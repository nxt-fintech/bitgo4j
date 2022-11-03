package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
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
public class FeeInfo {
  private Integer size;

  private Integer fee;

  private Integer feeRate;

  private Integer payGoFee;

  private String payGoFeeString;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("size", size)
        .append("fee", fee)
        .append("feeRate", feeRate)
        .append("payGoFee", payGoFee)
        .append("payGoFeeString", payGoFeeString)
        .toString();
  }
}
