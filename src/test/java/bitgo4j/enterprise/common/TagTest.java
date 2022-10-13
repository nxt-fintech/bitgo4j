package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TagTest {
  Tag tag = new Tag("name", "id");

  @Test
  void testToString() {
    String result = tag.toString();
    Assertions.assertEquals("Tag[name=name,id=id]", result);
  }

  @Test
  void testSetName() {
    tag.setName("name");
  }

  @Test
  void testSetId() {
    tag.setId("id");
  }
}
