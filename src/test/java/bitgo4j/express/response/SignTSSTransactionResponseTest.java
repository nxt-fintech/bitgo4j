package bitgo4j.express.response;

import bitgo4j.express.common.Amount;
import bitgo4j.express.common.DOTFeeOptions;
import bitgo4j.express.common.EnableToken;
import bitgo4j.express.common.FeeOptions;
import bitgo4j.express.common.HopParams;
import bitgo4j.express.common.Intent;
import bitgo4j.express.common.RecipientEntry;
import bitgo4j.express.common.SignatureShare;
import bitgo4j.express.common.TokenData;
import bitgo4j.express.common.Transaction;
import bitgo4j.express.common.UnsignedTransaction;
import bitgo4j.policy.common.TxAddress;
import bitgo4j.wallet.common.FeeInfo;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SignTSSTransactionResponseTest {
    @InjectMocks
    SignTSSTransactionResponse signTSSTransactionResponse;

    @Test
    void testToString(){
        String result = signTSSTransactionResponse.toString();
        Assertions.assertEquals("SignTSSTransactionResponse[txRequestId=<null>,version=<null>,latest=<null>,walletId=<null>,walletType=<null>,enterpriseId=<null>,state=<null>,date=<null>,userId=<null>,intent=<null>,intents=<null>,pendingApprovalId=<null>,unsignedTxs=<null>,signatureShares=<null>,txHashes=<null>,transactions=<null>]", result);
    }

    @Test
    void testSetTxRequestId(){
        signTSSTransactionResponse.setTxRequestId("txRequestId");
    }

    @Test
    void testSetVersion(){
        signTSSTransactionResponse.setVersion(0);
    }

    @Test
    void testSetLatest(){
        signTSSTransactionResponse.setLatest(Boolean.TRUE);
    }

    @Test
    void testSetWalletId(){
        signTSSTransactionResponse.setWalletId("walletId");
    }

    @Test
    void testSetWalletType(){
        signTSSTransactionResponse.setWalletType("walletType");
    }

    @Test
    void testSetEnterpriseId(){
        signTSSTransactionResponse.setEnterpriseId("enterpriseId");
    }

    @Test
    void testSetState(){
        signTSSTransactionResponse.setState("state");
    }

    @Test
    void testSetDate(){
        signTSSTransactionResponse.setDate("date");
    }

    @Test
    void testSetUserId(){
        signTSSTransactionResponse.setUserId("userId");
    }

    @Test
    void testSetIntent(){
        signTSSTransactionResponse.setIntent(new Intent("nonce", new DOTFeeOptions("amount", "unit", "formula", "type"), "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", "validatorAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new bitgo4j.policy.common.Amount("value", "symbol"), "data", new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId", 0))), "proxy", new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "custodianTransactionId", "txid", "pubKey", "withdrawalCredentials", "signature", "depositDataRoot", "poolKeyHash"));
    }

    @Test
    void testSetIntents(){
        signTSSTransactionResponse.setIntents(
            List.of(new Intent("nonce", new DOTFeeOptions("amount", "unit", "formula", "type"), "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", "validatorAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new bitgo4j.policy.common.Amount("value", "symbol"), "data", new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId", 0))), "proxy", new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "custodianTransactionId", "txid", "pubKey", "withdrawalCredentials", "signature", "depositDataRoot", "poolKeyHash")));
    }

    @Test
    void testSetPendingApprovalId(){
        signTSSTransactionResponse.setPendingApprovalId("pendingApprovalId");
    }

    @Test
    void testSetUnsignedTxs(){
        signTSSTransactionResponse.setUnsignedTxs(
            List.of(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString", 0))));
    }

    @Test
    void testSetSignatureShares(){
        signTSSTransactionResponse.setSignatureShares(
            List.of(new SignatureShare("from", "to", "share")));
    }

    @Test
    void testSetTxHashes(){
        signTSSTransactionResponse.setTxHashes(List.of("String"));
    }

    @Test
    void testSetTransactions(){
        signTSSTransactionResponse.setTransactions(List.of(new Transaction("state", new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString", 0)), List.of(new SignatureShare("from", "to", "share")), "txHash")));
    }
}