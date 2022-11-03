package bitgo4j.express.response;

import bitgo4j.express.common.Balance;
import bitgo4j.express.common.CoinSpecific;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AddressResponseTest {
  @Mock CoinSpecific coinSpecific;

  @Mock Balance balance;

  @InjectMocks AddressResponse addressResponse;

  @Test
  void testToString() {
    String result = addressResponse.toString();
    String expected =
        "AddressResponse[id=<null>,address=<null>,chain=<null>,index=<null>,coin=<null>,lastNonce=<null>,wallet=<null>,coinSpecific=coinSpecific,label=<null>,addressType=<null>,balance=balance]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetId() {
    addressResponse.setId("id");
  }

  @Test
  void testSetAddress() {
    addressResponse.setAddress("address");
  }

  @Test
  void testSetChain() {
    addressResponse.setChain(0);
  }

  @Test
  void testSetIndex() {
    addressResponse.setIndex(0L);
  }

  @Test
  void testSetCoin() {
    addressResponse.setCoin("coin");
  }

  @Test
  void testSetLastNonce() {
    addressResponse.setLastNonce(0L);
  }

  @Test
  void testSetWallet() {
    addressResponse.setWallet("wallet");
  }

  @Test
  void testSetCoinSpecific() {
    addressResponse.setCoinSpecific(new CoinSpecific());
  }

  @Test
  void testSetLabel() {
    addressResponse.setLabel("label");
  }

  @Test
  void testSetAddressType() {
    addressResponse.setAddressType("addressType");
  }

  @Test
  void testSetBalance() {
    addressResponse.setBalance(new Balance());
  }
}
