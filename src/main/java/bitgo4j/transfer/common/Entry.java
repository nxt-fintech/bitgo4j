package bitgo4j.transfer.common;

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
public class Entry {
  private String address;

  private String wallet;

  private Long value;

  private String valueString;

  private Boolean isChange;

  private Boolean isPayGo;

  private String token;

  private String label;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("wallet", wallet)
        .append("value", value)
        .append("valueString", valueString)
        .append("isChange", isChange)
        .append("isPayGo", isPayGo)
        .append("token", token)
        .append("label", label)
        .toString();
  }
}
