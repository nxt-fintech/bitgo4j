package bitgo4j.express.common;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TxPrebuildTest {
    @InjectMocks
    TxPrebuild txPrebuild;


    @Test
    void testToString(){
        String result = txPrebuild.toString();
        Assertions.assertEquals("TxPrebuild[wallet=<null>,txHex=<null>,txBase64=<null>,txInfo=<null>,feeInfo=<null>,isLastSignature=<null>]", result);
    }

    @Test
    void testSetWallet(){
        txPrebuild.setWallet("wallet");
    }

    @Test
    void testSetTxHex(){
        txPrebuild.setTxHex("txHex");
    }

    @Test
    void testSetTxBase64(){
        txPrebuild.setTxBase64("txBase64");
    }

    @Test
    void testSetTxInfo(){
        txPrebuild.setTxInfo(new TxInfoRequest(List.of("String"), 0, 0, 0, List.of(new Unspent("id", "address", 0, "valueString", 0, "date", Boolean.TRUE, "wallet", "fromWallet", 0, 0, "redeemScript", "witnessScript", Boolean.TRUE)), new WalletAddressDetails("id", "address", 0, 0, "coin", 0, "wallet", new AddressCoinSpecific(new AddressCoinSpecificXlm("memoId", "rootAddress"), new AddressCoinSpecificXlm("memoId", "rootAddress")), new AddressBalance("updated",
            1L, "balanceString", 1L, 1L, "confirmedBalanceString", "spendableBalanceString"), "label", "addressType"), 0, List.of(new Operation("amount", new Asset("code"), "destination", "type")), "sequence", "source"));
    }

    @Test
    void testSetFeeInfo(){
        txPrebuild.setFeeInfo(new FeeInfo("feeString", 0, 0, "feeRate", 0, "payGoFeeString", 0, "xlmBaseFee", "xlmBaseReserve"));
    }

    @Test
    void testSetIsLastSignature(){
        txPrebuild.setIsLastSignature(Boolean.TRUE);
    }
}