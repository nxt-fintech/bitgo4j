package bitgo4j.express.common;

import bitgo4j.BitGo4jConstant;
import bitgo4j.policy.common.Amount;
import bitgo4j.policy.common.TxAddress;
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
public class RecipientEntry {
  private TxAddress address;

  private Amount amount;

  private String data;

  private TokenData tokenData;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("amount", amount)
        .append("data", data)
        .append("tokenData", tokenData)
        .toString();
  }
}
