package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HalfSignedTest {
    @InjectMocks
    HalfSigned halfSigned;

    @Test
    void testToString(){
        String result = halfSigned.toString();
        Assertions.assertEquals("HalfSigned[contractSequenceId=<null>,expireTime=<null>,gasLimit=<null>,gasPrice=<null>,operationHash=<null>,recipient=<null>,signature=<null>,tokenContractAddress=<null>,walletId=<null>,txBase64=<null>,txHex=<null>]", result);
    }

    @Test
    void testSetContractSequenceId(){
        halfSigned.setContractSequenceId(1L);
    }

    @Test
    void testSetExpireTime(){
        halfSigned.setExpireTime(1L);
    }

    @Test
    void testSetGasLimit(){
        halfSigned.setGasLimit(1L);
    }

    @Test
    void testSetGasPrice(){
        halfSigned.setGasPrice(1L);
    }

    @Test
    void testSetOperationHash(){
        halfSigned.setOperationHash("operationHash");
    }

    @Test
    void testSetRecipient(){
        halfSigned.setRecipient(new Recipient("address", "amount", "data"));
    }

    @Test
    void testSetSignature(){
        halfSigned.setSignature("signature");
    }

    @Test
    void testSetTokenContractAddress(){
        halfSigned.setTokenContractAddress("tokenContractAddress");
    }

    @Test
    void testSetWalletId(){
        halfSigned.setWalletId("walletId");
    }

    @Test
    void testSetTxBase64(){
        halfSigned.setTxBase64("txBase64");
    }

    @Test
    void testSetTxHex(){
        halfSigned.setTxHex("txHex");
    }
}