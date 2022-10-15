package bitgo4j.policy.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.policy.common.Admin;
import bitgo4j.policy.common.BuildDefaults;
import bitgo4j.policy.common.CoinSpecific;
import bitgo4j.policy.common.CustomChangeKeySignatures;
import bitgo4j.policy.common.Freeze;
import bitgo4j.policy.common.Info;
import bitgo4j.policy.common.ReceiveAddress;
import bitgo4j.policy.common.User;
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
public class PolicyResponse {
  // For 200
  private Admin admin;

  private Boolean allowBackupKeySigning;

  private Long approvalsRequired;

  private String balanceString;

  private BuildDefaults buildDefaults;

  private String coin;

  private CoinSpecific coinSpecific;

  private String custodialWalletId;

  private Boolean deleted;

  private Boolean disableTransactionNotifications;

  private String enterprise;

  private Freeze freeze;

  private String id;

  private Boolean isCold;

  private List<String> keys;

  private String label;

  private Long m;

  private Long n;

  private String nodeId;

  private ReceiveAddress receiveAddress;

  private Boolean recoverable;

  private List<String> tags;

  private String spendableBalanceString;

  private String startDate;

  private String type;

  private List<User> users;

  private CustomChangeKeySignatures customChangeKeySignatures;

  private String multisigType;

  // For 202
  private String wallet;

  private String creator;

  private String createDate;

  private Info info;

  private String state;

  private String scope;

  private List<String> userIds;

  private String walletLabel;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("admin", admin)
        .append("allowBackupKeySigning", allowBackupKeySigning)
        .append("approvalsRequired", approvalsRequired)
        .append("balanceString", balanceString)
        .append("buildDefaults", buildDefaults)
        .append("coin", coin)
        .append("coinSpecific", coinSpecific)
        .append("custodialWalletId", custodialWalletId)
        .append("deleted", deleted)
        .append("disableTransactionNotifications", disableTransactionNotifications)
        .append("enterprise", enterprise)
        .append("freeze", freeze)
        .append("id", id)
        .append("isCold", isCold)
        .append("keys", keys)
        .append("label", label)
        .append("m", m)
        .append("n", n)
        .append("nodeId", nodeId)
        .append("receiveAddress", receiveAddress)
        .append("recoverable", recoverable)
        .append("tags", tags)
        .append("spendableBalanceString", spendableBalanceString)
        .append("startDate", startDate)
        .append("type", type)
        .append("users", users)
        .append("customChangeKeySignatures", customChangeKeySignatures)
        .append("multisigType", multisigType)
        // For 202
        .append("wallet", wallet)
        .append("creator", creator)
        .append("createDate", createDate)
        .append("info", info)
        .append("state", state)
        .append("scope", scope)
        .append("userIds", userIds)
        .append("walletLabel", walletLabel)
        .toString();
  }
}
