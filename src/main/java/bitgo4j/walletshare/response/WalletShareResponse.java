package bitgo4j.walletshare.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.walletshare.common.Keychain;
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
public class WalletShareResponse {
  private String id;

  private String coin;

  private String wallet;

  private String walletLabel;

  private String fromUser;

  private String toUser;

  private String permissions;

  private String message;

  private String state;

  private String enterprise;

  private String pendingApprovalId;

  private Keychain keychain;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("coin", coin)
        .append("wallet", wallet)
        .append("walletLabel", walletLabel)
        .append("fromUser", fromUser)
        .append("toUser", toUser)
        .append("permissions", permissions)
        .append("message", message)
        .append("state", state)
        .append("enterprise", enterprise)
        .append("pendingApprovalId", pendingApprovalId)
        .append("keychain", keychain)
        .toString();
  }
}
