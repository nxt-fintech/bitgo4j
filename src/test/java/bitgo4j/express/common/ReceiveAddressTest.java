package bitgo4j.express.common;

import bitgo4j.policy.common.AddressCoinSpecificXlm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ReceiveAddressTest {
    @InjectMocks
    ReceiveAddress receiveAddress;

    @Test
    void testToString(){
        String result = receiveAddress.toString();
        Assertions.assertEquals("ReceiveAddress[id=<null>,address=<null>,chain=<null>,index=<null>,coin=<null>,lastNonce=<null>,wallet=<null>,coinSpecific=<null>,balance=<null>,label=<null>,addressType=<null>]", result);
    }

    @Test
    void testSetId(){
        receiveAddress.setId("id");
    }

    @Test
    void testSetAddress(){
        receiveAddress.setAddress("address");
    }

    @Test
    void testSetChain(){
        receiveAddress.setChain(0);
    }

    @Test
    void testSetIndex(){
        receiveAddress.setIndex(1L);
    }

    @Test
    void testSetCoin(){
        receiveAddress.setCoin("coin");
    }

    @Test
    void testSetLastNonce(){
        receiveAddress.setLastNonce(1L);
    }

    @Test
    void testSetWallet(){
        receiveAddress.setWallet("wallet");
    }

    @Test
    void testSetCoinSpecific(){
        receiveAddress.setCoinSpecific(new AddressCoinSpecific(new AddressCoinSpecificXlm("memoId", "rootAddress"), new AddressCoinSpecificXlm("memoId", "rootAddress")));
    }

    @Test
    void testSetBalance(){
        receiveAddress.setBalance(new AddressBalance("updated", 1L, "balanceString", 1L, 1L, "confirmedBalanceString", "spendableBalanceString"));
    }

    @Test
    void testSetLabel(){
        receiveAddress.setLabel("label");
    }

    @Test
    void testSetAddressType(){
        receiveAddress.setAddressType("addressType");
    }
}