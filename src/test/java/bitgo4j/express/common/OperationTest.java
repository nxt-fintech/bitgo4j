package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OperationTest {
  @Mock Asset asset;

  @InjectMocks Operation operation;


  @Test
  void testToString() {
    String result = operation.toString();
    String expected = "Operation[amount=<null>,asset=asset,destination=<null>,type=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAmount() {
    operation.setAmount("amount");
  }

  @Test
  void testSetAsset() {
    operation.setAsset(new Asset());
  }

  @Test
  void testSetDestination() {
    operation.setDestination("destination");
  }

  @Test
  void testSetType() {
    operation.setType("type");
  }
}
