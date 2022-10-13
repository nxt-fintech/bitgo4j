package bitgo4j.wallet.response;

import bitgo4j.wallet.common.RewardData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TotalRewardDataTestResponse {
  @Mock List<RewardData> rewardData;

  @InjectMocks TotalRewardsDataResponse totalRewardData;

  @Test
  void testToString() {
    String result = totalRewardData.toString();
    String expected = "TotalRewardsDataResponse[address=<null>,rewardData=rewardData]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetAddress() {
    totalRewardData.setAddress("address");
  }

  @Test
  void testSetRewardData() {
    totalRewardData.setRewardData(List.of(new RewardData()));
  }
}
