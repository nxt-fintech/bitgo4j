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
class UpdateEnterpriseRequestTest {
  @Mock List<String> permissions;

  @InjectMocks UpdateEnterpriseRequest updateEnterpriseRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = updateEnterpriseRequest.toString();
    Assertions.assertEquals(
        "UpdateEnterpriseRequest[action=<null>,permissions=permissions,userId=<null>,email=<null>]",
        result);
  }

  @Test
  void testSetAction() {
    updateEnterpriseRequest.setAction("action");
  }

  @Test
  void testSetPermissions() {
    updateEnterpriseRequest.setPermissions(List.of("String"));
  }

  @Test
  void testSetUserId() {
    updateEnterpriseRequest.setUserId("userId");
  }

  @Test
  void testSetEmail() {
    updateEnterpriseRequest.setEmail("email");
  }
}
