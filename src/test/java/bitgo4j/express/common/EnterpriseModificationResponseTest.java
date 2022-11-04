package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnterpriseModificationResponseTest {
    @InjectMocks
    EnterpriseModificationResponse enterpriseModificationResponse;

    @Test
    void testToString(){
        String result = enterpriseModificationResponse.toString();
        Assertions.assertEquals("EnterpriseModificationResponse[action=<null>,updateEnterpriseRequest=<null>]", result);
    }

    @Test
    void testSetAction(){
        enterpriseModificationResponse.setAction("action");
    }

    @Test
    void testSetUpdateEnterpriseRequest(){
        enterpriseModificationResponse.setUpdateEnterpriseRequest(new UpdateEnterpriseRequest("type", "action", "permission", "userId", "email"));
    }
}