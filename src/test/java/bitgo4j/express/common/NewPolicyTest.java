package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NewPolicyTest {
  @Mock Requirement signingRequirement;

  @Mock Requirement updateRequirement;

  @InjectMocks NewPolicy newPolicy;

  @Test
  void testToString() {
    String result = newPolicy.toString();
    String expected =
        "NewPolicy[version=<null>,keyId=<null>,signingRequirement=signingRequirement,updateRequirement=updateRequirement,lastUpdated=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetVersion() {
    newPolicy.setVersion(0);
  }

  @Test
  void testSetKeyId() {
    newPolicy.setKeyId("keyId");
  }

  @Test
  void testSetSigningRequirement() {
    newPolicy.setSigningRequirement(new Requirement());
  }

  @Test
  void testSetUpdateRequirement() {
    newPolicy.setUpdateRequirement(new Requirement());
  }

  @Test
  void testSetLastUpdated() {
    newPolicy.setLastUpdated("lastUpdated");
  }
}
