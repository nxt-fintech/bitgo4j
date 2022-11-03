package bitgo4j.express.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.address.response.AddressResponse;
import bitgo4j.express.common.Admin;
import bitgo4j.express.common.BuildDefaults;
import bitgo4j.express.common.CoinSpecific;
import bitgo4j.express.common.CustomChangeKeySignatures;
import bitgo4j.express.common.Freeze;
import bitgo4j.express.common.User;
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
public class WalletResponse {
  private Admin admin;

  private Boolean allowBackupKeySigning;

  private Integer approvalsRequired;

  private String balanceString;

  private BuildDefaults buildDefaults;

  private String coin;

  private CoinSpecific coinSpecific;

  // FIXME:
  // CustodialWallet custodialWallet;

  private String custodialWalletId;

  private Boolean deleted;

  private Boolean disableTransactionNotifications;

  private String enterprise;

  private Freeze freeze;

  private String id;

  private Boolean isCold;

  private List<String> keys;

  private String label;

  private Integer m;

  private Integer n;

  private String nodeId;

  // TODO: remove the dependency on other module
  private AddressResponse receiveAddress;

  private Boolean recoverable;

  private List<String> tags;

  private String spendableBalanceString;

  private String startDate;

  private String type;

  private List<User> users;

  private CustomChangeKeySignatures customChangeKeySignatures;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
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
        .append("recoverable", recoverable)
        .append("tags", tags)
        .append("spendableBalanceString", spendableBalanceString)
        .append("startDate", startDate)
        .append("type", type)
        .append("users", users)
        .append("customChangeKeySignatures", customChangeKeySignatures)
        .toString();
  }
}
