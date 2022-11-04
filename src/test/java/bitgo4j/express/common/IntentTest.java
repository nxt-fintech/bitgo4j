package bitgo4j.express.common;

import bitgo4j.policy.common.TxAddress;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class IntentTest {
    @InjectMocks
    Intent intent;

    @Test
    void testToString(){
        String result = intent.toString();
        Assertions.assertEquals("Intent[nonce=<null>,memo=<null>,intentType=<null>,sequenceId=<null>,comment=<null>,stakingRequestId=<null>,stakingAddress=<null>,validatorAddress=<null>,amount=<null>,enableTokens=<null>,recipients=<null>,proxy=<null>,feeOptions=<null>,hopParams=<null>,isTss=<null>,selfSend=<null>,txid=<null>,custodianTransactionId=<null>,pubKey=<null>,withdrawalCredentials=<null>,signature=<null>,depositDataRoot=<null>,poolKeyHash=<null>]", result);
    }

    @Test
    void testSetNonce(){
        intent.setNonce("nonce");
    }

    @Test
    void testSetFee(){
        intent.setFee(new DOTFeeOptions("amount", "unit", "formula", "type"));
    }

    @Test
    void testSetMemo(){
        intent.setMemo("memo");
    }

    @Test
    void testSetIntentType(){
        intent.setIntentType("intentType");
    }

    @Test
    void testSetSequenceId(){
        intent.setSequenceId("sequenceId");
    }

    @Test
    void testSetComment(){
        intent.setComment("comment");
    }

    @Test
    void testSetStakingRequestId(){
        intent.setStakingRequestId("stakingRequestId");
    }

    @Test
    void testSetStakingAddress(){
        intent.setStakingAddress("stakingAddress");
    }

    @Test
    void testSetValidatorAddress(){
        intent.setValidatorAddress("validatorAddress");
    }

    @Test
    void testSetAmount(){
        intent.setAmount(new Amount("value", "symbol"));
    }

    @Test
    void testSetEnableTokens(){
        intent.setEnableTokens(List.of(new EnableToken("name", "address")));
    }

    @Test
    void testSetRecipients(){
        intent.setRecipients(List.of(new RecipientEntry(new TxAddress("address"), new bitgo4j.policy.common.Amount("value", "symbol"), "data", new TokenData("tokenType", "tokenQuantity", "tokenContractAddress", "tokenName", "tokenId", 0))));
    }

    @Test
    void testSetProxy(){
        intent.setProxy("proxy");
    }

    @Test
    void testSetFeeOptions(){
        intent.setFeeOptions(new FeeOptions("unit", "formula", "feeType", 0, 0, 0, 0));
    }

    @Test
    void testSetHopParams(){
        intent.setHopParams(new HopParams("paymentId", "userRegSig", 0));
    }

    @Test
    void testSetIsTss(){
        intent.setIsTss(Boolean.TRUE);
    }

    @Test
    void testSetSelfSend(){
        intent.setSelfSend(Boolean.TRUE);
    }

    @Test
    void testSetCustodianTransactionId(){
        intent.setCustodianTransactionId("custodianTransactionId");
    }

    @Test
    void testSetTxid(){
        intent.setTxid("txid");
    }

    @Test
    void testSetPubKey(){
        intent.setPubKey("pubKey");
    }

    @Test
    void testSetWithdrawalCredentials(){
        intent.setWithdrawalCredentials("withdrawalCredentials");
    }

    @Test
    void testSetSignature(){
        intent.setSignature("signature");
    }

    @Test
    void testSetDepositDataRoot(){
        intent.setDepositDataRoot("depositDataRoot");
    }

    @Test
    void testSetPoolKeyHash(){
        intent.setPoolKeyHash("poolKeyHash");
    }
}