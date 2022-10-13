package bitgo4j.express.response;

import bitgo4j.express.common.HalfSigned;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecoverETHTokenResponseTest {
  @Mock HalfSigned halfSigned;

  @InjectMocks RecoverETHTokenResponse recoverETHTokenResponse;

  @Test
  void testToString() {
    String result = recoverETHTokenResponse.toString();
    String expected = "RecoverETHTokenResponse[halfSigned=halfSigned]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetHalfSigned() {
    recoverETHTokenResponse.setHalfSigned(new HalfSigned());
  }
}
