package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RewardDataTest {
  RewardData rewardData = new RewardData();

  @Test
  void testToString() {
    String result = rewardData.toString();
    String expected = "RewardData[rewardRecipient=<null>,rewardAmount=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetRewardRecipient() {
    rewardData.setRewardRecipient("rewardRecipient");
  }

  @Test
  void testSetRewardAmount() {
    rewardData.setRewardAmount("rewardAmount");
  }
}
