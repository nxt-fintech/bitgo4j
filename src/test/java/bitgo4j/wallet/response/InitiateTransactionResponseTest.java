package bitgo4j.wallet.response;

import bitgo4j.wallet.common.Info;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class InitiateTransactionResponseTest {
  @Mock Info info;

  @Mock List<String> userIds;

  @InjectMocks InitiateTransactionResponse initiateTransactionResponse;

  @Test
  void testToString() {
    String result = initiateTransactionResponse.toString();
    Assertions.assertEquals(
        "InitiateTransactionResponse[id=<null>,coin=<null>,wallet=<null>,enterprise=<null>,creator=<null>,createDate=<null>,info=info,state=<null>,scope=<null>,userIds=userIds,approvalsRequired=<null>,walletLabel=<null>]",
        result);
  }

  @Test
  void testSetId() {
    initiateTransactionResponse.setId("id");
  }

  @Test
  void testSetCoin() {
    initiateTransactionResponse.setCoin("coin");
  }

  @Test
  void testSetWallet() {
    initiateTransactionResponse.setWallet("wallet");
  }

  @Test
  void testSetEnterprise() {
    initiateTransactionResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetCreator() {
    initiateTransactionResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    initiateTransactionResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    initiateTransactionResponse.setInfo(new Info());
  }

  @Test
  void testSetState() {
    initiateTransactionResponse.setState("state");
  }

  @Test
  void testSetScope() {
    initiateTransactionResponse.setScope("scope");
  }

  @Test
  void testSetUserIds() {
    initiateTransactionResponse.setUserIds(List.of("String"));
  }

  @Test
  void testSetApprovalsRequired() {
    initiateTransactionResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetWalletLabel() {
    initiateTransactionResponse.setWalletLabel("walletLabel");
  }
}