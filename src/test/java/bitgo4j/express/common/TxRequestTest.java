package bitgo4j.express.common;

import bitgo4j.policy.common.Amount;
import bitgo4j.policy.common.EnableToken;
import bitgo4j.policy.common.FeeOptions;
import bitgo4j.policy.common.HopParams;
import bitgo4j.policy.common.RecipientEntry;
import bitgo4j.policy.common.TxAddress;
import bitgo4j.wallet.common.FeeInfo;
import bitgo4j.wallet.common.Transaction;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TxRequestTest {
    @InjectMocks
    TxRequest txRequest;

    @Test
    void testToString(){
        String result = txRequest.toString();
        Assertions.assertEquals("TxRequest[txRequestId=<null>,version=<null>,latest=<null>,walletId=<null>,walletType=<null>,enterpriseId=<null>,state=<null>,date=<null>,userId=<null>,intent=<null>,intents=<null>,pendingApprovalId=<null>,unsignedTxs=<null>,signatureShares=<null>,txHashs=<null>]", result);
    }

    @Test
    void testSetTxRequestId(){
        txRequest.setTxRequestId("txRequestId");
    }

    @Test
    void testSetVersion(){
        txRequest.setVersion(0);
    }

    @Test
    void testSetLatest(){
        txRequest.setLatest(Boolean.TRUE);
    }

    @Test
    void testSetWalletId(){
        txRequest.setWalletId("walletId");
    }

    @Test
    void testSetWalletType(){
        txRequest.setWalletType("walletType");
    }

    @Test
    void testSetEnterpriseId(){
        txRequest.setEnterpriseId("enterpriseId");
    }

    @Test
    void testSetState(){
        txRequest.setState("state");
    }

    @Test
    void testSetDate(){
        txRequest.setDate("date");
    }

    @Test
    void testSetUserId(){
        txRequest.setUserId("userId");
    }

    @Test
    void testSetIntent(){
        txRequest.setIntent(new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
            0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid"));
    }

    @Test
    void testSetIntents(){
        txRequest.setIntents(
            List.of(new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
                0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid")));
    }

    @Test
    void testSetPendingApprovalId(){
        txRequest.setPendingApprovalId("pendingApprovalId");
    }

    @Test
    void testSetUnsignedTxs(){
        txRequest.setUnsignedTxs(
            List.of(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
                0))));
    }

    @Test
    void testSetSignatureShares(){
        txRequest.setSignatureShares(List.of(new SignatureShare("from", "to", "share")));
    }

    @Test
    void testSetTxHashs(){
        txRequest.setTxHashs(List.of("String"));
    }

    @Test
    void testSetTransactions(){
        txRequest.setTransactions(List.of(new Transaction("state", new bitgo4j.wallet.common.UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0)), List.of(new bitgo4j.wallet.common.SignatureShare("from", "to", "share")), "txHash")));
    }
}