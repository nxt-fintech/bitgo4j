package bitgo4j.transactionrequest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.transactionrequest.common.CoinSpecific;
import bitgo4j.transactionrequest.common.Entry;
import bitgo4j.transactionrequest.common.History;
import java.util.List;
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
public class TransferResponse {
  private String coin;

  private String id;

  private String wallet;

  private String enterprise;

  private String txid;

  private Integer height;

  private String heightId;

  private String date;

  private String type;

  private Integer value;

  private String valueString;

  private Integer baseValue;

  private String baseValueString;

  private String feeString;

  private Integer payGoFee;

  private String payGoFeeString;

  private Integer usd;

  private Integer usdRate;

  private String state;

  private List<String> tags;

  // BitGo defines it as history
  private List<History> history;

  private String comment;

  private Integer vSize;

  private Integer nSegwitInputs;

  private CoinSpecific coinSpecific;

  private String sequenceId;

  private List<Entry> entries;

  private Boolean usersNotified;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("coin", coin)
        .append("id", id)
        .append("wallet", wallet)
        .append("enterprise", enterprise)
        .append("txid", txid)
        .append("height", height)
        .append("heightId", heightId)
        .append("date", date)
        .append("type", type)
        .append("value", value)
        .append("valueString", valueString)
        .append("baseValue", baseValue)
        .append("baseValueString", baseValueString)
        .append("feeString", feeString)
        .append("payGoFee", payGoFee)
        .append("payGoFeeString", payGoFeeString)
        .append("usd", usd)
        .append("usdRate", usdRate)
        .append("state", state)
        .append("tags", tags)
        .append("history", history)
        .append("comment", comment)
        .append("vSize", vSize)
        .append("nSegwitInputs", nSegwitInputs)
        .append("coinSpecific", coinSpecific)
        .append("sequenceId", sequenceId)
        .append("entries", entries)
        .append("usersNotified", usersNotified)
        .toString();
  }
}
