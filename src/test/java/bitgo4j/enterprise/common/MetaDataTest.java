package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MetaDataTest {
  MetaData metaData = new MetaData("label", "owner");

  @Test
  void testToString() {
    String result = metaData.toString();
    Assertions.assertEquals("MetaData[label=label,owner=owner]", result);
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
