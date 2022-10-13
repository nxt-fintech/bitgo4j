package bitgo4j.enterprise.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListEnterpriseWalletLimitsResponseTest {
  @Mock List<EnterpriseWalletLimitResponse> enterpriseWalletLimits;

  @InjectMocks ListEnterpriseWalletLimitsResponse listEnterpriseWalletLimitsResponse;

  @Test
  void testToString() {
    String result = listEnterpriseWalletLimitsResponse.toString();
    Assertions.assertEquals(
        "ListEnterpriseWalletLimitsResponse[enterpriseWalletLimits=enterpriseWalletLimits]",
        result);
  }

  @Test
  void testSetEnterpriseWalletLimits() {
    listEnterpriseWalletLimitsResponse.setEnterpriseWalletLimits(
        List.of(new EnterpriseWalletLimitResponse()));
  }
}
