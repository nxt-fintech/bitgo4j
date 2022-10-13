package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MetaDataTest {
  MetaData metaData = new MetaData();

  @Test
  void testToString() {
    String result = metaData.toString();
    Assertions.assertEquals("MetaData[addedBy=<null>,label=<null>,owner=<null>]", result);
  }

  @Test
  void testSetAddedBy() {
    metaData.setAddedBy("addedBy");
  }

  @Test
  void testSetLabel() {
    metaData.setLabel("label");
  }

  @Test
  void testSetOwner() {
    metaData.setOwner("owner");
  }
}