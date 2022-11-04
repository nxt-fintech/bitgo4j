package bitgo4j.policy.common;

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
public class Condition {
  private String amountString;

  private Integer timeWindow;

  private List<String> groupTags;

  private List<String> excludeTags;

  private Boolean startDateReset;

  // TODO: add has different definition
  private String add;

  private MetaData metaData;

  // TODO: remove has different definition
  private String remove;

  private String url;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("amountString", amountString)
        .append("timeWindow", timeWindow)
        .append("groupTags", groupTags)
        .append("excludeTags", excludeTags)
        .append("startDateReset", startDateReset)
        .append("add", add)
        .append("metaData", metaData)
        .append("remove", remove)
        .append("url", url)
        .toString();
  }
}
