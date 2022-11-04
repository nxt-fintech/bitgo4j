package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class FunctionArgTest {
    FunctionArg functionArg= new FunctionArg("type", "val");

    @Test
    void testToString(){
        String result = functionArg.toString();
        Assertions.assertEquals("FunctionArg[type=type,val=val]", result);
    }

    @Test
    void testSetType(){
        functionArg.setType("type");
    }

    @Test
    void testSetVal(){
        functionArg.setVal("val");
    }
}