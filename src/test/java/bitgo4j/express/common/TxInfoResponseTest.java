package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TxInfoResponseTest {
  @Mock HalfSigned halfSigned;

  @InjectMocks TxInfoResponse txInfoResponse;

  @Test
  void testToString() {
    String result = txInfoResponse.toString();
    String expected = "TxInfoResponse[txHex=<null>,halfSigned=halfSigned]";
    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSetTxHex() {
    txInfoResponse.setTxHex("txHex");
  }

  @Test
  void testSetHalfSigned() {
    txInfoResponse.setHalfSigned(new HalfSigned());
  }
}
