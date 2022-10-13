package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NewPolicyTest {
  @InjectMocks NewPolicy newPolicy;

  @Test
  void testToString() {
    String result = newPolicy.toString();
    String expected =
        "NewPolicy[version=<null>,keyId=<null>,signingRequirement=<null>,updateRequirement=<null>,lastUpdated=<null>]";
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
