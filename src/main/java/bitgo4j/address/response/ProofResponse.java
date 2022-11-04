package bitgo4j.address.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.address.common.AuxProofData;
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
public class ProofResponse {
  private String address;

  private String chain;

  private Boolean iou;

  private String signature;

  private String prefix;

  private String proofType;

  private List<AuxProofData> auxProofData;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("chain", chain)
        .append("iou", iou)
        .append("signature", signature)
        .append("prefix", prefix)
        .append("proofType", proofType)
        .append("auxProofData", auxProofData)
        .toString();
  }
}
