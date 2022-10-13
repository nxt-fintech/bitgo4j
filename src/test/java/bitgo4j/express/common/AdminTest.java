package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminTest {
  @Mock Policy policy;

  @InjectMocks Admin admin;

  @Test
  void testToString() {
    String result = admin.toString();
    String expected = "Admin[policy=policy]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetPolicy() {
    admin.setPolicy(new Policy());
  }
}
