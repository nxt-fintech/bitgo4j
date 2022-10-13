package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Phone {
  private String phone;

  private Boolean verified;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("phone", phone)
        .append("verified", verified)
        .toString();
  }
}
