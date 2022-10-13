package bitgo4j.transactionrequest.response;

import bitgo4j.transactionrequest.common.Intent;
import bitgo4j.transactionrequest.common.Transaction;
import bitgo4j.transactionrequest.common.UnsignedTransaction;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestResponseTest {
  @InjectMocks TransactionRequestResponse transactionRequestResponse;

  @Test
  void testToString() {
    String result = transactionRequestResponse.toString();
    Assertions.assertEquals(
        "TransactionRequestResponse[txRequestId=<null>,version=<null>,latest=<null>,walletId=<null>,walletType=<null>,enterpriseId=<null>,state=<null>,date=<null>,userId=<null>,intent=<null>,intents=<null>,pendingApprovalId=<null>,unsignedTxs=<null>,signatureShares=<null>,txs=<null>,txHashes=<null>]",
        result);
  }

  @Test
  void testSetTxRequestId() {
    transactionRequestResponse.setTxRequestId("txRequestId");
  }

  @Test
  void testSetVersion() {
    transactionRequestResponse.setVersion(0);
  }

  @Test
  void testSetLatest() {
    transactionRequestResponse.setLatest(Boolean.TRUE);
  }

  @Test
  void testSetWalletId() {
    transactionRequestResponse.setWalletId("walletId");
  }

  @Test
  void testSetWalletType() {
    transactionRequestResponse.setWalletType("walletType");
  }

  @Test
  void testSetEnterpriseId() {
    transactionRequestResponse.setEnterpriseId("enterpriseId");
  }

  @Test
  void testSetState() {
    transactionRequestResponse.setState("state");
  }

  @Test
  void testSetDate() {
    transactionRequestResponse.setDate("date");
  }

  @Test
  void testSetUserId() {
    transactionRequestResponse.setUserId("userId");
  }

  @Test
  void testSetIntent() {
    transactionRequestResponse.setIntent(new Intent());
  }

  @Test
  void testSetIntents() {
    transactionRequestResponse.setIntents(List.of(new Intent()));
  }

  @Test
  void testSetPendingApprovalId() {
    transactionRequestResponse.setPendingApprovalId("pendingApprovalId");
  }

  @Test
  void testSetUnsignedTxs() {
    transactionRequestResponse.setUnsignedTxs(List.of(new UnsignedTransaction()));
  }

  @Test
  void testSetSignatureShares() {
    transactionRequestResponse.setSignatureShares(List.of(new SignatureShareResponse()));
  }

  @Test
  void testSetTxs() {
    transactionRequestResponse.setTxs(List.of(new Transaction()));
  }

  @Test
  void testSetTxHashes() {
    transactionRequestResponse.setTxHashes(List.of("String"));
  }
}
