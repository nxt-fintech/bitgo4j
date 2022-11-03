package bitgo4j.express.common;

import bitgo4j.BitGo4jConstant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxInfoRequest {
  private List<String> changeAddresses;

  private Integer nOutputs;

  private Integer nP2SHInputs;

  private List<Unspent> unspents;

  private WalletAddressDetails walletAddressDetails;

  private Integer fee;

  private List<Operation> operations;

  private String sequence;

  private String source;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("changeAddresses", changeAddresses)
        .append("nOutputs", nOutputs)
        .append("nP2SHInputs", nP2SHInputs)
        .append("unspents", unspents)
        .append("walletAddressDetails", walletAddressDetails)
        .append("fee", fee)
        .append("operations", operations)
        .append("sequence", sequence)
        .append("source", source)
        .toString();
  }
}
