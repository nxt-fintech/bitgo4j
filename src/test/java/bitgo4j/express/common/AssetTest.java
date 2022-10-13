package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssetTest {
  Asset asset = new Asset();

  @Test
  void testToString() {
    String result = asset.toString();
    String expected = "Asset[code=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetCode() {
    asset.setCode("code");
  }
}
