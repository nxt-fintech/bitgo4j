package bitgo4j.user.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
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
public class Session {
  private String created;

  private String expires;

  private String id;

  private String ip;

  private List<String> ipRestrict;

  private String origin;

  private List<String> scope;

  private Unlock unlock;

  private String user;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("created", created)
        .append("expires", expires)
        .append("id", id)
        .append("ip", ip)
        .append("ipRestrict", ipRestrict)
        .append("origin", origin)
        .append("scope", scope)
        .append("unlock", unlock)
        .append("user", user)
        .toString();
  }
}
