package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
  Contact contact =
      new Contact("name", "street", "street2", "suite", "city", "state", "postalCode", "country");

  @Test
  void testToString() {
    String result = contact.toString();
    Assertions.assertEquals(
        "Contact[name=name,street=street,street2=street2,suite=suite,city=city,state=state,postalCode=postalCode,country=country]",
        result);
  }

  @Test
  void testSetName() {
    contact.setName("name");
  }

  @Test
  void testSetStreet() {
    contact.setStreet("street");
  }

  @Test
  void testSetStreet2() {
    contact.setStreet2("street2");
  }

  @Test
  void testSetSuite() {
    contact.setSuite("suite");
  }

  @Test
  void testSetCity() {
    contact.setCity("city");
  }

  @Test
  void testSetState() {
    contact.setState("state");
  }

  @Test
  void testSetPostalCode() {
    contact.setPostalCode("postalCode");
  }

  @Test
  void testSetCountry() {
    contact.setCountry("country");
  }
}
