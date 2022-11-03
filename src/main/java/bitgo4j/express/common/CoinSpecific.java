package bitgo4j.express.common;

import bitgo4j.BitGo4jConstant;
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
public class CoinSpecific {
  private List<String> creationFailure;

  private Boolean pendingChainInitialization;

  private String rootAddress;

  private String stellarUsername;

  private String homeDomain;

  private String stellarAddress;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("creationFailure", creationFailure)
        .append("pendingChainInitialization", pendingChainInitialization)
        .append("rootAddress", rootAddress)
        .append("stellarUsername", stellarUsername)
        .append("homeDomain", homeDomain)
        .append("stellarAddress", stellarAddress)
        .toString();
  }
}
