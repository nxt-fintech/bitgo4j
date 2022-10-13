package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdditionalEnterpriseInfoTest {
  @Mock Contact contact;

  @InjectMocks AdditionalEnterpriseInfo additionalEnterpriseInfo;

  @Test
  void testToString() {
    String result = additionalEnterpriseInfo.toString();
    Assertions.assertEquals(
        "AdditionalEnterpriseInfo[regulator=<null>,regulatorId=<null>,contact=contact]", result);
  }

  @Test
  void testSetRegulator() {
    additionalEnterpriseInfo.setRegulator("regulator");
  }

  @Test
  void testSetRegulatorId() {
    additionalEnterpriseInfo.setRegulatorId("regulatorId");
  }

  @Test
  void testSetContact() {
    additionalEnterpriseInfo.setContact(
        new Contact(
            "name", "street", "street2", "suite", "city", "state", "postalCode", "country"));
  }
}
