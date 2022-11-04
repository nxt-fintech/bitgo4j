package bitgo4j.express.common;

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
public class TokenData {
  private String tokenType;

  private String tokenQuantity;

  private String tokenContractAddress;

  private String tokenName;

  private String tokenId;

  private Integer decimalPlaces;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("tokenType", tokenType)
        .append("tokenQuantity", tokenQuantity)
        .append("tokenContractAddress", tokenContractAddress)
        .append("tokenName", tokenName)
        .append("tokenId", tokenId)
        .append("decimalPlaces", decimalPlaces)
        .toString();
  }
}
