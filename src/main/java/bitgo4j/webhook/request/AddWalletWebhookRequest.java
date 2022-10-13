package bitgo4j.webhook.request;

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
public class AddWalletWebhookRequest {
  private String type;

  private Boolean allToken;

  private String url;

  private String label;

  private Integer numConfirmations;

  private Boolean listenToFailureStates;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("type", type)
        .append("allToken", allToken)
        .append("url", url)
        .append("label", label)
        .append("numConfirmations", numConfirmations)
        .append("listenToFailureStates", listenToFailureStates)
        .toString();
  }
}
