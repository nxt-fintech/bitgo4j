package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PolicyRuleRequestTest {
    @InjectMocks
    PolicyRuleRequest policyRuleRequest;

    @Test
    void testToString(){
        String result = policyRuleRequest.toString();
        Assertions.assertEquals("PolicyRuleRequest[action=<null>,update=<null>]", result);
    }

    @Test
    void testSetAction(){
        policyRuleRequest.setAction("action");
    }

    @Test
    void testSetUpdate(){
        policyRuleRequest.setUpdate(new Update(new Action("type", 0, List.of("String")), "coin", new Condition("amountString",
            0, List.of("String"), List.of("String"), List.of("String"), List.of(new Entry("item", new MetaData("label", "owner", "propertyName"), "type")), "url"), "id", "type"));
    }
}