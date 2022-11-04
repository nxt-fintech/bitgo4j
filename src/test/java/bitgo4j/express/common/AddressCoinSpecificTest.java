package bitgo4j.express.common;

import bitgo4j.policy.common.AddressCoinSpecificXlm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AddressCoinSpecificTest {
    @InjectMocks
    AddressCoinSpecific addressCoinSpecific;

    @Test
    void testToString(){
        String result = addressCoinSpecific.toString();
        Assertions.assertEquals("AddressCoinSpecific[xlm=<null>,txlm=<null>]", result);
    }

    @Test
    void testSetXlm(){
        addressCoinSpecific.setXlm(new AddressCoinSpecificXlm("memoId", "rootAddress"));
    }

    @Test
    void testSetTxlm(){
        addressCoinSpecific.setTxlm(new AddressCoinSpecificXlm("memoId", "rootAddress"));
    }
}