package bitgo4j.policy.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CoinSpecificTest {
  @Mock List<String> creationFailure;

  @Mock AddressCoinSpecificXlm xlm;

  @Mock AddressCoinSpecificXlm txlm;

  @InjectMocks CoinSpecific coinSpecific;

  @Test
  void testToString() {
    String result = coinSpecific.toString();
    Assertions.assertEquals(
        "CoinSpecific[creationFailure=creationFailure,pendingChainInitialization=<null>,rootAddress=<null>,stellarUsername=<null>,homeDomain=<null>,stellarAddress=<null>]",
        result);
  }

  @Test
  void testSetCreationFailure() {
    coinSpecific.setCreationFailure(List.of("String"));
  }

  @Test
  void testSetPendingChainInitialization() {
    coinSpecific.setPendingChainInitialization(Boolean.TRUE);
  }

  @Test
  void testSetRootAddress() {
    coinSpecific.setRootAddress("rootAddress");
  }

  @Test
  void testSetStellarUsername() {
    coinSpecific.setStellarUsername("stellarUsername");
  }

  @Test
  void testSetHomeDomain() {
    coinSpecific.setHomeDomain("homeDomain");
  }

  @Test
  void testSetStellarAddress() {
    coinSpecific.setStellarAddress("stellarAddress");
  }

  @Test
  void testSetXlm() {
    coinSpecific.setXlm(new AddressCoinSpecificXlm());
  }

  @Test
  void testSetTxlm() {
    coinSpecific.setTxlm(new AddressCoinSpecificXlm());
  }
}
