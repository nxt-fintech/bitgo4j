package bitgo4j.transactionrequest.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipientTest {
  @Mock Address address;

  @Mock Amount amount;

  @InjectMocks Recipient recipient;

  @Test
  void testToString() {
    String result = recipient.toString();
    Assertions.assertEquals("Recipient[address=address,amount=amount,date=<null>]", result);
  }

  @Test
  void testSetAddress() {
    recipient.setAddress(new Address());
  }

  @Test
  void testSetAmount() {
    recipient.setAmount(new Amount());
  }

  @Test
  void testSetDate() {
    recipient.setDate("date");
  }
}
