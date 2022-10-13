package bitgo4j.express.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import bitgo4j.transfer.response.TransferResponse;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResponse {
  private TransferResponse transfer; // TODO: remove the dependency on other module

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
