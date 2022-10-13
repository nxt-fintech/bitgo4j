package bitgo4j.express.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponse {
  private String accessToken;

  private Integer expiresAt;

  private List<String> scope;

  //  private User user;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("accessToken", accessToken)
        .append("expiresAt", expiresAt)
        .append("scope", scope)
        //        .append("user", user)
        .toString();
  }
}
