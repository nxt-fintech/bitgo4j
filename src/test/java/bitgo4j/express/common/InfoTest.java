package bitgo4j.express.common;

import bitgo4j.policy.common.Amount;
import bitgo4j.policy.common.EnableToken;
import bitgo4j.policy.common.FeeOptions;
import bitgo4j.policy.common.HopParams;
import bitgo4j.policy.common.Recipient;
import bitgo4j.policy.common.RecipientEntry;
import bitgo4j.policy.common.TxAddress;
import bitgo4j.wallet.common.Action;
import bitgo4j.wallet.common.Condition;
import bitgo4j.wallet.common.EnterpriseModificationResponse;
import bitgo4j.wallet.common.Entry;
import bitgo4j.wallet.common.FeeInfo;
import bitgo4j.wallet.common.Intent;
import bitgo4j.wallet.common.MetaData;
import bitgo4j.wallet.common.PolicyRuleRequest;
import bitgo4j.wallet.common.SignatureShare;
import bitgo4j.wallet.common.Transaction;
import bitgo4j.wallet.common.TransactionRequest;
import bitgo4j.wallet.common.TransactionRequestFull;
import bitgo4j.wallet.common.TxRequest;
import bitgo4j.wallet.common.UnsignedTransaction;
import bitgo4j.wallet.common.Update;
import bitgo4j.wallet.common.UpdateApprovalRequiredRequest;
import bitgo4j.wallet.common.UpdateEnterpriseRequest;
import bitgo4j.wallet.common.UserChangeRequest;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InfoTest {
    @InjectMocks
    Info info;

    @Test
    void testToString(){
        String result = info.toString();
        Assertions.assertEquals("Info[type=<null>,transactionRequest=<null>,transactionRequestFull=<null>,userChangeRequest=<null>,policyRuleRequest=<null>,updateApprovalRequiredRequest=<null>,enterpriseModificationResponse=<null>]", result);
    }

    @Test
    void testSetType(){
        info.setType("type");
    }

    @Test
    void testSetTransactionRequest(){
        info.setTransactionRequest(new TransactionRequest("comment", "fee", Boolean.TRUE, List.of(new Recipient("address", "amount", "data")), "requestedAmount", "sourceWallet", "triggeredPolicy", "validTransaction", "validTransactionHash"));
    }

    @Test
    void testSetTransactionRequestFull(){
        info.setTransactionRequestFull(new TransactionRequestFull("txRequestId", "policyUniquId", List.of("String"), "verificationRuleId", List.of("String"), "walletRebalanceEventId", new TxRequest("txRequestId",
            0, Boolean.TRUE, "walletId", "walletType", "enterpriseId", "state", "date", "userId", new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
            0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid"), List.of(new Intent("nonce", "memo", "intentType", "sequenceId", "comment", "stakingRequestId", "stakingAddress", new Amount("value", "symbol"), List.of(new EnableToken("name", "address")), List.of(new RecipientEntry(new TxAddress("address"), new Amount("value", "symbol"), "data")), "proxy", new FeeOptions("unit", "formula", "feeType",
            0, 0), new HopParams("paymentId", "userRegSig", 0), Boolean.TRUE, Boolean.TRUE, "txid")), "pendingApprovalId", List.of(new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0))), List.of(new SignatureShare("from", "to", "share")), List.of("String"), List.of(new Transaction("state", new UnsignedTransaction("serializedTxHex", "signableHex", "derivationPath", new FeeInfo("feeString",
            0)), List.of(new SignatureShare("from", "to", "share")), "txHash")))));
    }

    @Test
    void testSetUserChangeRequest(){
        info.setUserChangeRequest(new UserChangeRequest("action", "permissions", "userChanged"));
    }

    @Test
    void testSetPolicyRuleRequest(){
        info.setPolicyRuleRequest(new PolicyRuleRequest("action", new Update(new Action("type", 1L, List.of("String")), "coin", new Condition("amountString",
            0, List.of("String"), List.of("String"), List.of("String"), List.of(new Entry("item", new MetaData("label", "owner", "propertyName"), "type")), "url"), "id", "type")));
    }

    @Test
    void testSetUpdateApprovalRequiredRequest(){
        info.setUpdateApprovalRequiredRequest(new UpdateApprovalRequiredRequest(0));
    }

    @Test
    void testSetEnterpriseModificationResponse(){
        info.setEnterpriseModificationResponse(new EnterpriseModificationResponse("action", new UpdateEnterpriseRequest("type", "action", "permission", "userId", "email")));
    }
}