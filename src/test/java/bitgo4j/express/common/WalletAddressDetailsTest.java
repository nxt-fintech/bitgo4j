package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WalletAddressDetailsTest {
    @InjectMocks
    WalletAddressDetails walletAddressDetails;



    @Test
    void testToString(){
        String result = walletAddressDetails.toString();
        Assertions.assertEquals("WalletAddressDetails[id=<null>,address=<null>,chain=<null>,index=<null>,coin=<null>,lastNonce=<null>,wallet=<null>,coinSpecific=<null>,balance=<null>,label=<null>,addressType=<null>]", result);
    }

    @Test
    void testSetId(){
        walletAddressDetails.setId("id");
    }

    @Test
    void testSetAddress(){
        walletAddressDetails.setAddress("address");
    }

    @Test
    void testSetChain(){
        walletAddressDetails.setChain(0);
    }

    @Test
    void testSetIndex(){
        walletAddressDetails.setIndex(0);
    }

    @Test
    void testSetCoin(){
        walletAddressDetails.setCoin("coin");
    }

    @Test
    void testSetLastNonce(){
        walletAddressDetails.setLastNonce(0);
    }

    @Test
    void testSetWallet(){
        walletAddressDetails.setWallet("wallet");
    }

    @Test
    void testSetCoinSpecific(){
        walletAddressDetails.setCoinSpecific(new AddressCoinSpecific(new AddressCoinSpecificXlm("memoId", "rootAddress"), new AddressCoinSpecificXlm("memoId", "rootAddress")));
    }

    @Test
    void testSetBalance(){
        walletAddressDetails.setBalance(new AddressBalance("updated", 1L, "balanceString", 1L, 1L, "confirmedBalanceString", "spendableBalanceString"));
    }

    @Test
    void testSetLabel(){
        walletAddressDetails.setLabel("label");
    }

    @Test
    void testSetAddressType(){
        walletAddressDetails.setAddressType("addressType");
    }
}