package bitgo4j.transfer.request;

import bitgo4j.BitGo4jConstant;
import bitgo4j.transfer.common.Eip1559;
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
public class ChangeFeeRequest {
  private String txid;

  private Integer fee;

  private Eip1559 eip1559;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("txid", txid)
        .append("fee", fee)
        .append("eip1559", eip1559)
        .toString();
  }
}
