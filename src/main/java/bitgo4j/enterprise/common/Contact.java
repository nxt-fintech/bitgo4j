package bitgo4j.enterprise.common;

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
public class Contact {
  private String name;

  private String street;

  private String street2;

  private String suite;

  private String city;

  private String state;

  private String postalCode;

  private String country;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("name", name)
        .append("street", street)
        .append("street2", street2)
        .append("suite", suite)
        .append("city", city)
        .append("state", state)
        .append("postalCode", postalCode)
        .append("country", country)
        .toString();
  }
}
