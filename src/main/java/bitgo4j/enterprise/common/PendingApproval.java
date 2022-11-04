package bitgo4j.enterprise.common;

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
public class PendingApproval {
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
        .toString();
  }
}
