package bitgo4j.auditlog.response;

import bitgo4j.BitGo4jConstant;
import bitgo4j.auditlog.common.AuditLog;
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
public class ListAuditLogResponse {
  List<AuditLog> logs;

  String nextBatchPrevId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("logs", logs)
        .append("nextBatchPrevId", nextBatchPrevId)
        .toString();
  }
}
