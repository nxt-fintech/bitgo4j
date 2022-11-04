package bitgo4j.wallet.common;

import bitgo4j.BitGo4jConstant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class TransactionRequestFull {
  private String txRequestId;

  private String policyUniquId;

  private List<String> verificationItems;

  private String verificationRuleId;

  private List<String> videoApprovers;

  private String walletRebalanceEventId;

  private TxRequest txRequest;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("txRequestId", txRequestId)
        .append("policyUniquId", policyUniquId)
        .append("verificationItems", verificationItems)
        .append("verificationRuleId", verificationRuleId)
        .append("videoApprovers", videoApprovers)
        .append("walletRebalanceEventId", walletRebalanceEventId)
        .append("txRequest", txRequest)
        .toString();
  }
}
