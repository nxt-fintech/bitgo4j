package bitgo4j.express.common;

import bitgo4j.wallet.common.FeeInfo;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionTest {
    @InjectMocks
    Transaction transaction;

    @Test
    void testToString(){
        String result = transaction.toString();
        Assertions.assertEquals("Transaction[state=<null>,unsignedTransaction=<null>,signatureShares=<null>,txHash=<null>]", result);
    }

    @Test
    void testSetState(){
        transaction.setState("state");
    }

    @Test
    void testSetUnsignedTransaction(){
        transaction.setUnsignedTransaction(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0)));
    }

    @Test
    void testSetSignatureShares(){
        transaction.setSignatureShares(List.of(new SignatureShare("from", "to", "share")));
    }

    @Test
    void testSetTxHash(){
        transaction.setTxHash("txHash");
    }
}