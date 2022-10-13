package bitgo4j.webhook.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import bitgo4j.BitGo4jConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletWebhookResponse {
  private Boolean allToken;

  private String id;

  private String label;

  private String created;

  private String coin;

  private String type;

  private String url;

  private Long version;

  private Long numConfirmations;

  private String state;

  private String lastAttempt;

  private String failingSince;

  private Long successiveFailedAttempts;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("allToken", allToken)
        .append("id", id)
        .append("label", label)
        .append("created", created)
        .append("coin", coin)
        .append("type", type)
        .append("url", url)
        .append("version", version)
        .append("numConfirmations", numConfirmations)
        .append("state", state)
        .append("lastAttempt", lastAttempt)
        .append("failingSince", failingSince)
        .append("successiveFailedAttempts", successiveFailedAttempts)
        .toString();
  }
}
