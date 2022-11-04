package bitgo4j.address.response;

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
public class ListAddressResponse {
  private String coin;

  private Long totalAddressCount;

  private Long pendingAddressCount;

  private List<AddressResponse> addresses;

  private String nextBatchPrevId;

  private Long count;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("coin", coin)
        .append("totalAddressCount", totalAddressCount)
        .append("pendingAddressCount", pendingAddressCount)
        .append("addresses", addresses)
        .append("nextBatchPrevId", nextBatchPrevId)
        .append("count", count)
        .toString();
  }
}
