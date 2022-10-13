package bitgo4j.policy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ReceiveAddressTest {
  @Mock CoinSpecific coinSpecific;

  @Mock Balance balance;

  @InjectMocks ReceiveAddress receiveAddress;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = receiveAddress.toString();
    Assertions.assertEquals(
        "ReceiveAddress[id=<null>,address=<null>,chain=<null>,index=<null>,coin=<null>,lastNonce=<null>,wallet=<null>,coinSpecific=coinSpecific,balance=balance,label=<null>,addressType=<null>]",
        result);
  }

  @Test
  void testSetId() {
    receiveAddress.setId("id");
  }

  @Test
  void testSetAddress() {
    receiveAddress.setAddress("address");
  }

  @Test
  void testSetChain() {
    receiveAddress.setChain(0);
  }

  @Test
  void testSetIndex() {
    receiveAddress.setIndex(0L);
  }

  @Test
  void testSetCoin() {
    receiveAddress.setCoin("coin");
  }

  @Test
  void testSetLastNonce() {
    receiveAddress.setLastNonce(0L);
  }

  @Test
  void testSetWallet() {
    receiveAddress.setWallet("wallet");
  }

  @Test
  void testSetCoinSpecific() {
    receiveAddress.setCoinSpecific(new CoinSpecific());
  }

  @Test
  void testSetBalance() {
    receiveAddress.setBalance(new Balance());
  }

  @Test
  void testSetLabel() {
    receiveAddress.setLabel("label");
  }

  @Test
  void testSetAddressType() {
    receiveAddress.setAddressType("addressType");
  }
}
