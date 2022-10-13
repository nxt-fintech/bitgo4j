package bitgo4j.enterprise.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.enterprise.common.AdditionalEnterpriseInfo;
import bitgo4j.enterprise.common.LegalIdentifiers;
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
public class UpdateEnterpriseRequest {
  private LegalIdentifiers legalIdentifiers;

  private AdditionalEnterpriseInfo additionalEnterpriseInfo;

  private Long approvalsRequired;

  private Boolean usersViewAllWallets;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("legalIdentifiers", legalIdentifiers)
        .append("additionalEnterpriseInfo", additionalEnterpriseInfo)
        .append("approvalsRequired", approvalsRequired)
        .append("usersViewAllWallets", usersViewAllWallets)
        .toString();
  }
}