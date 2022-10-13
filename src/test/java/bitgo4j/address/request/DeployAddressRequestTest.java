package bitgo4j.address.request;

import bitgo4j.wallet.common.Eip1559;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeployAddressRequestTest {
  @Mock Eip1559 eip1559;
  @InjectMocks DeployAddressRequest deployAddressRequest;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = deployAddressRequest.toString();
    Assertions.assertEquals(
        "DeployAddressRequest[forceDeploy=<null>,gasPrice=<null>,eip1559=eip1559]", result);
  }

  @Test
  void testSetForceDeploy() {
    deployAddressRequest.setForceDeploy(Boolean.TRUE);
  }

  @Test
  void testSetGasPrice() {
    deployAddressRequest.setGasPrice("gasPrice");
  }

  @Test
  void testSetEip1559() {
    deployAddressRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
  }
}