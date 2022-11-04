package bitgo4j.transactionrequest.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.transactionrequest.common.Intent;
import bitgo4j.transactionrequest.common.Transaction;
import bitgo4j.transactionrequest.common.UnsignedTransaction;
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
public class TransactionRequestResponse {
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

  private List<SignatureShareResponse> signatureShares;

  private List<Transaction> txs;

  // 201
  private List<String> txHashes;

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
        .append("txs", txs)
        .append("txHashes", txHashes)
        .toString();
  }
}
