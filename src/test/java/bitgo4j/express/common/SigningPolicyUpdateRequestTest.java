package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SigningPolicyUpdateRequestTest {
  @Mock NewPolicy newPolicy;

  @Mock List<String> gatheredSignatures;

  @InjectMocks SigningPolicyUpdateRequest signingPolicyUpdateRequest;

  @Test
  void testToString() {
    String result = signingPolicyUpdateRequest.toString();
    String expected =
        "SigningPolicyUpdateRequest[newPolicy=newPolicy,gatheredSignatures=gatheredSignatures]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetNewPolicy() {
    signingPolicyUpdateRequest.setNewPolicy(new NewPolicy());
  }

  @Test
  void testSetGatheredSignatures() {
    signingPolicyUpdateRequest.setGatheredSignatures(List.of("String"));
  }
}
