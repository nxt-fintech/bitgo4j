package bitgo4j.wallet.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.wallet.common.Admin;
import bitgo4j.wallet.common.BuildDefaults;
import bitgo4j.wallet.common.CoinSpecific;
import bitgo4j.wallet.common.CustomChangeKeySignatures;
import bitgo4j.wallet.common.Freeze;
import bitgo4j.wallet.common.ReceiveAddress;
import bitgo4j.wallet.common.Tokens;
import bitgo4j.wallet.common.User;
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

  private Long approvalsRequired;

  private String balanceString;

  private BuildDefaults buildDefaults;

  private String coin;

  private CoinSpecific coinSpecific;

  //  private Object custodialWallet;

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

  private Integer balance;

  private Integer confirmedBalance;

  private String confirmedBalanceString;

  private Integer spendableBalance;

  private Integer stakedBalance;

  private String stakedBalanceString;

  private Tokens tokens;

  private Tokens unsupportedTokens;

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
        .append("multisigType", multisigType)
        .append("balance", balance)
        .append("confirmedBalance", confirmedBalance)
        .append("confirmedBalanceString", confirmedBalanceString)
        .append("spendableBalance", spendableBalance)
        .append("stakedBalance", stakedBalance)
        .append("stakedBalanceString", stakedBalanceString)
        .append("tokens", tokens)
        .append("unsupportedTokens", unsupportedTokens)
        .toString();
  }
}
