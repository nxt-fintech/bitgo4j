package bitgo4j.address.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdateAddressRequestTest {
  UpdateAddressRequest updateAddressRequest = new UpdateAddressRequest("label");

  @Test
  void testToString() {
    String result = updateAddressRequest.toString();
    String expected = "UpdateAddressRequest[label=label]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetLabel() {
    updateAddressRequest.setLabel("label");
  }
}
