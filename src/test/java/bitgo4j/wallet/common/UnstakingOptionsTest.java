package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnstakingOptionsTest {
  UnstakingOptions unstakingOptions =
      new UnstakingOptions("from", "receiver", "unstakeCpuQuantity", "unstakeNetQuantity");

  @Test
  void testToString() {
    String result = unstakingOptions.toString();
    Assertions.assertEquals(
        "UnstakingOptions[from=from,receiver=receiver,unstakeCpuQuantity=unstakeCpuQuantity,unstakeNetQuantity=unstakeNetQuantity]",
        result);
  }

  @Test
  void testSetFrom() {
    unstakingOptions.setFrom("from");
  }

  @Test
  void testSetReceiver() {
    unstakingOptions.setReceiver("receiver");
  }

  @Test
  void testSetUnstakeCpuQuantity() {
    unstakingOptions.setUnstakeCpuQuantity("unstakeCpuQuantity");
  }

  @Test
  void testSetUnstakeNetQuantity() {
    unstakingOptions.setUnstakeNetQuantity("unstakeNetQuantity");
  }
}
