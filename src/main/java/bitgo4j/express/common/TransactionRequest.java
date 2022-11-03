package bitgo4j.express.common;

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
public class TransactionRequest {
  //  BuildParams buildParams;

  private CoinSpecific coinSpecific;

  private String comment;

  private Integer fee;

  private Boolean isUnsigned;

  //  List<Recipient> recipients;

  private Integer requestedAmount;

  private String sourceWallet;

  private String triggeredPolicy;

  private String validTransaction;

  private String validTransactionHash;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        //        .append("buildParams", buildParams)
        .append("coinSpecific", coinSpecific)
        .append("comment", comment)
        .append("fee", fee)
        .append("isUnsigned", isUnsigned)
        //        .append("recipients", recipients)
        .append("requestedAmount", requestedAmount)
        .append("sourceWallet", sourceWallet)
        .append("triggeredPolicy", triggeredPolicy)
        .append("validTransaction", validTransaction)
        .append("validTransactionHash", validTransactionHash)
        .toString();
  }
}
