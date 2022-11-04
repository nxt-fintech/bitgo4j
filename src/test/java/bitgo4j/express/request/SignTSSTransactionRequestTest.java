package bitgo4j.express.request;

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
class SignTSSTransactionRequestTest {
    @InjectMocks
    SignTSSTransactionRequest signTSSTransactionRequest;
    
    @Test
    void testToString(){
        String result = signTSSTransactionRequest.toString();
        Assertions.assertEquals("SignTSSTransactionRequest[txRequestId=<null>,version=<null>,latest=<null>,walletId=<null>,walletType=<null>,enterpriseId=<null>,state=<null>,date=<null>,userId=<null>,intent=<null>,intents=<null>,pendingApprovalId=<null>,unsignedTxs=<null>,signatureShares=<null>,txHashes=<null>,transactions=<null>]", result);
    }

    @Test
    void testSetTxRequestId(){
        signTSSTransactionRequest.setTxRequestId("txRequestId");
    }

    @Test
    void testSetVersion(){
        signTSSTransactionRequest.setVersion(0);
    }

    @Test
    void testSetLatest(){
        signTSSTransactionRequest.setLatest(Boolean.TRUE);
    }

    @Test
    void testSetWalletId(){
        signTSSTransactionRequest.setWalletId("walletId");
    }

    @Test
    void testSetWalletType(){
        signTSSTransactionRequest.setWalletType("walletType");
    }

    @Test
    void testSetEnterpriseId(){
        signTSSTransactionRequest.setEnterpriseId("enterpriseId");
    }

    @Test
    void testSetState(){
        signTSSTransactionRequest.setState("state");
    }

    @Test
    void testSetDate(){
        signTSSTransactionRequest.setDate("date");
    }

    @Test
    void testSetUserId(){
        signTSSTransactionRequest.setUserId("userId");
    }

    @Test
    void testSetIntent(){
        signTSSTransactionRequest.setIntent(new Intent("nonce", new DOTFeeOptions("amount", "unit", "formula", "type"), "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", "validatorAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new bitgo4j.policy.common.Amount("value", "symbol"), "data", new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId", 0))), "proxy", new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "custodianTransactionId", "txid", "pubKey", "withdrawalCredentials", "signature", "depositDataRoot", "poolKeyHash"));
    }

    @Test
    void testSetIntents(){
        signTSSTransactionRequest.setIntents(
            List.of(new Intent("nonce", new DOTFeeOptions("amount", "unit", "formula", "type"), "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", "validatorAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new bitgo4j.policy.common.Amount("value", "symbol"), "data", new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId", 0))), "proxy", new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "custodianTransactionId", "txid", "pubKey", "withdrawalCredentials", "signature", "depositDataRoot", "poolKeyHash")));
    }

    @Test
    void testSetPendingApprovalId(){
        signTSSTransactionRequest.setPendingApprovalId("pendingApprovalId");
    }

    @Test
    void testSetUnsignedTxs(){
        signTSSTransactionRequest.setUnsignedTxs(
            List.of(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString", 0))));
    }

    @Test
    void testSetSignatureShares(){
        signTSSTransactionRequest.setSignatureShares(
            List.of(new SignatureShare("from", "to", "share")));
    }

    @Test
    void testSetTxHashes(){
        signTSSTransactionRequest.setTxHashes(List.of("String"));
    }

    @Test
    void testSetTransactions(){
        signTSSTransactionRequest.setTransactions(List.of(new Transaction("state", new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString", 0)), List.of(new SignatureShare("from", "to", "share")), "txHash")));
    }
}