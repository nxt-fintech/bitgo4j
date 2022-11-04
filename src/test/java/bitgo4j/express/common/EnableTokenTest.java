package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class EnableTokenTest {
    EnableToken enableToken= new EnableToken("name", "address");

    @Test
    void testToString(){
        String result = enableToken.toString();
        Assertions.assertEquals("EnableToken[name=name,address=address]", result);
    }

    @Test
    void testSetName(){
        enableToken.setName("name");
    }

    @Test
    void testSetAddress(){
        enableToken.setAddress("address");
    }
}