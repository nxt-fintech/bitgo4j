package bitgo4j.wallet.request;

import bitgo4j.wallet.common.Eip1559;
import bitgo4j.wallet.common.FunctionArg;
import bitgo4j.wallet.common.Memo;
import bitgo4j.wallet.common.Recipient;
import bitgo4j.wallet.common.RefundOptions;
import bitgo4j.wallet.common.Reservation;
import bitgo4j.wallet.common.StakingOptions;
import bitgo4j.wallet.common.Trustline;
import bitgo4j.wallet.common.UnstakingOptions;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class BuildTransactionRequestTest {
    @InjectMocks
    BuildTransactionRequest buildTransactionRequest;
    @Test
    void testToString(){
        String result = buildTransactionRequest.toString();
        Assertions.assertEquals("BuildTransactionRequest[numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,feeMultiplier=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=<null>,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,sequenceId=<null>,nonce=<null>,noSplitChange=<null>,unspents=<null>,changeAddress=<null>,instant=<null>,memo=<null>,comment=<null>,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=<null>,cpfpFeeRate=<null>,maxFee=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=<null>,stakingOptions=<null>,unstakingOptions=<null>,refundOptions=<null>,messageKey=<null>,reservation=<null>,recipients=<null>]", result);
    }

    @Test
    void testSetNumBlocks(){
        buildTransactionRequest.setNumBlocks(0);
    }

    @Test
    void testSetFeeRate(){
        buildTransactionRequest.setFeeRate("feeRate");
    }

    @Test
    void testSetMaxFeeRate(){
        buildTransactionRequest.setMaxFeeRate("maxFeeRate");
    }

    @Test
    void testSetFeeMultiplier(){
        buildTransactionRequest.setFeeMultiplier("feeMultiplier");
    }

    @Test
    void testSetMinConfirms(){
        buildTransactionRequest.setMinConfirms(0);
    }

    @Test
    void testSetEnforceMinConfirmsForChange(){
        buildTransactionRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
    }

    @Test
    void testSetGasPrice(){
        buildTransactionRequest.setGasPrice("gasPrice");
    }

    @Test
    void testSetEip1559(){
        buildTransactionRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
    }

    @Test
    void testSetGasLimit(){
        buildTransactionRequest.setGasLimit("gasLimit");
    }

    @Test
    void testSetTargetWalletUnspents(){
        buildTransactionRequest.setTargetWalletUnspents(0);
    }

    @Test
    void testSetMinValue(){
        buildTransactionRequest.setMinValue("minValue");
    }

    @Test
    void testSetMaxValue(){
        buildTransactionRequest.setMaxValue("maxValue");
    }

    @Test
    void testSetSequenceId(){
        buildTransactionRequest.setSequenceId("sequenceId");
    }

    @Test
    void testSetNonce(){
        buildTransactionRequest.setNonce("nonce");
    }

    @Test
    void testSetNoSplitChange(){
        buildTransactionRequest.setNoSplitChange(Boolean.TRUE);
    }

    @Test
    void testSetUnspents(){
        buildTransactionRequest.setUnspents(List.of("String"));
    }

    @Test
    void testSetChangeAddress(){
        buildTransactionRequest.setChangeAddress("changeAddress");
    }

    @Test
    void testSetInstant(){
        buildTransactionRequest.setInstant(Boolean.TRUE);
    }

    @Test
    void testSetMemo(){
        buildTransactionRequest.setMemo(new Memo("type", "value"));
    }

    @Test
    void testSetComment(){
        buildTransactionRequest.setComment("comment");
    }

    @Test
    void testSetAddressType(){
        buildTransactionRequest.setAddressType("addressType");
    }

    @Test
    void testSetStartTime(){
        buildTransactionRequest.setStartTime("startTime");
    }

    @Test
    void testSetConsolidateId(){
        buildTransactionRequest.setConsolidateId("consolidateId");
    }

    @Test
    void testSetLastLedgerSequence(){
        buildTransactionRequest.setLastLedgerSequence(0);
    }

    @Test
    void testSetLedgerSequenceDelta(){
        buildTransactionRequest.setLedgerSequenceDelta(0);
    }

    @Test
    void testSetCpfpTxIds(){
        buildTransactionRequest.setCpfpTxIds(List.of("String"));
    }

    @Test
    void testSetCpfpFeeRate(){
        buildTransactionRequest.setCpfpFeeRate(0);
    }

    @Test
    void testSetMaxFee(){
        buildTransactionRequest.setMaxFee(0);
    }

    @Test
    void testSetStrategy(){
        buildTransactionRequest.setStrategy("strategy");
    }

    @Test
    void testSetValidFromBlock(){
        buildTransactionRequest.setValidFromBlock(0);
    }

    @Test
    void testSetValidToBlock(){
        buildTransactionRequest.setValidToBlock(0);
    }

    @Test
    void testSetType(){
        buildTransactionRequest.setType("type");
    }

    @Test
    void testSetTrustlines(){
        buildTransactionRequest.setTrustlines(List.of(new Trustline("token", "action", "limit")));
    }

    @Test
    void testSetStakingOptions(){
        buildTransactionRequest.setStakingOptions(new StakingOptions(0, "validator", "contractName", "functionName", List.of(new FunctionArg("type", "val"))));
    }

    @Test
    void testSetUnstakingOptions(){
        buildTransactionRequest.setUnstakingOptions(new UnstakingOptions("from", "receiver", "unstakeCpuQuantity", "unstakeNetQuantity"));
    }

    @Test
    void testSetRefundOptions(){
        buildTransactionRequest.setRefundOptions(new RefundOptions("address"));
    }

    @Test
    void testSetMessageKey(){
        buildTransactionRequest.setMessageKey("messageKey");
    }

    @Test
    void testSetReservation(){
        buildTransactionRequest.setReservation(new Reservation("expireTime"));
    }

    @Test
    void testSetRecipients(){
        buildTransactionRequest.setRecipients(
            List.of(new Recipient("amount", "address", new Memo("type", "value"))));
    }
}