package bitgo4j.enterprise.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.enterprise.common.AdditionalEnterpriseInfo;
import bitgo4j.enterprise.common.Admin;
import bitgo4j.enterprise.common.Freeze;
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
public class EnterpriseResponse {
  private AdditionalEnterpriseInfo additionalEnterpriseInfo;

  private Admin admin;

  private Long approvalsRequired;

  private String bitgoEthKey;

  private String bitgoOrg;

  private Boolean canAccessBorrowing;

  private Boolean canAccessLending;

  private Boolean canAccessSettlement;

  private Boolean canAccessTrading;

  private Boolean canCreateColdWallet;

  private Boolean canCreateCustodialWallets;

  private Boolean canCreateHotWallet;

  private Boolean canCreateOffchainWallet;

  private String emergencyPhone;

  private String ethFeeAddress;

  private Freeze freeze;

  private String id;

  private String kycState;

  private Long latestSAVersionSigned;

  // TODO: inconsistent of type between EnterpriseResponse and ListEnterpriseResponse
  //  private String licenses;

  private Long mutablePolicyWindow;

  private String name;

  private String pricingPlan;

  private String primaryContact;

  private Boolean usersViewAllWallets;

  private Boolean videoIdWaived;

  // TODO: inconsistent of type between EnterpriseResponse and ListEnterpriseResponse
  //  private List<Tag> tags;

  private List<String> wallets;

  // 202
  private String bitcoinAddress;

  private String enterprise;

  private String walletId;

  private String creator;

  private String createDate;

  private Info info;

  private String state;

  private List<String> walletUserIds;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("admin", admin)
        .append("approvalsRequired", approvalsRequired)
        .append("bitgoEthKey", bitgoEthKey)
        .append("bitgoOrg", bitgoOrg)
        .append("canAccessBorrowing", canAccessBorrowing)
        .append("canAccessLending", canAccessLending)
        .append("canAccessSettlement", canAccessSettlement)
        .append("canAccessTrading", canAccessTrading)
        .append("canCreateColdWallet", canCreateColdWallet)
        .append("canCreateCustodialWallets", canCreateCustodialWallets)
        .append("canCreateHotWallet", canCreateHotWallet)
        .append("canCreateOffchainWallet", canCreateOffchainWallet)
        .append("emergencyPhone", emergencyPhone)
        .append("ethFeeAddress", ethFeeAddress)
        .append("freeze", freeze)
        .append("id", id)
        .append("kycState", kycState)
        .append("latestSAVersionSigned", latestSAVersionSigned)
        //        .append("licenses", licenses)
        .append("mutablePolicyWindow", mutablePolicyWindow)
        .append("name", name)
        .append("pricingPlan", pricingPlan)
        .append("primaryContact", primaryContact)
        .append("usersViewAllWallets", usersViewAllWallets)
        .append("videoIdWaived", videoIdWaived)
        //        .append("tags", tags)
        .append("wallets", wallets)
        // 202
        .append("bitcoinAddress", bitcoinAddress)
        .append("enterprise", enterprise)
        .append("walletId", walletId)
        .append("creator", creator)
        .append("createDate", createDate)
        .append("info", info)
        .append("state", state)
        .append("walletUserIds", walletUserIds)
        .toString();
  }
}
