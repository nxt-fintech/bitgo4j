package bitgo4j.express.common;

import bitgo4j.enterprise.common.Info;
import bitgo4j.enterprise.common.UpdateApprovalsRequiredRequest;
import bitgo4j.enterprise.common.UpdateEnterpriseRequest;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PendingApprovalTest {
    @InjectMocks
    PendingApproval pendingApproval;

    @Test
    void testToString(){
        String result = pendingApproval.toString();
        Assertions.assertEquals("PendingApproval[id=<null>,coin=<null>,wallet=<null>,enterprise=<null>,creator=<null>,createDate=<null>,info=<null>,state=<null>,scope=<null>,userIds=<null>,approvalsRequired=<null>,walletLabel=<null>]", result);
    }

    @Test
    void testSetId(){
        pendingApproval.setId("id");
    }

    @Test
    void testSetCoin(){
        pendingApproval.setCoin("coin");
    }

    @Test
    void testSetWallet(){
        pendingApproval.setWallet("wallet");
    }

    @Test
    void testSetEnterprise(){
        pendingApproval.setEnterprise("enterprise");
    }

    @Test
    void testSetCreator(){
        pendingApproval.setCreator("creator");
    }

    @Test
    void testSetCreateDate(){
        pendingApproval.setCreateDate("createDate");
    }

    @Test
    void testSetInfo(){
        pendingApproval.setInfo(new Info("type", new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"), new UpdateApprovalsRequiredRequest(
            1L)));
    }

    @Test
    void testSetState(){
        pendingApproval.setState("state");
    }

    @Test
    void testSetScope(){
        pendingApproval.setScope("scope");
    }

    @Test
    void testSetUserIds(){
        pendingApproval.setUserIds(List.of("String"));
    }

    @Test
    void testSetApprovalsRequired(){
        pendingApproval.setApprovalsRequired(1L);
    }

    @Test
    void testSetWalletLabel(){
        pendingApproval.setWalletLabel("walletLabel");
    }
}