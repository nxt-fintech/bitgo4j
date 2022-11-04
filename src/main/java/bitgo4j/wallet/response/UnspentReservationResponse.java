package bitgo4j.wallet.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.wallet.common.UnspentReservation;
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
public class UnspentReservationResponse {
  private List<UnspentReservation> unspents;

  private String nextBatchPrevId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("unspents", unspents)
        .append("nextBatchPrevId", nextBatchPrevId)
        .toString();
  }
}
