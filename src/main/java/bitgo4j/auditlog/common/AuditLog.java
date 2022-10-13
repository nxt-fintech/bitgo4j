package bitgo4j.auditlog.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
public class AuditLog {
  private String coin;

  //  TODO: check
  //  private Object data;

  private String date;

  private String enterpriseId;

  private String id;

  @JsonInclude(Include.NON_EMPTY)
  private String ip;

  private String target;

  // TODO: Enum
  private String type;

  private String user;

  private String walletId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("coin", coin)
        //        .append("data", data)
        .append("date", date)
        .append("enterpriseId", enterpriseId)
        .append("id", id)
        .append("ip", ip)
        .append("target", target)
        .append("type", type)
        .append("user", user)
        .append("walletId", walletId)
        .toString();
  }
}
