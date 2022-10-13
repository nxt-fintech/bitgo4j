package bitgo4j.express.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import bitgo4j.express.common.Eip1559;
import bitgo4j.express.common.Memo;
import bitgo4j.express.common.Reservation;
import bitgo4j.express.common.StakingOptions;
import bitgo4j.express.common.Trustline;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Getter
@Setter
public class SendTransactionRequest {
  private String address;

  private Integer amount;

  private String walletPassphrase;

  private String prv;

  private Integer numBlocks;

  private Integer feeRate;

  private Integer maxFeeRate;

  private Integer minConfirms;

  private Boolean enforceMinConfirmsForChange;

  private Integer gasPrice;

  private Eip1559 eip1559;

  private Integer gasLimit;

  private Integer targetWalletUnspents;

  private Integer minValue;

  private Integer maxValue;

  private String sequenceId;

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

  private Integer idfVersion;

  private String idfSignedTimestamp;

  private String idfUserId;

  private String strategy;

  private Integer validFromBlock;

  private Integer validToBlock;

  private String type;

  private List<Trustline> trustlines;

  private StakingOptions stakingOptions;

  private String messageKey;

  private Reservation reservation;

  private String data;

  private Boolean hop;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("amount", amount)
        .append("walletPassphrase", walletPassphrase)
        .append("prv", prv)
        .append("numBlocks", numBlocks)
        .append("feeRate", feeRate)
        .append("maxFeeRate", maxFeeRate)
        .append("minConfirms", minConfirms)
        .append("enforceMinConfirmsForChange", enforceMinConfirmsForChange)
        .append("gasPrice", gasPrice)
        .append("eip1559", eip1559)
        .append("gasLimit", gasLimit)
        .append("targetWalletUnspents", targetWalletUnspents)
        .append("minValue", minValue)
        .append("maxValue", maxValue)
        .append("sequenceId", sequenceId)
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
        .append("idfVersion", idfVersion)
        .append("idfSignedTimestamp", idfSignedTimestamp)
        .append("idfUserId", idfUserId)
        .append("strategy", strategy)
        .append("validFromBlock", validFromBlock)
        .append("validToBlock", validToBlock)
        .append("type", type)
        .append("trustlines", trustlines)
        .append("stakingOptions", stakingOptions)
        .append("messageKey", messageKey)
        .append("reservation", reservation)
        .append("data", data)
        .append("hop", hop)
        .toString();
  }
}
