package bitgo4j.express.request;

import bitgo4j.express.common.AddressBalance;
import bitgo4j.express.common.AddressCoinSpecific;
import bitgo4j.express.common.AddressCoinSpecificXlm;
import bitgo4j.express.common.Asset;
import bitgo4j.express.common.FeeInfo;
import bitgo4j.express.common.Keychain;
import bitgo4j.express.common.Operation;
import bitgo4j.express.common.Recipient;
import bitgo4j.express.common.TxInfoRequest;
import bitgo4j.express.common.TxPrebuild;
import bitgo4j.express.common.Unspent;
import bitgo4j.express.common.WalletAddressDetails;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SignWalletTransactionRequestTest {
    @InjectMocks
    SignWalletTransactionRequest signWalletTransactionRequest;

    @Test
    void testToString(){
        String result = signWalletTransactionRequest.toString();
        Assertions.assertEquals("SignWalletTransactionRequest[keychain=<null>,prv=<null>,txPrebuild=<null>,coldDerivationSeed=<null>,walletPassphrase=<null>,recipients=<null>]", result);
    }

    @Test
    void testSetKeychain(){
        signWalletTransactionRequest.setKeychain(new Keychain("pub", "encryptedPrv", "fromPubKey", "toPubKey", "path"));
    }

    @Test
    void testSetPrv(){
        signWalletTransactionRequest.setPrv("prv");
    }

    @Test
    void testSetTxPrebuild(){
        signWalletTransactionRequest.setTxPrebuild(new TxPrebuild("wallet", "txHex", "txBase64", new TxInfoRequest(
            List.of("String"),
            0, 0,
            0, List.of(new Unspent("id", "address", 0, "valueString", 0, "date", Boolean.TRUE, "wallet", "fromWallet",
            0, 0, "redeemScript", "witnessScript", Boolean.TRUE)), new WalletAddressDetails("id", "address",
            0,
            0, "coin",
            0, "wallet", new AddressCoinSpecific(new AddressCoinSpecificXlm("memoId", "rootAddress"), new AddressCoinSpecificXlm("memoId", "rootAddress")), new AddressBalance("updated",
            1L, "balanceString", 1L, 1L, "confirmedBalanceString", "spendableBalanceString"), "label", "addressType"),
            0, List.of(new Operation("amount", new Asset("code"), "destination", "type")), "sequence", "source"), new FeeInfo(
            0,
            0, "feeRate", 0, "payGoFeeString", 0, "xlmBaseFee", "xlmBaseReserve"), Boolean.TRUE));
    }

    @Test
    void testSetColdDerivationSeed(){
        signWalletTransactionRequest.setColdDerivationSeed("coldDerivationSeed");
    }

    @Test
    void testSetWalletPassphrase(){
        signWalletTransactionRequest.setWalletPassphrase("walletPassphrase");
    }

    @Test
    void testSetRecipients(){
        signWalletTransactionRequest.setRecipients(List.of(new Recipient("address", "amount", "data")));
    }
}