package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RecipientTest {
    Recipient recipient= new Recipient("address", "amount", "data");

    @Test
    void testToString(){
        String result = recipient.toString();
        Assertions.assertEquals("Recipient[address=address,amount=amount,data=data]", result);
    }

    @Test
    void testSetAddress(){
        recipient.setAddress("address");
    }

    @Test
    void testSetAmount(){
        recipient.setAmount("amount");
    }

    @Test
    void testSetData(){
        recipient.setData("data");
    }
}