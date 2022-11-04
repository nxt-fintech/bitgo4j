package bitgo4j.express.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Transfer;
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
public class TransactionResponse {
  private Transfer transfer;

  private String txid;

  private String tx;

  private String status;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        //        .append("transfer", transfer)
        .append("txid", txid)
        .append("tx", tx)
        .append("status", status)
        .toString();
  }
}
