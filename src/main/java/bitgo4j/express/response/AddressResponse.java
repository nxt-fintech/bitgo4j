package bitgo4j.express.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Balance;
import bitgo4j.express.common.CoinSpecific;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {
  private String id;

  private String address;

  private Integer chain;

  private Integer index;

  private String coin;

  private Integer lastNonce;

  private String wallet;

  private CoinSpecific coinSpecific;

  private String label;

  private String addressType;

  private Balance balance;

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
        .append("label", label)
        .append("addressType", addressType)
        .append("balance", balance)
        .toString();
  }
}