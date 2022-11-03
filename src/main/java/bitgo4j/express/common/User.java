package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import bitgo4j.user.common.Email;
import bitgo4j.user.common.Name;
import bitgo4j.user.common.Phone;
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
public class User {
  private String id;

  private Boolean isActive;

  private Name name;

  private String username;

  private Email email;

  private Phone phone;

  private String country;

  private String user;

  private List<String> permissions;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("isActive", isActive)
        .append("name", name)
        .append("username", username)
        .append("email", email)
        .append("phone", phone)
        .append("country", country)
        .append("user", user)
        .append("permissions", permissions)
        .toString();
  }
}
