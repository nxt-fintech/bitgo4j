package bitgo4j.policy.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
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
public class FeeOptions {
  // TODO: Enum
  private String unit;

  // TODO: Enum
  private String formula;

  // TODO: Enum
  private String feeType;

  private Integer gasLimit;

  private Integer gasPrice;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("unit", unit)
        .append("formula", formula)
        .append("feeType", feeType)
        .append("gasLimit", gasLimit)
        .append("gasPrice", gasPrice)
        .toString();
  }
}
