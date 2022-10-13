package bitgo4j.enterprise.response;

import bitgo4j.enterprise.common.Action;
import bitgo4j.enterprise.common.AdditionalEnterpriseInfo;
import bitgo4j.enterprise.common.Admin;
import bitgo4j.enterprise.common.Condition;
import bitgo4j.enterprise.common.Contact;
import bitgo4j.enterprise.common.Entry;
import bitgo4j.enterprise.common.Freeze;
import bitgo4j.enterprise.common.Info;
import bitgo4j.enterprise.common.MetaData;
import bitgo4j.enterprise.common.Policy;
import bitgo4j.enterprise.common.PolicyRule;
import bitgo4j.enterprise.common.UpdateApprovalsRequiredRequest;
import bitgo4j.enterprise.common.UpdateEnterpriseRequest;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnterpriseResponseTest {
  @InjectMocks EnterpriseResponse enterpriseResponse;

  @Test
  void testToString() {
    String result = enterpriseResponse.toString();
    Assertions.assertEquals(
        "EnterpriseResponse[admin=<null>,approvalsRequired=<null>,bitgoEthKey=<null>,bitgoOrg=<null>,canAccessBorrowing=<null>,canAccessLending=<null>,canAccessSettlement=<null>,canAccessTrading=<null>,canCreateColdWallet=<null>,canCreateCustodialWallets=<null>,canCreateHotWallet=<null>,canCreateOffchainWallet=<null>,emergencyPhone=<null>,ethFeeAddress=<null>,freeze=<null>,id=<null>,kycState=<null>,latestSAVersionSigned=<null>,mutablePolicyWindow=<null>,name=<null>,pricingPlan=<null>,primaryContact=<null>,usersViewAllWallets=<null>,videoIdWaived=<null>,wallets=<null>,bitcoinAddress=<null>,enterprise=<null>,walletId=<null>,creator=<null>,createDate=<null>,info=<null>,state=<null>,walletUserIds=<null>]",
        result);
  }

  @Test
  void testSetAdditionalEnterpriseInfo() {
    enterpriseResponse.setAdditionalEnterpriseInfo(
        new AdditionalEnterpriseInfo(
            "regulator",
            "regulatorId",
            new Contact(
                "name", "street", "street2", "suite", "city", "state", "postalCode", "country")));
  }

  @Test
  void testSetAdmin() {
    enterpriseResponse.setAdmin(
        new Admin(
            new Policy(
                "id",
                "date",
                "label",
                List.of(
                    new PolicyRule(
                        "id",
                        "lockDate",
                        "mutabilityConstraint",
                        "coin",
                        "type",
                        new Condition(
                            "amountString",
                            0,
                            List.of("String"),
                            List.of("String"),
                            List.of("String"),
                            List.of(new Entry("item", new MetaData("label", "owner"), "type"))),
                        new Action("type", 0L, List.of("String")))),
                0L)));
  }

  @Test
  void testSetApprovalsRequired() {
    enterpriseResponse.setApprovalsRequired(0L);
  }

  @Test
  void testSetBitgoEthKey() {
    enterpriseResponse.setBitgoEthKey("bitgoEthKey");
  }

  @Test
  void testSetBitgoOrg() {
    enterpriseResponse.setBitgoOrg("bitgoOrg");
  }

  @Test
  void testSetCanAccessBorrowing() {
    enterpriseResponse.setCanAccessBorrowing(Boolean.TRUE);
  }

  @Test
  void testSetCanAccessLending() {
    enterpriseResponse.setCanAccessLending(Boolean.TRUE);
  }

  @Test
  void testSetCanAccessSettlement() {
    enterpriseResponse.setCanAccessSettlement(Boolean.TRUE);
  }

  @Test
  void testSetCanAccessTrading() {
    enterpriseResponse.setCanAccessTrading(Boolean.TRUE);
  }

  @Test
  void testSetCanCreateColdWallet() {
    enterpriseResponse.setCanCreateColdWallet(Boolean.TRUE);
  }

  @Test
  void testSetCanCreateCustodialWallets() {
    enterpriseResponse.setCanCreateCustodialWallets(Boolean.TRUE);
  }

  @Test
  void testSetCanCreateHotWallet() {
    enterpriseResponse.setCanCreateHotWallet(Boolean.TRUE);
  }

  @Test
  void testSetCanCreateOffchainWallet() {
    enterpriseResponse.setCanCreateOffchainWallet(Boolean.TRUE);
  }

  @Test
  void testSetEmergencyPhone() {
    enterpriseResponse.setEmergencyPhone("emergencyPhone");
  }

  @Test
  void testSetEthFeeAddress() {
    enterpriseResponse.setEthFeeAddress("ethFeeAddress");
  }

  @Test
  void testSetFreeze() {
    enterpriseResponse.setFreeze(new Freeze("time", "expires"));
  }

  @Test
  void testSetId() {
    enterpriseResponse.setId("id");
  }

  @Test
  void testSetKycState() {
    enterpriseResponse.setKycState("kycState");
  }

  @Test
  void testSetLatestSAVersionSigned() {
    enterpriseResponse.setLatestSAVersionSigned(0L);
  }

  //  @Test
  //  void testSetLicenses() {
  //    enterpriseResponse.setLicenses("licenses");
  //  }

  @Test
  void testSetMutablePolicyWindow() {
    enterpriseResponse.setMutablePolicyWindow(0L);
  }

  @Test
  void testSetName() {
    enterpriseResponse.setName("name");
  }

  @Test
  void testSetPricingPlan() {
    enterpriseResponse.setPricingPlan("pricingPlan");
  }

  @Test
  void testSetPrimaryContact() {
    enterpriseResponse.setPrimaryContact("primaryContact");
  }

  @Test
  void testSetUsersViewAllWallets() {
    enterpriseResponse.setUsersViewAllWallets(Boolean.TRUE);
  }

  @Test
  void testSetVideoIdWaived() {
    enterpriseResponse.setVideoIdWaived(Boolean.TRUE);
  }

  //  @Test
  //  void testSetTags() {
  //    enterpriseResponse.setTags(List.of(new Tag("name", "id")));
  //  }

  @Test
  void testSetWallets() {
    enterpriseResponse.setWallets(List.of("String"));
  }

  @Test
  void testSetBitcoinAddress() {
    enterpriseResponse.setBitcoinAddress("bitcoinAddress");
  }

  @Test
  void testSetEnterprise() {
    enterpriseResponse.setEnterprise("enterprise");
  }

  @Test
  void testSetWalletId() {
    enterpriseResponse.setWalletId("walletId");
  }

  @Test
  void testSetCreator() {
    enterpriseResponse.setCreator("creator");
  }

  @Test
  void testSetCreateDate() {
    enterpriseResponse.setCreateDate("createDate");
  }

  @Test
  void testSetInfo() {
    enterpriseResponse.setInfo(
        new Info(
            "type",
            new UpdateEnterpriseRequest("action", List.of("String"), "userId", "email"),
            new UpdateApprovalsRequiredRequest(0L)));
  }

  @Test
  void testSetState() {
    enterpriseResponse.setState("state");
  }

  @Test
  void testSetWalletUserIds() {
    enterpriseResponse.setWalletUserIds(List.of("String"));
  }
}
