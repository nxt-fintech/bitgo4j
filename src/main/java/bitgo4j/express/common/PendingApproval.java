package bitgo4j.express.common;

import bitgo4j.BitGo4jConstant;
import bitgo4j.enterprise.common.Info;
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
public class PendingApproval {
  private String id;

  private String coin;

  private String wallet;

  private String enterprise;

  private String creator;

  private String createDate;

  private Info info;

  private String state;

  private String scope;

  private List<String> userIds;

  private Long approvalsRequired;

  private String walletLabel;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("coin", coin)
        .append("wallet", wallet)
        .append("enterprise", enterprise)
        .append("creator", creator)
        .append("createDate", createDate)
        .append("info", info)
        .append("state", state)
        .append("scope", scope)
        .append("userIds", userIds)
        .append("approvalsRequired", approvalsRequired)
        .append("walletLabel", walletLabel)
        .toString();
  }
}
