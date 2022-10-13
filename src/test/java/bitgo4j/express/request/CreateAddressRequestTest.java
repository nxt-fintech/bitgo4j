package bitgo4j.express.request;

import bitgo4j.express.common.Eip1559;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateAddressRequestTest {
  @Mock Eip1559 eip1559;

  @InjectMocks CreateAddressRequest createAddressRequest;

  @Test
  void testToString() {
    String result = createAddressRequest.toString();
    String expected =
        "CreateAddressRequest[chain=<null>,label=<null>,lowPriority=<null>,gasPrice=<null>,eip1559=eip1559,forwarderVersion=<null>,onToken=<null>,format=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetChain() {
    createAddressRequest.setChain(0);
  }

  @Test
  void testSetLabel() {
    createAddressRequest.setLabel("label");
  }

  @Test
  void testSetLowPriority() {
    createAddressRequest.setLowPriority(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    createAddressRequest.setGasPrice("gasPrice");
  }

  @Test
  void testSetEip1559() {
    createAddressRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }

  @Test
  void testSetForwarderVersion() {
    createAddressRequest.setForwarderVersion(0);
  }

  @Test
  void testSetOnToken() {
    createAddressRequest.setOnToken("onToken");
  }

  @Test
  void testSetFormat() {
    createAddressRequest.setFormat("format");
  }
}
