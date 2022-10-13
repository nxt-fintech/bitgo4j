package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Eip1559;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAddressRequest {
  private Integer chain;

  private String label;

  private Boolean lowPriority;

  private String gasPrice;

  private Eip1559 eip1559;

  private Integer forwarderVersion;

  private String onToken;

  private String format;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("chain", chain)
        .append("label", label)
        .append("lowPriority", lowPriority)
        .append("gasPrice", gasPrice)
        .append("eip1559", eip1559)
        .append("forwarderVersion", forwarderVersion)
        .append("onToken", onToken)
        .append("format", format)
        .toString();
  }
}
