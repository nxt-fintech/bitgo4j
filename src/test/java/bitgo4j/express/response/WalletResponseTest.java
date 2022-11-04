package bitgo4j.express.response;

import bitgo4j.enterprise.common.Info;
import bitgo4j.enterprise.common.UpdateApprovalsRequiredRequest;
import bitgo4j.enterprise.common.UpdateEnterpriseRequest;
import bitgo4j.express.common.Action;
import bitgo4j.express.common.AddressBalance;
import bitgo4j.express.common.AddressCoinSpecific;
import bitgo4j.express.common.AddressCoinSpecificXlm;
import bitgo4j.express.common.Admin;
import bitgo4j.express.common.Condition;
import bitgo4j.express.common.Entry;
import bitgo4j.express.common.Freeze;
import bitgo4j.express.common.KeySignatures;
import bitgo4j.express.common.MetaData;
import bitgo4j.express.common.PendingApproval;
import bitgo4j.express.common.Policy;
import bitgo4j.express.common.ReceiveAddress;
import bitgo4j.express.common.Rule;
import bitgo4j.express.common.User;
import bitgo4j.user.common.Email;
import bitgo4j.user.common.Name;
import bitgo4j.user.common.Phone;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WalletResponseTest {
    @InjectMocks
    WalletResponse walletResponse;

    @Test
    void testToString(){
        String result = walletResponse.toString();
        Assertions.assertEquals("WalletResponse[id=<null>,users=<null>,coin=<null>,label=<null>,m=<null>,n=<null>,keys=<null>,keySignatures=<null>,tags=<null>,receiveAddress=<null>,balance=<null>,balanceString=<null>,confirmedBalance=<null>,confirmedBalanceString=<null>,spendableBalance=<null>,spendableBalanceString=<null>,deleted=<null>,isCold=<null>,freeze=<null>,disableTransactionNotifications=<null>,admin=<null>,approvalsRequired=<null>,pendingApprovals=<null>]", result);
    }

    @Test
    void testSetId(){
        walletResponse.setId("id");
    }

    @Test
    void testSetUsers(){
        walletResponse.setUsers(
            List.of(new User("id", Boolean.TRUE, new Name("first", "full", "last"), "username", new Email("email", Boolean.TRUE), new Phone("phone", Boolean.TRUE), "country", "state", "user", List.of("String"))));
    }

    @Test
    void testSetCoin(){
        walletResponse.setCoin("coin");
    }

    @Test
    void testSetLabel(){
        walletResponse.setLabel("label");
    }

    @Test
    void testSetM(){
        walletResponse.setM(1L);
    }

    @Test
    void testSetN(){
        walletResponse.setN(1L);
    }

    @Test
    void testSetKeys(){
        walletResponse.setKeys(List.of("String"));
    }

    @Test
    void testSetKeySignatures(){
        walletResponse.setKeySignatures(new KeySignatures("backupPub", "bitgoPub"));
    }

    @Test
    void testSetTags(){
        walletResponse.setTags(List.of("String"));
    }

    @Test
    void testSetReceiveAddress(){
        walletResponse.setReceiveAddress(new ReceiveAddress("id", "address", 0, 1L, "coin", 1L, "wallet", new AddressCoinSpecific(new AddressCoinSpecificXlm("memoId", "rootAddress"), new AddressCoinSpecificXlm("memoId", "rootAddress")), new AddressBalance("updated",
            1L, "balanceString",
            1L, 1L, "confirmedBalanceString", "spendableBalanceString"), "label", "addressType"));
    }

    @Test
    void testSetBalance(){
        walletResponse.setBalance(1L);
    }

    @Test
    void testSetBalanceString(){
        walletResponse.setBalanceString("balanceString");
    }

    @Test
    void testSetConfirmedBalance(){
        walletResponse.setConfirmedBalance(1L);
    }

    @Test
    void testSetConfirmedBalanceString(){
        walletResponse.setConfirmedBalanceString("confirmedBalanceString");
    }

    @Test
    void testSetSpendableBalance(){
        walletResponse.setSpendableBalance(1L);
    }

    @Test
    void testSetSpendableBalanceString(){
        walletResponse.setSpendableBalanceString("spendableBalanceString");
    }

    @Test
    void testSetDeleted(){
        walletResponse.setDeleted(Boolean.TRUE);
    }

    @Test
    void testSetIsCold(){
        walletResponse.setIsCold(Boolean.TRUE);
    }

    @Test
    void testSetFreeze(){
        walletResponse.setFreeze(new Freeze("time", "expires"));
    }

    @Test
    void testSetDisableTransactionNotifications(){
        walletResponse.setDisableTransactionNotifications(Boolean.TRUE);
    }

    @Test
    void testSetAdmin(){
        walletResponse.setAdmin(new Admin(new Policy("id", "date", "label", Boolean.TRUE, List.of(new Rule("id", "lockDate", "mutabilityConstraint", "coin", "type", new Condition("amountString",
            0, List.of("String"), List.of("String"), List.of("String"), List.of(new Entry("item", new MetaData("label", "owner", "propertyName"), "type")), "url"), new Action("type",
            0, List.of("String")))), 0)));
    }

    @Test
    void testSetApprovalsRequired(){
        walletResponse.setApprovalsRequired(1L);
    }

    @Test
    void testSetPendingApprovals(){
        walletResponse.setPendingApprovals(
            List.of(new PendingApproval("id", "coin", "wallet", "enterprise", "creator", "createDate", new Info("type", new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"), new UpdateApprovalsRequiredRequest(
                1L)), "state", "scope", List.of("String"), 1L, "walletLabel")));
    }
}