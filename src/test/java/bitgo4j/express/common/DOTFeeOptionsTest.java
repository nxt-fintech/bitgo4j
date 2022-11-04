package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class DOTFeeOptionsTest {
    DOTFeeOptions dOTFeeOptions= new DOTFeeOptions("amount", "unit", "formula", "type");

    @Test
    void testToString(){
        String result = dOTFeeOptions.toString();
        Assertions.assertEquals("DOTFeeOptions[amount=amount,unit=unit,formula=formula,type=type]", result);
    }

    @Test
    void testSetAmount(){
        dOTFeeOptions.setAmount("amount");
    }

    @Test
    void testSetUnit(){
        dOTFeeOptions.setUnit("unit");
    }

    @Test
    void testSetFormula(){
        dOTFeeOptions.setFormula("formula");
    }

    @Test
    void testSetType(){
        dOTFeeOptions.setType("type");
    }
}