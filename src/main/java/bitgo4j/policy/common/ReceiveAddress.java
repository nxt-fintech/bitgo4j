package bitgo4j.policy.common;

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
public class ReceiveAddress {
  private String id;

  private String address;

  private Integer chain;

  private Long index;

  private String coin;

  private Long lastNonce;

  private String wallet;

  private CoinSpecific coinSpecific;

  private Balance balance;

  private String label;

  private String addressType;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("address", address)
        .append("chain", chain)
        .append("index", index)
        .append("coin", coin)
        .append("lastNonce", lastNonce)
        .append("wallet", wallet)
        .append("coinSpecific", coinSpecific)
        .append("balance", balance)
        .append("label", label)
        .append("addressType", addressType)
        .toString();
  }
}
