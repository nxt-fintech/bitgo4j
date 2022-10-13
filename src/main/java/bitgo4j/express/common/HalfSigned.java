package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HalfSigned {
  private Integer contractSequenceId;

  private Integer expireTime;

  private Integer gasLimit;

  private Integer gasPrice;

  private String operationHash;

  //  Recipient recipient;

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
        .append("signature", signature)
        .append("tokenContractAddress", tokenContractAddress)
        .append("walletId", walletId)
        .append("txBase64", txBase64)
        .append("txHex", txHex)
        .toString();
  }
}
