package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class FeeOptionsTest {
    FeeOptions feeOptions= new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0);

    @Test
    void testToString(){
        String result = feeOptions.toString();
        Assertions.assertEquals("FeeOptions[unit=unit,formula=formula,feeType=feeType,gasLimit=0,gasPrice=0,maxFeePerGas=0,maxPriorityFeePerGas=0]", result);
    }

    @Test
    void testSetUnit(){
        feeOptions.setUnit("unit");
    }

    @Test
    void testSetFormula(){
        feeOptions.setFormula("formula");
    }

    @Test
    void testSetFeeType(){
        feeOptions.setFeeType("feeType");
    }

    @Test
    void testSetGasLimit(){
        feeOptions.setGasLimit(0);
    }

    @Test
    void testSetGasPrice(){
        feeOptions.setGasPrice(0);
    }

    @Test
    void testSetMaxFeePerGas(){
        feeOptions.setMaxFeePerGas(0);
    }

    @Test
    void testSetMaxPriorityFeePerGas(){
        feeOptions.setMaxPriorityFeePerGas(0);
    }
}