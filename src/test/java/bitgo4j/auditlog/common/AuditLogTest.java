package bitgo4j.auditlog.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuditLogTest {
  AuditLog auditLog =
      new AuditLog(
          "coin", "date", "enterpriseId", "id", "ip", "target", "type", "user", "walletId");

  @Test
  void testToString() {
    String result = auditLog.toString();
    Assertions.assertEquals(
        "AuditLog[coin=coin,date=date,enterpriseId=enterpriseId,id=id,ip=ip,target=target,type=type,user=user,walletId=walletId]",
        result);
  }

  @Test
  void testSetCoin() {
    auditLog.setCoin("coin");
  }

  @Test
  void testSetDate() {
    auditLog.setDate("date");
  }

  @Test
  void testSetEnterpriseId() {
    auditLog.setEnterpriseId("enterpriseId");
  }

  @Test
  void testSetId() {
    auditLog.setId("id");
  }

  @Test
  void testSetIp() {
    auditLog.setIp("ip");
  }

  @Test
  void testSetTarget() {
    auditLog.setTarget("target");
  }

  @Test
  void testSetType() {
    auditLog.setType("type");
  }

  @Test
  void testSetUser() {
    auditLog.setUser("user");
  }

  @Test
  void testSetWalletId() {
    auditLog.setWalletId("walletId");
  }
}
