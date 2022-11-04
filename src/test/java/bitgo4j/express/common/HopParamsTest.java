package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class HopParamsTest {
    HopParams hopParams= new HopParams("paymentId", "userRegSig", 0);

    @Test
    void testToString(){
        String result = hopParams.toString();
        Assertions.assertEquals("HopParams[paymentId=paymentId,userRegSig=userRegSig,gasPriceMax=0]", result);
    }

    @Test
    void testSetPaymentId(){
        hopParams.setPaymentId("paymentId");
    }

    @Test
    void testSetUserRegSig(){
        hopParams.setUserRegSig("userRegSig");
    }

    @Test
    void testSetGasPriceMax(){
        hopParams.setGasPriceMax(0);
    }
}