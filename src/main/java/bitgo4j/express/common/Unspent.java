package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Unspent {
  private String id;

  private String address;

  private Integer value;

  private String valueString;

  private Integer blockHeight;

  private String date;

  private Boolean coinbase;

  private String wallet;

  private String fromWallet;

  private Integer chain;

  private Integer index;

  private String redeemScript;

  private String witnessScript;

  private Boolean isSegwit;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("address", address)
        .append("value", value)
        .append("valueString", valueString)
        .append("blockHeight", blockHeight)
        .append("date", date)
        .append("coinbase", coinbase)
        .append("wallet", wallet)
        .append("fromWallet", fromWallet)
        .append("chain", chain)
        .append("index", index)
        .append("redeemScript", redeemScript)
        .append("witnessScript", witnessScript)
        .append("isSegwit", isSegwit)
        .toString();
  }
}
