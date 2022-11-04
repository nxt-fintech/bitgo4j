package bitgo4j.express.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class UnspentsRequestTest {
    UnspentsRequest unspentsRequest= new UnspentsRequest("walletPassphrase", "xprv", "feeRate", "maxFeeRate", 0, 0, 0, 0, 0, 0, Boolean.TRUE, 0, 0, "targetAddress");

    @Test
    void testToString(){
        String result = unspentsRequest.toString();
        Assertions.assertEquals("UnspentsRequest[walletPassphrase=walletPassphrase,xprv=xprv,feeRate=feeRate,maxFeeRate=maxFeeRate,maxFeePercentage=0,feeTxConfirmTarget=0,minValue=0,maxValue=0,minHeight=0,minConfirms=0,enforceMinConfirmsForChange=true,limit=0,numUnspentsToMake=0,targetAddress=targetAddress]", result);
    }

    @Test
    void testSetWalletPassphrase(){
        unspentsRequest.setWalletPassphrase("walletPassphrase");
    }

    @Test
    void testSetXprv(){
        unspentsRequest.setXprv("xprv");
    }

    @Test
    void testSetFeeRate(){
        unspentsRequest.setFeeRate("feeRate");
    }

    @Test
    void testSetMaxFeeRate(){
        unspentsRequest.setMaxFeeRate("maxFeeRate");
    }

    @Test
    void testSetMaxFeePercentage(){
        unspentsRequest.setMaxFeePercentage(0);
    }

    @Test
    void testSetFeeTxConfirmTarget(){
        unspentsRequest.setFeeTxConfirmTarget(0);
    }

    @Test
    void testSetMinValue(){
        unspentsRequest.setMinValue(0);
    }

    @Test
    void testSetMaxValue(){
        unspentsRequest.setMaxValue(0);
    }

    @Test
    void testSetMinHeight(){
        unspentsRequest.setMinHeight(0);
    }

    @Test
    void testSetMinConfirms(){
        unspentsRequest.setMinConfirms(0);
    }

    @Test
    void testSetEnforceMinConfirmsForChange(){
        unspentsRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
    }

    @Test
    void testSetLimit(){
        unspentsRequest.setLimit(0);
    }

    @Test
    void testSetNumUnspentsToMake(){
        unspentsRequest.setNumUnspentsToMake(0);
    }

    @Test
    void testSetTargetAddress(){
        unspentsRequest.setTargetAddress("targetAddress");
    }
}