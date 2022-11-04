package bitgo4j.express.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class KeySignaturesTest {
    KeySignatures keySignatures= new KeySignatures("backupPub", "bitgoPub");

    @Test
    void testToString(){
        String result = keySignatures.toString();
        Assertions.assertEquals("KeySignatures[backupPub=backupPub,bitgoPub=bitgoPub]", result);
    }

    @Test
    void testSetBackupPub(){
        keySignatures.setBackupPub("backupPub");
    }

    @Test
    void testSetBitgoPub(){
        keySignatures.setBitgoPub("bitgoPub");
    }
}