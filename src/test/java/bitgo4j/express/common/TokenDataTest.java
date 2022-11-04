package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TokenDataTest {
    TokenData tokenData= new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId",
        0);

    @Test
    void testToString(){
        String result = tokenData.toString();
        Assertions.assertEquals("TokenData[tokenType=tokenType,tokenQuantity=tokenQuantity,tokenContractAddress=tokenContractAddress,tokenName=tokenName,tokenId=tokenId,decimalPlaces=0]", result);
    }

    @Test
    void testSetTokenType(){
        tokenData.setTokenType("tokenType");
    }

    @Test
    void testSetTokenQuantity(){
        tokenData.setTokenQuantity("tokenQuantity");
    }

    @Test
    void testSetTokenContractAddress(){
        tokenData.setTokenContractAddress("tokenContractAddress");
    }

    @Test
    void testSetTokenName(){
        tokenData.setTokenName("tokenName");
    }

    @Test
    void testSetTokenId(){
        tokenData.setTokenId("tokenId");
    }

    @Test
    void testSetDecimalPlaces(){
        tokenData.setDecimalPlaces(0);
    }
}