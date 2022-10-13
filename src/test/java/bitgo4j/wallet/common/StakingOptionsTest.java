package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StakingOptionsTest {
  @Mock FunctionArgs functionArgs;

  @InjectMocks StakingOptions stakingOptions;

  @Test
  void testToString() {
    String result = stakingOptions.toString();
    Assertions.assertEquals(
        "StakingOptions[amount=<null>,validator=<null>,contractName=<null>,functionName,functionArgs=functionArgs]",
        result);
  }

  @Test
  void testSetAmount() {
    stakingOptions.setAmount(0);
  }

  @Test
  void testSetValidator() {
    stakingOptions.setValidator("validator");
  }

  @Test
  void testSetContractName() {
    stakingOptions.setContractName("contractName");
  }

  @Test
  void testSetFunctionName() {
    stakingOptions.setFunctionName("functionName");
  }

  @Test
  void testSetFunctionArgs() {
    stakingOptions.setFunctionArgs(new FunctionArgs());
  }
}
