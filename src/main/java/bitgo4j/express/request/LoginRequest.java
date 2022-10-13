package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Getter
@Setter
public class LoginRequest {
  private String email;

  private Boolean extensible;

  private String otp;

  private String password;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("email", email)
        .append("extensible", extensible)
        .append("otp", otp)
        .append("password", password)
        .toString();
  }
}
