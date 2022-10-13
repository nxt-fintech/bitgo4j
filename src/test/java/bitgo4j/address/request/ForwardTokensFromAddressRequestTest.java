package bitgo4j.address.request;

import bitgo4j.address.common.Eip1559;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ForwardTokensFromAddressRequestTest {
  @Mock Eip1559 eip1559;
  @InjectMocks ForwardTokensFromAddressRequest forwardTokensFromAddressRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = forwardTokensFromAddressRequest.toString();
    Assertions.assertEquals(
        "ForwardTokensFromAddressRequest[tokenName=<null>,forceFlush=<null>,gasPrice=<null>,eip1559=eip1559]",
        result);
  }

  @Test
  void testSetTokenName() {
    forwardTokensFromAddressRequest.setTokenName("tokenName");
  }

  @Test
  void testSetForceFlush() {
    forwardTokensFromAddressRequest.setForceFlush(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    forwardTokensFromAddressRequest.setGasPrice("gasPrice");
  }

  @Test
  void testSetEip1559() {
    forwardTokensFromAddressRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }
}