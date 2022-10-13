package bitgo4j.enterprise.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.enterprise.common.AdminUser;
import bitgo4j.enterprise.common.NonAdminUser;
import bitgo4j.enterprise.common.WalletUser;
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
public class ListEnterpriseUsersResponse {
  private List<AdminUser> adminUsers;

  private List<NonAdminUser> nonAdminUsers;

  private List<WalletUser> walletUsers;

  private String keyState;

  private Boolean incomplete;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("adminUsers", adminUsers)
        .append("nonAdminUsers", nonAdminUsers)
        .append("walletUsers", walletUsers)
        .append("keyState", keyState)
        .append("incomplete", incomplete)
        .toString();
  }
}
