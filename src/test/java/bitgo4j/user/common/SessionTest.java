package bitgo4j.user.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SessionTest {
  @InjectMocks Session session;

  @Test
  void testToString() {
    String result = session.toString();
    String expected =
        "Session[created=<null>,expires=<null>,id=<null>,ip=<null>,ipRestrict=<null>,origin=<null>,scope=<null>,unlock=<null>,user=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCreated() {
    session.setCreated("created");
  }

  @Test
  void testSetExpires() {
    session.setExpires("expires");
  }

  @Test
  void testSetId() {
    session.setId("id");
  }

  @Test
  void testSetIp() {
    session.setIp("ip");
  }

  @Test
  void testSetIpRestrict() {
    session.setIpRestrict(List.of("String"));
  }

  @Test
  void testSetOrigin() {
    session.setOrigin("origin");
  }

  @Test
  void testSetScope() {
    session.setScope(List.of("String"));
  }

  @Test
  void testSetUnlock() {
    session.setUnlock(new Unlock());
  }

  @Test
  void testSetUser() {
    session.setUser("user");
  }
}
