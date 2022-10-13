package bitgo4j.user.response;

import bitgo4j.user.common.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SessionResponseTest {
  @Mock Session session;

  @InjectMocks SessionResponse sessionResponse;
  
  @Test
  void testToString() {
    String result = sessionResponse.toString();
    String expected = "SessionResponse[session=session]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetSession() {
    sessionResponse.setSession(new Session());
  }
}