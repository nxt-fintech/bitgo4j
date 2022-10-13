package bitgo4j.address.common;

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
public class Balance {
  private String updated;

  private Long balance;

  private Long totalReceived;

  private Long totalSent;

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
