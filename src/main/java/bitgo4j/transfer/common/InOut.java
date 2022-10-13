package bitgo4j.transfer.common;

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
public class InOut {
  private String id;

  private String address;

  private Long value;

  private String valueString;

  private Long blockHeight;

  private String date;

  private Boolean coinbase;

  private String wallet;

  private String fromWallet;

  private Long chain;

  private Long index;

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
