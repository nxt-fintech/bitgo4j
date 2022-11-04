package bitgo4j.wallet.common;

import bitgo4j.BitGo4jConstant;
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
public class HalfSigned {
  private Integer contractSequenceId;

  private Integer expireTime;

  private Integer gasLimit;

  private Integer gasPrice;

  private String operationHash;

  private Recipient recipient;

  private String signature;

  private String tokenContractAddress;

  private String walletId;

  private String txBase64;

  private String txHex;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("contractSequenceId", contractSequenceId)
        .append("expireTime", expireTime)
        .append("gasLimit", gasLimit)
        .append("gasPrice", gasPrice)
        .append("operationHash", operationHash)
        .append("recipient", recipient)
        .append("signature", signature)
        .append("tokenContractAddress", tokenContractAddress)
        .append("walletId", walletId)
        .append("txBase64", txBase64)
        .append("txHex", txHex)
        .toString();
  }
}
