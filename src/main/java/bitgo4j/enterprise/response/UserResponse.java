package bitgo4j.enterprise.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.enterprise.common.Info;
import bitgo4j.enterprise.common.PendingApproval;
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
public class UserResponse {
  private String id;

  private String bitcoinAddress;

  private String enterprise;

  private String walletId;

  private String creator;

  private String createDate;

  private Info info;

  private String state;

  private List<String> walletUserIds;

  private Long approvalsRequired;

  // TODO: refactor: pending approval same as above
  private List<PendingApproval> pendingApprovals;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("bitcoinAddress", bitcoinAddress)
        .append("enterprise", enterprise)
        .append("walletId", walletId)
        .append("creator", creator)
        .append("createDate", createDate)
        .append("info", info)
        .append("state", state)
        .append("walletUserIds", walletUserIds)
        .append("approvalsRequired", approvalsRequired)
        .append("pendingApprovals", pendingApprovals)
        .toString();
  }
}
