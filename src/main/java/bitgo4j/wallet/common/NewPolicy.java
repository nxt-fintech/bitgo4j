package bitgo4j.wallet.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
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
public class NewPolicy {
  private Integer version;

  private String keyId;

  private Requirement signingRequirement;

  private Requirement updateRequirement;

  private String lastUpdated;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("version", version)
        .append("keyId", keyId)
        .append("signingRequirement", signingRequirement)
        .append("updateRequirement", updateRequirement)
        .append("lastUpdated", lastUpdated)
        .toString();
  }
}
