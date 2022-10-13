package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LegalIdentifiersTest {
  LegalIdentifiers legalIdentifiers = new LegalIdentifiers("legalPersonName");

  @Test
  void testToString() {
    String result = legalIdentifiers.toString();
    Assertions.assertEquals("LegalIdentifiers[legalPersonName=legalPersonName]", result);
  }

  @Test
  void testSetLegalPersonName() {
    legalIdentifiers.setLegalPersonName("legalPersonName");
  }
}
