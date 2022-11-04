package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class FeeInfoTest {
    FeeInfo feeInfo= new FeeInfo(0, 0, "feeRate", 0, "payGoFeeString", 0, "xlmBaseFee", "xlmBaseReserve");

    @Test
    void testToString(){
        String result = feeInfo.toString();
        Assertions.assertEquals("FeeInfo[size=0,fee=0,feeRate=feeRate,payGoFee=0,payGoFeeString=payGoFeeString,height=0,xlmBaseFee=xlmBaseFee,xlmBaseReserve=xlmBaseReserve]", result);
    }

    @Test
    void testSetSize(){
        feeInfo.setSize(0);
    }

    @Test
    void testSetFee(){
        feeInfo.setFee(0);
    }

    @Test
    void testSetFeeRate(){
        feeInfo.setFeeRate("feeRate");
    }

    @Test
    void testSetPayGoFee(){
        feeInfo.setPayGoFee(0);
    }

    @Test
    void testSetPayGoFeeString(){
        feeInfo.setPayGoFeeString("payGoFeeString");
    }

    @Test
    void testSetHeight(){
        feeInfo.setHeight(0);
    }

    @Test
    void testSetXlmBaseFee(){
        feeInfo.setXlmBaseFee("xlmBaseFee");
    }

    @Test
    void testSetXlmBaseReserve(){
        feeInfo.setXlmBaseReserve("xlmBaseReserve");
    }
}