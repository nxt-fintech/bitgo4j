package bitgo4j.express.common;

import bitgo4j.wallet.common.FeeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnsignedTransactionTest {
    @InjectMocks
    UnsignedTransaction unsignedTransaction;

    @Test
    void testToString(){
        String result = unsignedTransaction.toString();
        Assertions.assertEquals("UnsignedTransaction[serializedTxHex=<null>,signableHex=<null>,derivationPath=<null>,feeInfo=<null>]", result);
    }

    @Test
    void testSetSerializedTxHex(){
        unsignedTransaction.setSerializedTxHex("serializedTxHex");
    }

    @Test
    void testSetSignableHex(){
        unsignedTransaction.setSignableHex("signableHex");
    }

    @Test
    void testSetDerivationPath(){
        unsignedTransaction.setDerivationPath("derivationPath");
    }

    @Test
    void testSetFeeInfo(){
        unsignedTransaction.setFeeInfo(new FeeInfo("feeString", 0));
    }
}