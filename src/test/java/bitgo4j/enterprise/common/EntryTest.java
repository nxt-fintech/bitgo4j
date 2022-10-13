package bitgo4j.enterprise.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EntryTest {
  @Mock MetaData metaData;

  @InjectMocks Entry entry;

  @Test
  void testToString() {
    String result = entry.toString();
    Assertions.assertEquals("Entry[item=<null>,metaData=metaData,type=<null>]", result);
  }

  @Test
  void testSetItem() {
    entry.setItem("item");
  }

  @Test
  void testSetMetaData() {
    entry.setMetaData(new MetaData("label", "owner"));
  }

  @Test
  void testSetType() {
    entry.setType("type");
  }
}
