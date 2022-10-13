package bitgo4j.transactionrequest.request;

import bitgo4j.transactionrequest.common.Intent;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateTransactionRequestRequestTest {
  @Mock Intent intent;

  @Mock List<String> videoApprovers;

  @InjectMocks CreateTransactionRequestRequest createTransactionRequestRequest;

  @Test
  void testToString() {
    String result = createTransactionRequestRequest.toString();
    Assertions.assertEquals(
        "CreateTransactionRequestRequest[idempotencyKey=<null>,intent=intent,videoApprovers=videoApprovers,apiVersion=<null>,preview=<null>]",
        result);
  }

  @Test
  void testSetIdempotencyKey() {
    createTransactionRequestRequest.setIdempotencyKey("idempotencyKey");
  }

  @Test
  void testSetIntent() {
    createTransactionRequestRequest.setIntent(new Intent());
  }

  @Test
  void testSetVideoApprovers() {
    createTransactionRequestRequest.setVideoApprovers(List.of("String"));
  }

  @Test
  void testSetApiVersion() {
    createTransactionRequestRequest.setApiVersion("apiVersion");
  }

  @Test
  void testSetPreview() {
    createTransactionRequestRequest.setPreview(Boolean.TRUE);
  }
}
