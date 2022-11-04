package bitgo4j.express.request;

import bitgo4j.express.common.Eip1559;
import bitgo4j.express.common.FunctionArg;
import bitgo4j.express.common.Memo;
import bitgo4j.express.common.RefundOptions;
import bitgo4j.express.common.Reservation;
import bitgo4j.express.common.StakingOptions;
import bitgo4j.express.common.Trustline;
import bitgo4j.express.common.UnstakingOptions;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SendTransactionRequestTest {
    @InjectMocks
    SendTransactionRequest sendTransactionRequest;


    @Test
    void testToString(){
        String result = sendTransactionRequest.toString();
        Assertions.assertEquals("SendTransactionRequest[address=<null>,amount=<null>,walletPassphrase=<null>,prv=<null>,numBlocks=<null>,feeRate=<null>,maxFeeRate=<null>,minConfirms=<null>,enforceMinConfirmsForChange=<null>,gasPrice=<null>,eip1559=<null>,gasLimit=<null>,targetWalletUnspents=<null>,minValue=<null>,maxValue=<null>,sequenceId=<null>,noSplitChange=<null>,unspents=<null>,changeAddress=<null>,instant=<null>,memo=<null>,comment=<null>,addressType=<null>,startTime=<null>,consolidateId=<null>,lastLedgerSequence=<null>,ledgerSequenceDelta=<null>,cpfpTxIds=<null>,cpfpFeeRate=<null>,maxFee=<null>,strategy=<null>,validFromBlock=<null>,validToBlock=<null>,type=<null>,trustlines=<null>,stakingOptions=<null>,unstakingOptions=<null>,refundOptions=<null>,messageKey=<null>,reservation=<null>,data=<null>,hop=<null>]", result);
    }

    @Test
    void testSetAddress(){
        sendTransactionRequest.setAddress("address");
    }

    @Test
    void testSetAmount(){
        sendTransactionRequest.setAmount("amount");
    }

    @Test
    void testSetWalletPassphrase(){
        sendTransactionRequest.setWalletPassphrase("walletPassphrase");
    }

    @Test
    void testSetPrv(){
        sendTransactionRequest.setPrv("prv");
    }

    @Test
    void testSetNumBlocks(){
        sendTransactionRequest.setNumBlocks(0);
    }

    @Test
    void testSetFeeRate(){
        sendTransactionRequest.setFeeRate("feeRate");
    }

    @Test
    void testSetMaxFeeRate(){
        sendTransactionRequest.setMaxFeeRate("maxFeeRate");
    }

    @Test
    void testSetFeeMultiplier(){
        sendTransactionRequest.setFeeMultiplier("feeMultiplier");
    }

    @Test
    void testSetMinConfirms(){
        sendTransactionRequest.setMinConfirms(0);
    }

    @Test
    void testSetEnforceMinConfirmsForChange(){
        sendTransactionRequest.setEnforceMinConfirmsForChange(Boolean.TRUE);
    }

    @Test
    void testSetGasPrice(){
        sendTransactionRequest.setGasPrice("gasPrice");
    }

    @Test
    void testSetEip1559(){
        sendTransactionRequest.setEip1559(new Eip1559("maxPriorityFeePerGas", "maxFeePerGas"));
    }

    @Test
    void testSetGasLimit(){
        sendTransactionRequest.setGasLimit("gasLimit");
    }

    @Test
    void testSetTargetWalletUnspents(){
        sendTransactionRequest.setTargetWalletUnspents(0);
    }

    @Test
    void testSetMinValue(){
        sendTransactionRequest.setMinValue("minValue");
    }

    @Test
    void testSetMaxValue(){
        sendTransactionRequest.setMaxValue("maxValue");
    }

    @Test
    void testSetSequenceId(){
        sendTransactionRequest.setSequenceId("sequenceId");
    }

    @Test
    void testSetNonce(){
        sendTransactionRequest.setNonce("nonce");
    }

    @Test
    void testSetNoSplitChange(){
        sendTransactionRequest.setNoSplitChange(Boolean.TRUE);
    }

    @Test
    void testSetUnspents(){
        sendTransactionRequest.setUnspents(List.of("String"));
    }

    @Test
    void testSetChangeAddress(){
        sendTransactionRequest.setChangeAddress("changeAddress");
    }

    @Test
    void testSetInstant(){
        sendTransactionRequest.setInstant(Boolean.TRUE);
    }

    @Test
    void testSetMemo(){
        sendTransactionRequest.setMemo(new Memo("type", "value"));
    }

    @Test
    void testSetComment(){
        sendTransactionRequest.setComment("comment");
    }

    @Test
    void testSetAddressType(){
        sendTransactionRequest.setAddressType("addressType");
    }

    @Test
    void testSetStartTime(){
        sendTransactionRequest.setStartTime("startTime");
    }

    @Test
    void testSetConsolidateId(){
        sendTransactionRequest.setConsolidateId("consolidateId");
    }

    @Test
    void testSetLastLedgerSequence(){
        sendTransactionRequest.setLastLedgerSequence(0);
    }

    @Test
    void testSetLedgerSequenceDelta(){
        sendTransactionRequest.setLedgerSequenceDelta(0);
    }

    @Test
    void testSetCpfpTxIds(){
        sendTransactionRequest.setCpfpTxIds(List.of("String"));
    }

    @Test
    void testSetCpfpFeeRate(){
        sendTransactionRequest.setCpfpFeeRate(0);
    }

    @Test
    void testSetMaxFee(){
        sendTransactionRequest.setMaxFee(0);
    }

    @Test
    void testSetStrategy(){
        sendTransactionRequest.setStrategy("strategy");
    }

    @Test
    void testSetValidFromBlock(){
        sendTransactionRequest.setValidFromBlock(0);
    }

    @Test
    void testSetValidToBlock(){
        sendTransactionRequest.setValidToBlock(0);
    }

    @Test
    void testSetType(){
        sendTransactionRequest.setType("type");
    }

    @Test
    void testSetTrustlines(){
        sendTransactionRequest.setTrustlines(List.of(new Trustline("token", "action", "limit")));
    }

    @Test
    void testSetStakingOptions(){
        sendTransactionRequest.setStakingOptions(new StakingOptions("amount", "validator", "contractName", "functionName", List.of(new FunctionArg("type", "val"))));
    }

    @Test
    void testSetUnstakingOptions(){
        sendTransactionRequest.setUnstakingOptions(new UnstakingOptions("from", "receiver", "unstakeCpuQuantity", "unstakeNetQuantity"));
    }

    @Test
    void testSetRefundOptions(){
        sendTransactionRequest.setRefundOptions(new RefundOptions("address"));
    }

    @Test
    void testSetMessageKey(){
        sendTransactionRequest.setMessageKey("messageKey");
    }

    @Test
    void testSetReservation(){
        sendTransactionRequest.setReservation(new Reservation("expireTime"));
    }

    @Test
    void testSetData(){
        sendTransactionRequest.setData("data");
    }

    @Test
    void testSetHop(){
        sendTransactionRequest.setHop(Boolean.TRUE);
    }
}