package bitgo4j.enterprise.request;

import bitgo4j.enterprise.common.AdditionalEnterpriseInfo;
import bitgo4j.enterprise.common.Contact;
import bitgo4j.enterprise.common.LegalIdentifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UpdateEnterpriseRequestTest {
  @Mock LegalIdentifiers legalIdentifiers;

  @Mock AdditionalEnterpriseInfo additionalEnterpriseInfo;

  @InjectMocks UpdateEnterpriseRequest updateEnterpriseRequest;

  @Test
  void testToString() {
    String result = updateEnterpriseRequest.toString();
    Assertions.assertEquals(
        "UpdateEnterpriseRequest[legalIdentifiers=legalIdentifiers,additionalEnterpriseInfo=additionalEnterpriseInfo,approvalsRequired=<null>,usersViewAllWallets=<null>]",
        result);
  }

  @Test
  void testSetLegalIdentifiers() {
    updateEnterpriseRequest.setLegalIdentifiers(new LegalIdentifiers("legalPersonName"));
  }

  @Test
  void testSetAdditionalEnterpriseInfo() {
    updateEnterpriseRequest.setAdditionalEnterpriseInfo(
        new AdditionalEnterpriseInfo(
            "regulator",
            "regulatorId",
            new Contact(
                "name", "street", "street2", "suite", "city", "state", "postalCode", "country")));
  }

  @Test
  void testSetApprovalsRequired() {
    updateEnterpriseRequest.setApprovalsRequired(0L);
  }

  @Test
  void testSetUsersViewAllWallets() {
    updateEnterpriseRequest.setUsersViewAllWallets(Boolean.TRUE);
  }
}
