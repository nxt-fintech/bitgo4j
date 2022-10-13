package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {
  private Action action;

  private String coin;

  private Condition condition;

  private String id;

  private String type;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("action", action)
        .append("coin", coin)
        .append("condition", condition)
        .append("id", id)
        .append("type", type)
        .toString();
  }
}
