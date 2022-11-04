package bitgo4j.wallet.common;

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
public class Info {
  private String type;

  private TransactionRequest transactionRequest;

  private TransactionRequestFull transactionRequestFull;

  private UserChangeRequest userChangeRequest;

  private PolicyRuleRequest policyRuleRequest;

  private UpdateApprovalRequiredRequest updateApprovalRequiredRequest;

  private EnterpriseModificationResponse enterpriseModificationResponse;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("type", type)
        .append("transactionRequest", transactionRequest)
        .append("transactionRequestFull", transactionRequestFull)
        .append("userChangeRequest", userChangeRequest)
        .append("policyRuleRequest", policyRuleRequest)
        .append("updateApprovalRequiredRequest", updateApprovalRequiredRequest)
        .append("enterpriseModificationResponse", enterpriseModificationResponse)
        .toString();
  }
}
