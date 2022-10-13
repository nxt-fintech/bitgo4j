package bitgo4j.auditlog.response;

import bitgo4j.auditlog.common.AuditLog;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListAuditLogsResponseTest {
  @Mock List<AuditLog> logs;

  @InjectMocks ListAuditLogResponse listAuditLogResponse;

  @Test
  void testToString() {
    String result = listAuditLogResponse.toString();
    String expected = "ListAuditLogResponse[logs=logs,nextBatchPrevId=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetLogs() {
    listAuditLogResponse.setLogs(List.of(new AuditLog()));
  }

  @Test
  void testSetNextBatchPrevId() {
    listAuditLogResponse.setNextBatchPrevId("nextBatchPrevId");
  }
}
