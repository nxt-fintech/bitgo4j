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
class UpdateCoinSpecificTest {
  @Mock WalletUpdateCoinSpecificEth eth;

  @Mock WalletUpdateCoinSpecificEth teth;

  @InjectMocks UpdateCoinSpecific updateCoinSpecific;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = updateCoinSpecific.toString();
    Assertions.assertEquals("UpdateCoinSpecific[eth=eth,teth=teth]", result);
  }

  @Test
  void testSetEth() {
    updateCoinSpecific.setEth(new WalletUpdateCoinSpecificEth());
  }

  @Test
  void testSetTeth() {
    updateCoinSpecific.setTeth(new WalletUpdateCoinSpecificEth());
  }
}
