package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
  private String updated;

  private Integer balance;

  private Integer totalReceived;

  private Integer totalSent;

  private String balanceString;

  private String coin;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("updated", updated)
        .append("balance", balance)
        .append("totalReceived", totalReceived)
        .append("totalSent", totalSent)
        .append("balanceString", balanceString)
        .append("coin", coin)
        .toString();
  }
}
