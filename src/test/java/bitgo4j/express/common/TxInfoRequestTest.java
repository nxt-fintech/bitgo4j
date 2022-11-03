package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TxInfoRequestTest {
  @InjectMocks TxInfoRequest txInfoRequest;

  @Test
  void testToString() {
    String result = txInfoRequest.toString();
    String expected =
        "TxInfoRequest[changeAddresses=<null>,nOutputs=<null>,nP2SHInputs=<null>,unspents=<null>,walletAddressDetails=<null>,fee=<null>,operations=<null>,sequence=<null>,source=<null>]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetChangeAddresses() {
    txInfoRequest.setChangeAddresses(List.of("String"));
  }

  @Test
  void testSetNOutputs() {
    txInfoRequest.setNOutputs(0);
  }

  @Test
  void testSetNP2SHInputs() {
    txInfoRequest.setNP2SHInputs(0);
  }

  @Test
  void testSetUnspents() {
    txInfoRequest.setUnspents(List.of(new Unspent()));
  }

  @Test
  void testSetWalletAddressDetails() {
    txInfoRequest.setWalletAddressDetails(new WalletAddressDetails());
  }

  @Test
  void testSetFee() {
    txInfoRequest.setFee(0);
  }

  @Test
  void testSetOperations() {
    txInfoRequest.setOperations(
        List.of(new Operation("amount", new Asset(), "destination", "type")));
  }

  @Test
  void testSetSequence() {
    txInfoRequest.setSequence("sequence");
  }

  @Test
  void testSetSource() {
    txInfoRequest.setSource("source");
  }
}