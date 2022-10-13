package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipientEntryTest {
  @Mock TxAddress address;

  @Mock Amount amount;

  @InjectMocks RecipientEntry recipientEntry;

  @Test
  void testToString() {
    String result = recipientEntry.toString();
    Assertions.assertEquals("RecipientEntry[address=address,amount=amount,data=<null>]", result);
  }

  @Test
  void testSetAddress() {
    recipientEntry.setAddress(new TxAddress());
  }

  @Test
  void testSetAmount() {
    recipientEntry.setAmount(new Amount());
  }

  @Test
  void testSetData() {
    recipientEntry.setData("data");
  }
}
