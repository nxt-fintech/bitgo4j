package bitgo4j.wallet.common;

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
public class StakingOptions {
  private Integer amount;

  private String validator;

  private String contractName;

  private String functionName;

  private FunctionArgs functionArgs;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("amount", amount)
        .append("validator", validator)
        .append("contractName", contractName)
        .append("functionName")
        .append("functionArgs", functionArgs)
        .toString();
  }
}
