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
public class Condition {
  private String amountString;

  private Integer timeWindow;

  private List<String> excludeTags;

  private List<String> groupTags;

  private List<String> addresses;

  private List<Entry> entries;

  private String url;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("amountString", amountString)
        .append("timeWindow", timeWindow)
        .append("excludeTags", excludeTags)
        .append("groupTags", groupTags)
        .append("addresses", addresses)
        .append("entries", entries)
        .append("url", url)
        .toString();
  }
}
