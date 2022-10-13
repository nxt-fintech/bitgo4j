package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Policy {
  private String id;

  private String date;

  private String label;

  private Boolean latest;

  private List<Rule> rules;

  private Integer version;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("date", date)
        .append("label", label)
        .append("latest", latest)
        .append("version", version)
        .toString();
  }
}
