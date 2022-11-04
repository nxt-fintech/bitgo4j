package bitgo4j.express.common;

import bitgo4j.policy.common.Amount;
import bitgo4j.policy.common.EnableToken;
import bitgo4j.policy.common.FeeOptions;
import bitgo4j.policy.common.HopParams;
import bitgo4j.policy.common.RecipientEntry;
import bitgo4j.policy.common.TxAddress;
import bitgo4j.wallet.common.FeeInfo;
import bitgo4j.wallet.common.Intent;
import bitgo4j.wallet.common.SignatureShare;
import bitgo4j.wallet.common.Transaction;
import bitgo4j.wallet.common.TxRequest;
import bitgo4j.wallet.common.UnsignedTransaction;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionRequestFullTest {
    @InjectMocks
    TransactionRequestFull transactionRequestFull;

    @Test
    void testToString(){
        String result = transactionRequestFull.toString();
        Assertions.assertEquals("TransactionRequestFull[txRequestId=<null>,policyUniquId=<null>,verificationItems=<null>,verificationRuleId=<null>,videoApprovers=<null>,walletRebalanceEventId=<null>,txRequest=<null>]", result);
    }

    @Test
    void testSetTxRequestId(){
        transactionRequestFull.setTxRequestId("txRequestId");
    }

    @Test
    void testSetPolicyUniquId(){
        transactionRequestFull.setPolicyUniquId("policyUniquId");
    }

    @Test
    void testSetVerificationItems(){
        transactionRequestFull.setVerificationItems(List.of("String"));
    }

    @Test
    void testSetVerificationRuleId(){
        transactionRequestFull.setVerificationRuleId("verificationRuleId");
    }

    @Test
    void testSetVideoApprovers(){
        transactionRequestFull.setVideoApprovers(List.of("String"));
    }

    @Test
    void testSetWalletRebalanceEventId(){
        transactionRequestFull.setWalletRebalanceEventId("walletRebalanceEventId");
    }

    @Test
    void testSetTxRequest(){
        transactionRequestFull.setTxRequest(new TxRequest("txRequestId", 0, Boolean.TRUE, "walletId", "walletType", "enterpriseId", "state", "date", "userId", new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
            0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid"), List.of(new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
            0,
            0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid")), "pendingApprovalId", List.of(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0))), List.of(new SignatureShare("from", "to", "share")), List.of("String"), List.of(new Transaction("state", new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0)), List.of(new SignatureShare("from", "to", "share")), "txHash"))));
    }
}