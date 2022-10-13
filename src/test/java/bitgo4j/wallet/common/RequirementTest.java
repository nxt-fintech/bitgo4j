package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RequirementTest {
  @Mock List<String> trustedKeys;

  @InjectMocks Requirement requirement;

  @Test
  void testToString() {
    String result = requirement.toString();
    String expected = "Requirement[m=<null>,trustedKeys=trustedKeys]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetM() {
    requirement.setM(0);
  }

  @Test
  void testSetTrustedKeys() {
    requirement.setTrustedKeys(List.of("String"));
  }
}
