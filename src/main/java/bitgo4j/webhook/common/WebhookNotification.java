package bitgo4j.webhook.common;

import bitgo4j.BitGo4jConstant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class WebhookNotification {
  private String wallet;

  private String transfer;

  private String hash;

  private String id;

  private String webhook;

  private String updateAt;

  private String coin;

  private String type;

  private String url;

  private Long version;

  private String state;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("wallet", wallet)
        .append("transfer", transfer)
        .append("hash", hash)
        .append("id", id)
        .append("webhook", webhook)
        .append("updateAt", updateAt)
        .append("coin", coin)
        .append("type", type)
        .append("url", url)
        .append("version", version)
        .append("state", state)
        .toString();
  }
}
