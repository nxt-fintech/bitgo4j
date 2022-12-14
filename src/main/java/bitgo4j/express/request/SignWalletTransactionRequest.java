package bitgo4j.express.request;

import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Keychain;
import bitgo4j.express.common.Recipient;
import bitgo4j.express.common.TxPrebuild;
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
public class SignWalletTransactionRequest {
  private Keychain keychain;

  private String prv;

  private TxPrebuild txPrebuild;

  private String coldDerivationSeed;

  private String walletPassphrase;

  private List<Recipient> recipients;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("keychain", keychain)
        .append("prv", prv)
        .append("txPrebuild", txPrebuild)
        .append("coldDerivationSeed", coldDerivationSeed)
        .append("walletPassphrase", walletPassphrase)
        .append("recipients", recipients)
        .toString();
  }
}
