package bitgo4j.wallet.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StakingOptionsTest {
    @InjectMocks
    StakingOptions stakingOptions;

    @Test
    void testToString(){
        String result = stakingOptions.toString();
        Assertions.assertEquals("StakingOptions[amount=<null>,validator=<null>,contractName=<null>,functionName,functionArgs=<null>]", result);
    }

    @Test
    void testSetAmount(){
        stakingOptions.setAmount(0);
    }

    @Test
    void testSetValidator(){
        stakingOptions.setValidator("validator");
    }

    @Test
    void testSetContractName(){
        stakingOptions.setContractName("contractName");
    }

    @Test
    void testSetFunctionName(){
        stakingOptions.setFunctionName("functionName");
    }

    @Test
    void testSetFunctionArgs(){
        stakingOptions.setFunctionArgs(List.of(new FunctionArg("type", "val")));
    }
}