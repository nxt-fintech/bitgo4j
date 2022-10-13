package bitgo4j;

import bitgo4j.address.AddressClientImpl;
import bitgo4j.auditlog.AuditLogClientImpl;
import bitgo4j.enterprise.EnterpriseClientImpl;
import bitgo4j.express.ExpressClientImpl;
import bitgo4j.federation.FederationClientImpl;
import bitgo4j.key.KeyClientImpl;
import bitgo4j.pendingapproval.PendingApprovalClientImpl;
import bitgo4j.ping.PingClientImpl;
import bitgo4j.policy.PolicyClientImpl;
import bitgo4j.sendlabel.SendLabelClientImpl;
import bitgo4j.transactionrequest.TransactionRequestClientImpl;
import bitgo4j.transfer.TransferClientImpl;
import bitgo4j.user.UserClientImpl;
import bitgo4j.wallet.WalletClientImpl;
import bitgo4j.walletshare.WalletShareClientImpl;
import bitgo4j.webhook.WebhookClientImpl;

public class BitGo4j {
  private static BitGo4j INSTANCE;

  private BitGo4jConfig config;

  private BitGo4j() {
  }

  public void initialize(BitGo4jConfig config) {
    this.config = config;
  }

  public static BitGo4j api() {
    if (INSTANCE == null) {
      INSTANCE = new BitGo4j();
    }
    return INSTANCE;
  }

  public AddressClientImpl address() {
    return new AddressClientImpl(config);
  }

  public AuditLogClientImpl auditLog() {
    return new AuditLogClientImpl(config);
  }

  public EnterpriseClientImpl enterprise() {
    return new EnterpriseClientImpl(config);
  }

  public ExpressClientImpl express() {
    return new ExpressClientImpl(config);
  }

  public FederationClientImpl federation() {
    return new FederationClientImpl(config);
  }

  public KeyClientImpl key() {
    return new KeyClientImpl(config);
  }

  public PendingApprovalClientImpl pendingApproval() {
    return new PendingApprovalClientImpl(config);
  }

  public PingClientImpl ping() {
    return new PingClientImpl(config);
  }

  public PolicyClientImpl policy() {
    return new PolicyClientImpl(config);
  }

  public SendLabelClientImpl sendLabel() {
    return new SendLabelClientImpl(config);
  }

  public TransactionRequestClientImpl transactionRequest() {
    return new TransactionRequestClientImpl(config);
  }

  public TransferClientImpl transfer() {
    return new TransferClientImpl(config);
  }

  public UserClientImpl user() {
    return new UserClientImpl(config);
  }

  public WalletClientImpl wallet() {
    return new WalletClientImpl(config);
  }

  public WalletShareClientImpl walletShare() {
    return new WalletShareClientImpl(config);
  }

  public WebhookClientImpl webhook() {
    return new WebhookClientImpl(config);
  }
}
