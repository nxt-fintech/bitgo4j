package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipientTest {
  @Mock Memo memo;

  @InjectMocks Recipient recipient;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = recipient.toString();
    Assertions.assertEquals("Recipient[amount=<null>,address=<null>,memo=memo]", result);
  }

  @Test
  void testSetAmount() {
    recipient.setAmount("amount");
  }

  @Test
  void testSetAddress() {
    recipient.setAddress("address");
  }

  @Test
  void testSetMemo() {
    recipient.setMemo(new Memo("type", "value"));
  }
}
