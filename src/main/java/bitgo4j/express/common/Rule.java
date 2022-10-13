package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule {
  private String id;

  private String lockDate;

  private String mutabilityConstraint;

  private String coin;

  private String type;

  private Condition condition;

  private Action action;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("lockDate", lockDate)
        .append("mutabilityConstraint", mutabilityConstraint)
        .append("coin", coin)
        .append("type", type)
        .append("condition", condition)
        .append("action", action)
        .toString();
  }
}
