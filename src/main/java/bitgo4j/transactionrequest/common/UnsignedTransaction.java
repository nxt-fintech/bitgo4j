package bitgo4j.transactionrequest.common;

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
public class UnsignedTransaction {
  private String serializedTxHex;

  private String signableHex;

  private String derivationPath;

  private FeeInfo feeInfo;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("serializedTxHex", serializedTxHex)
        .append("signableHex", signableHex)
        .append("derivationPath", derivationPath)
        .append("feeInfo", feeInfo)
        .toString();
  }
}
