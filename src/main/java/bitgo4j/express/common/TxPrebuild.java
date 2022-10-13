package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TxPrebuild {
  private String wallet;

  private String txHex;

  private String txBase64;

  private TxInfoRequest txInfo;

  private FeeInfo feeInfo;

  private Boolean isLastSignature;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("wallet", wallet)
        .append("txHex", txHex)
        .append("txBase64", txBase64)
        .append("txInfo", txInfo)
        .append("feeInfo", feeInfo)
        .append("isLastSignature", isLastSignature)
        .toString();
  }
}
