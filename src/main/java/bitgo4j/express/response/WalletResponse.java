package bitgo4j.express.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Admin;
import bitgo4j.express.common.Freeze;
import bitgo4j.express.common.KeySignatures;
import bitgo4j.express.common.PendingApproval;
import bitgo4j.express.common.ReceiveAddress;
import bitgo4j.express.common.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

// TODO: critical: cope with another response definition
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletResponse {
  private String id;

  private List<User> users;

  private String coin;

  private String label;

  private Long m;

  private Long n;

  private List<String> keys;

  private KeySignatures keySignatures;

  private List<String> tags;

  private ReceiveAddress receiveAddress;

  private Long balance;

  private String balanceString;

  private Long confirmedBalance;

  private String confirmedBalanceString;

  private Long spendableBalance;

  private String spendableBalanceString;

  private Boolean deleted;

  private Boolean isCold;

  private Freeze freeze;

  private Boolean disableTransactionNotifications;

  private Admin admin;

  private Long approvalsRequired;

  private List<PendingApproval> pendingApprovals;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("users", users)
        .append("coin", coin)
        .append("label", label)
        .append("m", m)
        .append("n", n)
        .append("keys", keys)
        .append("keySignatures", keySignatures)
        .append("tags", tags)
        .append("receiveAddress", receiveAddress)
        .append("balance", balance)
        .append("balanceString", balanceString)
        .append("confirmedBalance", confirmedBalance)
        .append("confirmedBalanceString", confirmedBalanceString)
        .append("spendableBalance", spendableBalance)
        .append("spendableBalanceString", spendableBalanceString)
        .append("deleted", deleted)
        .append("isCold", isCold)
        .append("freeze", freeze)
        .append("disableTransactionNotifications", disableTransactionNotifications)
        .append("admin", admin)
        .append("approvalsRequired", approvalsRequired)
        .append("pendingApprovals", pendingApprovals)
        .toString();
  }
}
