package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestTest {
    @InjectMocks
    TransactionRequest transactionRequest;

    @Test
    void testToString(){
        String result = transactionRequest.toString();
        Assertions.assertEquals("TransactionRequest[comment=<null>,fee=<null>,isUnsigned=<null>,recipients=<null>,requestedAmount=<null>,sourceWallet=<null>,triggeredPolicy=<null>,validTransaction=<null>,validTransactionHash=<null>]", result);
    }

    @Test
    void testSetComment(){
        transactionRequest.setComment("comment");
    }

    @Test
    void testSetFee(){
        transactionRequest.setFee("fee");
    }

    @Test
    void testSetIsUnsigned(){
        transactionRequest.setIsUnsigned(Boolean.TRUE);
    }

    @Test
    void testSetRecipients(){
        transactionRequest.setRecipients(List.of(new Recipient("address", "amount", "data")));
    }

    @Test
    void testSetRequestedAmount(){
        transactionRequest.setRequestedAmount("requestedAmount");
    }

    @Test
    void testSetSourceWallet(){
        transactionRequest.setSourceWallet("sourceWallet");
    }

    @Test
    void testSetTriggeredPolicy(){
        transactionRequest.setTriggeredPolicy("triggeredPolicy");
    }

    @Test
    void testSetValidTransaction(){
        transactionRequest.setValidTransaction("validTransaction");
    }

    @Test
    void testSetValidTransactionHash(){
        transactionRequest.setValidTransactionHash("validTransactionHash");
    }
}