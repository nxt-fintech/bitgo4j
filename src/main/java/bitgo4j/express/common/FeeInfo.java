package bitgo4j.express.common;

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
public class FeeInfo {
  private String feeString;

  // UtxoFeeInfo
  private Integer size;

  private Integer fee;

  private String feeRate;

  private Integer payGoFee;

  private String payGoFeeString;

  // XlmFeeInfo
  private Integer height;

  private String xlmBaseFee;

  private String xlmBaseReserve;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("feeString", feeString)
        .append("size", size)
        .append("fee", fee)
        .append("feeRate", feeRate)
        .append("payGoFee", payGoFee)
        .append("payGoFeeString", payGoFeeString)
        .append("height", height)
        .append("xlmBaseFee", xlmBaseFee)
        .append("xlmBaseReserve", xlmBaseReserve)
        .toString();
  }
}
