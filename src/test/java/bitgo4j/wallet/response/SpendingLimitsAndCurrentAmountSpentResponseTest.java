package bitgo4j.wallet.response;

import bitgo4j.wallet.common.VelocityLimitSpending;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SpendingLimitsAndCurrentAmountSpentResponseTest {
  @Mock List<VelocityLimitSpending> velocityLimitSpending;

  @InjectMocks
  SpendingLimitsAndCurrentAmountSpentResponse spendingLimitsAndCurrentAmountSpentResponse;

  @Test
  void testToString() {
    String result = spendingLimitsAndCurrentAmountSpentResponse.toString();
    String expected =
        "SpendingLimitsAndCurrentAmountSpentResponse[velocityLimitSpending=velocityLimitSpending]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetVelocityLimitSpendings() {
    spendingLimitsAndCurrentAmountSpentResponse.setVelocityLimitSpending(
        List.of(new VelocityLimitSpending()));
  }
}