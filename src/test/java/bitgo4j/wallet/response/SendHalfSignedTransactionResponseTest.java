package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Info;
import bitgo4j.wallet.common.Transfer;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class SendHalfSignedTransactionResponseTest {
  @Mock Transfer transfer;

  @Mock Info info;

  @Mock List<String> userIds;

  @InjectMocks SendHalfSignedTransactionResponse sendHalfSignedTransactionResponse;

  @Test
  void testToString() {
    String result = sendHalfSignedTransactionResponse.toString();
    Assertions.assertEquals(
        "SendHalfSignedTransactionResponse[transfer=transfer,txid=<null>,tx=<null>,status=<null>,id=<null>,coin=<null>,wallet=<null>,enterprise=<null>,creator=<null>,createDate=<null>,info=info,state=<null>,scope=<null>,userIds=userIds,approvalsRequired=<null>,walletLabel=<null>]",
        result);
  }

  @Test
  void testSetTransfer() {
    sendHalfSignedTransactionResponse.setTransfer(new Transfer());
  }

  @Test
  void testSetTxid() {
    sendHalfSignedTransactionResponse.setTxid("txid");
  }

  @Test
  void testSetTx() {
    sendHalfSignedTransactionResponse.setTx("tx");
  }

  @Test
  void testSetStatus() {
    sendHalfSignedTransactionResponse.setStatus("status");
  }

  @Test
  void testSetId() {
    sendHalfSignedTransactionResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    sendHalfSignedTransactionResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    sendHalfSignedTransactionResponse.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    sendHalfSignedTransactionResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetCreator() {
    sendHalfSignedTransactionResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    sendHalfSignedTransactionResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    sendHalfSignedTransactionResponse.setInfo(new Info());
  }

  @Test
  void testSetState() {
    sendHalfSignedTransactionResponse.setState("state");
  }

  @Test
  void testSetScope() {
    sendHalfSignedTransactionResponse.setScope("scope");
  }

  @Test
  void testSetUserIds() {
    sendHalfSignedTransactionResponse.setUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    sendHalfSignedTransactionResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetWalletLabel() {
    sendHalfSignedTransactionResponse.setWalletLabel("walletLabel");
  }
}
