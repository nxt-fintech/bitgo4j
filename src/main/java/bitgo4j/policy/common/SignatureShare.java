package bitgo4j.policy.common;

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
public class SignatureShare {
  private String from;

  private String to;

  private String share;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("from", from)
        .append("to", to)
        .append("share", share)
        .toString();
  }
}
