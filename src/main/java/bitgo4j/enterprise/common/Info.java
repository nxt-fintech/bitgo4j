package bitgo4j.enterprise.common;

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
public class Info {
  private String type;

  private UpdateEnterpriseRequest updateEnterpriseRequest;

  private UpdateApprovalsRequiredRequest updateApprovalsRequiredRequest;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("type", type)
        .append("updateEnterpriseRequest", updateEnterpriseRequest)
        .append("updateApprovalsRequiredRequest", updateApprovalsRequiredRequest)
        .toString();
  }
}