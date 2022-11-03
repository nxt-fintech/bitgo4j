package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
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

  private UserChangeRequest userChangeRequest;

  private PolicyRuleRequest policyRuleRequest;

  private UpdateApprovalRequiredRequest updateApprovalRequiredRequest;

  private SigningPolicyUpdateRequest signingPolicyUpdateRequest;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("type", type)
        .append("transactionRequest", transactionRequest)
        .append("policyRuleRequest", policyRuleRequest)
        .append("updateApprovalRequiredRequest", updateApprovalRequiredRequest)
        .append("signingPolicyUpdateRequest", signingPolicyUpdateRequest)
        .append("policyRuleRequest", policyRuleRequest)
        .toString();
  }
}
