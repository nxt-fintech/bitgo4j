package bitgo4j.wallet.request;

import bitgo4j.BitGo4jConstant;
import bitgo4j.wallet.common.BuildDefaults;
import bitgo4j.wallet.common.CustomChangeKeySignatures;
import bitgo4j.wallet.common.UpdateCoinSpecific;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class UpdateWalletRequest {
  private Integer approvalsRequired;

  private BuildDefaults buildDefaults;

  private Boolean disableTransactionNotifications;

  private String label;

  private CustomChangeKeySignatures customChangeKeySignatures;

  private UpdateCoinSpecific coinSpecific;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("approvalsRequired", approvalsRequired)
        .append("buildDefaults", buildDefaults)
        .append("disableTransactionNotifications", disableTransactionNotifications)
        .append("label", label)
        .append("customChangeKeySignatures", customChangeKeySignatures)
        .append("coinSpecific", coinSpecific)
        .toString();
  }
}
