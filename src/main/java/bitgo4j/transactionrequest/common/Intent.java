package bitgo4j.transactionrequest.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
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
public class Intent {
  private String nonce;

  private String memo;

  private String intentType;

  private String sequenceId;

  private String comment;

  private String stakingRequestId;

  private String stakingAddress;

  private Amount amount;

  private List<EnableToken> enableTokens;

  private List<Recipient> recipients;

  private String proxy;

  private FeeOptions feeOptions;

  private HopParams hopParams;

  private Boolean isTss;

  private Boolean selfSend;

  private String txid;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("nonce", nonce)
        .append("memo", memo)
        .append("intentType", intentType)
        .append("sequenceId", sequenceId)
        .append("comment", comment)
        .append("stakingRequestId", stakingRequestId)
        .append("stakingAddress", stakingAddress)
        .append("amount", amount)
        .append("enableTokens", enableTokens)
        .append("recipients", recipients)
        .append("proxy", proxy)
        .append("feeOptions", feeOptions)
        .append("hopParams", hopParams)
        .append("isTss", isTss)
        .append("selfSend", selfSend)
        .append("txid", txid)
        .toString();
  }
}
