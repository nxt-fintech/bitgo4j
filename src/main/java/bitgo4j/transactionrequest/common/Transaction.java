package bitgo4j.transactionrequest.common;

import bitgo4j.BitGo4jConstant;
import bitgo4j.transactionrequest.response.SignatureShareResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Transaction {
  private String state;

  private List<UnsignedTransaction> unsignedTx;

  private List<SignatureShareResponse> signatureShares;

  private String txHash;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("state", state)
        .append("unsignedTx", unsignedTx)
        .append("signatureShares", signatureShares)
        .append("txHash", txHash)
        .toString();
  }
}
