package bitgo4j.wallet.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
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
public class BalanceReserveDataResponse {
  private String baseFee;

  private String baseReserve;

  private String reserve;

  private String minimumFunding;

  private Long height;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("baseFee", baseFee)
        .append("baseReserve", baseReserve)
        .append("reserve", reserve)
        .append("minimumFunding", minimumFunding)
        .append("height", height)
        .toString();
  }
}
