package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TokensTest {
  @Mock Property property;

  @InjectMocks Tokens tokens;

  @Test
  void testToString() {
    String result = tokens.toString();
    Assertions.assertEquals("Tokens[property=property]", result);
  }

  @Test
  void testSetProperty() {
    tokens.setProperty(
        new Property(
            "balanceString",
            "confirmedBalanceString",
            "heldBalanceString",
            "spendableBalanceString",
            "stakedBalanceString",
            0));
  }
}