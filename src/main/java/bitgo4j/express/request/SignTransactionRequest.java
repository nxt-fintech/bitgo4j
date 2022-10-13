package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.TxPrebuild;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class SignTransactionRequest {
  private String prv;

  private TxPrebuild txPrebuild;

  private Boolean isLastSignature;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("prv", prv)
        .append("txPrebuild", txPrebuild)
        .append("isLastSignature", isLastSignature)
        .toString();
  }
}