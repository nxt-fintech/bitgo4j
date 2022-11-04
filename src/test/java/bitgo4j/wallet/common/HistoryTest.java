package bitgo4j.wallet.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class HistoryTest {
    History history= new History("date", "user", "action", "comment");

    @Test
    void testToString(){
        String result = history.toString();
        Assertions.assertEquals("History[date=date,user=user,action=action,comment=comment]", result);
    }

    @Test
    void testSetDate(){
        history.setDate("date");
    }

    @Test
    void testSetUser(){
        history.setUser("user");
    }

    @Test
    void testSetAction(){
        history.setAction("action");
    }

    @Test
    void testSetComment(){
        history.setComment("comment");
    }
}