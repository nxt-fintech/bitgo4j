package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEnterpriseRequest {
  private String type;

  private String action;

  private String permission;

  private String userId;

  private String email;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("type", type)
        .append("action", action)
        .append("permission", permission)
        .append("userId", userId)
        .append("email", email)
        .toString();
  }
}