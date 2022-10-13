package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuildDefaultsTest {
  BuildDefaults buildDefaults = new BuildDefaults();

  @Test
  void testToString() {
    String result = buildDefaults.toString();
    String expected = "BuildDefaults[minFeeRate=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetMinFeeRate() {
    buildDefaults.setMinFeeRate(0);
  }
}
