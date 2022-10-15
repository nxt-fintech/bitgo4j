package bitgo4j.wallet.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.transfer.common.Entry;
import bitgo4j.transfer.common.History;
import bitgo4j.transfer.common.InOut;
import java.math.BigDecimal;
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
public class Transfer {
  private String coin;

  private String id;

  private String wallet;

  private String enterprise;

  private String txid;

  private Long height;

  private String heightId;

  private String date;

  private String type;

  private BigDecimal value;

  private String valueString;

  private BigDecimal baseValue;

  private String baseValueString;

  private String feeString;

  private BigDecimal payGoFee;

  private String payGoFeeString;

  private Double usd;

  private Double usdRate;

  private String state;

  private List<String> tags;

  private List<History> history;

  private String comment;

  private Integer vSize;

  private Integer nSegwitInputs;

  //  private Object coinSpecific;

  private String sequenceId;

  private List<Entry> entries;

  private Boolean usersNotified;

  private Integer confirmations;

  private List<InOut> inputs;

  private List<InOut> outputs;

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
        //        .append("coinSpecific", coinSpecific)
        .append("sequenceId", sequenceId)
        .append("entries", entries)
        .append("usersNotified", usersNotified)
        .toString();
  }
}
