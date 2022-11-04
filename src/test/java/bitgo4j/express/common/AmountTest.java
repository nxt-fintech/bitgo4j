package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class AmountTest {
    Amount amount= new Amount("value", "symbol");

    @Test
    void testToString(){
        String result = amount.toString();
        Assertions.assertEquals("Amount[value=value,symbol=symbol]", result);
    }

    @Test
    void testSetValue(){
        amount.setValue("value");
    }

    @Test
    void testSetSymbol(){
        amount.setSymbol("symbol");
    }
}