package bitgo4j.express.request;


import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Eip1559;
import bitgo4j.express.common.Memo;
import bitgo4j.express.common.Recipient;
import bitgo4j.express.common.RefundOptions;
import bitgo4j.express.common.Reservation;
import bitgo4j.express.common.StakingOptions;
import bitgo4j.express.common.Trustline;
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
public class SendToManyRequest {
  List<Recipient> recipients;

  private String otp;

  private String walletPassphrase;

  private String prv;

  private Integer numBlocks;

  private String feeRate;

  private String maxFeeRate;

  private String feeMultiplier;

  private Integer minConfirms;

  private Boolean enforceMinConfirmsForChange;

  private String gasPrice;

  private Eip1559 eip1559;

  private String gasLimit;

  private Integer targetWalletUnspents;

  private String minValue;

  private String maxValue;

  private String sequenceId;

  private String nonce;

  private Boolean noSplitChange;

  private List<String> unspents;

  private String changeAddress;

  private Boolean instant;

  private Memo memo;

  private String comment;

  private String addressType;

  private String startTime;

  private String consolidateId;

  private Integer lastLedgerSequence;

  private Integer ledgerSequenceDelta;

  private List<String> cpfpTxIds;

  private Integer cpfpFeeRate;

  private Integer maxFee;

  private String strategy;

  private Integer validFromBlock;

  private Integer validToBlock;

  private String type;

  private List<Trustline> trustlines;

  private StakingOptions stakingOptions;

  private RefundOptions refundOptions;

  private String messageKey;

  private Reservation reservation;

  private String data;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("otp", otp)
        .append("walletPassphrase", walletPassphrase)
        .append("prv", prv)
        .append("numBlocks", numBlocks)
        .append("feeRate", feeRate)
        .append("maxFeeRate", maxFeeRate)
        .append("feeMultiplier", feeMultiplier)
        .append("minConfirms", minConfirms)
        .append("enforceMinConfirmsForChange", enforceMinConfirmsForChange)
        .append("gasPrice", gasPrice)
        .append("eip1559", eip1559)
        .append("gasLimit", gasLimit)
        .append("targetWalletUnspents", targetWalletUnspents)
        .append("minValue", minValue)
        .append("maxValue", maxValue)
        .append("sequenceId", sequenceId)
        .append("nonce", nonce)
        .append("noSplitChange", noSplitChange)
        .append("unspents", unspents)
        .append("changeAddress", changeAddress)
        .append("instant", instant)
        .append("memo", memo)
        .append("comment", comment)
        .append("addressType", addressType)
        .append("startTime", startTime)
        .append("consolidateId", consolidateId)
        .append("lastLedgerSequence", lastLedgerSequence)
        .append("ledgerSequenceDelta", ledgerSequenceDelta)
        .append("cpfpTxIds", cpfpTxIds)
        .append("cpfpFeeRate", cpfpFeeRate)
        .append("maxFee", maxFee)
        .append("strategy", strategy)
        .append("validFromBlock", validFromBlock)
        .append("validToBlock", validToBlock)
        .append("type", type)
        .append("trustlines", trustlines)
        .append("stakingOptions", stakingOptions)
        .append("refundOptions", refundOptions)
        .append("messageKey", messageKey)
        .append("reservation", reservation)
        .append("data", data)
        .toString();
  }
}
