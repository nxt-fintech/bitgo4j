package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class AddressBalanceTest {
    AddressBalance addressBalance= new AddressBalance("updated", 1L, "balanceString",
        1L,
        1L, "confirmedBalanceString", "spendableBalanceString");

    @Test
    void testToString(){
        String result = addressBalance.toString();
        Assertions.assertEquals("AddressBalance[updated=updated,balance=1,balanceString=balanceString,totalReceived=1,totalSent=1,confirmedBalanceString=confirmedBalanceString,spendableBalanceString=spendableBalanceString]", result);
    }

    @Test
    void testSetUpdated(){
        addressBalance.setUpdated("updated");
    }

    @Test
    void testSetBalance(){
        addressBalance.setBalance(1L);
    }

    @Test
    void testSetBalanceString(){
        addressBalance.setBalanceString("balanceString");
    }

    @Test
    void testSetTotalReceived(){
        addressBalance.setTotalReceived(1L);
    }

    @Test
    void testSetTotalSent(){
        addressBalance.setTotalSent(1L);
    }

    @Test
    void testSetConfirmedBalanceString(){
        addressBalance.setConfirmedBalanceString("confirmedBalanceString");
    }

    @Test
    void testSetSpendableBalanceString(){
        addressBalance.setSpendableBalanceString("spendableBalanceString");
    }
}