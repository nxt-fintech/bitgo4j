package bitgo4j.wallet.common;

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
public class TxRequest {
  private String txRequestId;

  private Integer version;

  private Boolean latest;

  private String walletId;

  private String walletType;

  private String enterpriseId;

  private String state;

  private String date;

  private String userId;

  private Intent intent;

  private List<Intent> intents;

  private String pendingApprovalId;

  private List<UnsignedTransaction> unsignedTxs;

  private List<SignatureShare> signatureShares;

  private List<String> txHashs;

  private List<Transaction> transactions;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("txRequestId", txRequestId)
        .append("version", version)
        .append("latest", latest)
        .append("walletId", walletId)
        .append("walletType", walletType)
        .append("enterpriseId", enterpriseId)
        .append("state", state)
        .append("date", date)
        .append("userId", userId)
        .append("intent", intent)
        .append("intents", intents)
        .append("pendingApprovalId", pendingApprovalId)
        .append("unsignedTxs", unsignedTxs)
        .append("signatureShares", signatureShares)
        .append("txHashs", txHashs)
        .toString();
  }
}
