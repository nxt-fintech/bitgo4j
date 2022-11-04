package bitgo4j.express.common;

import bitgo4j.policy.common.Amount;
import bitgo4j.policy.common.TxAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipientEntryTest {
    @InjectMocks
    RecipientEntry recipientEntry;

    @Test
    void testToString(){
        String result = recipientEntry.toString();
        Assertions.assertEquals("RecipientEntry[address=<null>,amount=<null>,data=<null>,tokenData=<null>]", result);
    }

    @Test
    void testSetAddress(){
        recipientEntry.setAddress(new TxAddress("address"));
    }

    @Test
    void testSetAmount(){
        recipientEntry.setAmount(new Amount("value", "symbol"));
    }

    @Test
    void testSetData(){
        recipientEntry.setData("data");
    }

    @Test
    void testSetTokenData(){
        recipientEntry.setTokenData(new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId",
            0));
    }
}