package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SignatureShareTest {
    SignatureShare signatureShare= new SignatureShare("from", "to", "share");

    @Test
    void testToString(){
        String result = signatureShare.toString();
        Assertions.assertEquals("SignatureShare[from=from,to=to,share=share]", result);
    }

    @Test
    void testSetFrom(){
        signatureShare.setFrom("from");
    }

    @Test
    void testSetTo(){
        signatureShare.setTo("to");
    }

    @Test
    void testSetShare(){
        signatureShare.setShare("share");
    }
}