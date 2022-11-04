package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RefundOptionsTest {
    RefundOptions refundOptions= new RefundOptions("address");

    @Test
    void testToString(){
        String result = refundOptions.toString();
        Assertions.assertEquals("RefundOptions[address=address]", result);
    }

    @Test
    void testSetAddress(){
        refundOptions.setAddress("address");
    }
}