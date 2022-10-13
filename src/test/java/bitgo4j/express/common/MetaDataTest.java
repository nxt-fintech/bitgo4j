package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MetaDataTest {
  MetaData metaData = new MetaData();

  @Test
  void testToString() {
    String result = metaData.toString();
    String expected = "MetaData[label=<null>,owner=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetLabel() {
    metaData.setLabel("label");
  }

  @Test
  void testSetOwner() {
    metaData.setOwner("owner");
  }

  @Test
  void testSetPropertyName() {
    metaData.setPropertyName("propertyName");
  }
}