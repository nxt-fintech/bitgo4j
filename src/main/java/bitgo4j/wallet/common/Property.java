package bitgo4j.wallet.common;

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
public class Property {
  private String balanceString;

  private String confirmedBalanceString;

  private String heldBalanceString;

  private String spendableBalanceString;

  private String stakedBalanceString;

  private Integer transferCount;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("balanceString", balanceString)
        .append("confirmedBalanceString", confirmedBalanceString)
        .append("heldBalanceString", heldBalanceString)
        .append("spendableBalanceString", spendableBalanceString)
        .append("stakedBalanceString", stakedBalanceString)
        .append("transferCount", transferCount)
        .toString();
  }
}
