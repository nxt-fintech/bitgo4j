package bitgo4j.enterprise.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InfoTest {
  @Mock UpdateEnterpriseRequest updateEnterpriseRequest;

  @Mock UpdateApprovalsRequiredRequest updateApprovalsRequiredRequest;

  @InjectMocks Info info;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = info.toString();
    Assertions.assertEquals(
        "Info[type=<null>,updateEnterpriseRequest=updateEnterpriseRequest,updateApprovalsRequiredRequest=updateApprovalsRequiredRequest]",
        result);
  }

  @Test
  void testSetType() {
    info.setType("type");
  }

  @Test
  void testSetUpdateEnterpriseRequest() {
    info.setUpdateEnterpriseRequest(
        new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"));
  }

  @Test
  void testSetUpdateApprovalsRequiredRequest() {
    info.setUpdateApprovalsRequiredRequest(new UpdateApprovalsRequiredRequest(0L));
  }
}
