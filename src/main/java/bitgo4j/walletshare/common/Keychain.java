package bitgo4j.walletshare.common;

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
public class Keychain {
  private String pub;

  private String encryptedPrv;

  private String fromPubKey;

  private String toPubKey;

  private String path;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("pub", pub)
        .append("encryptedPrv", encryptedPrv)
        .append("fromPubKey", fromPubKey)
        .append("toPubKey", toPubKey)
        .append("path", path)
        .toString();
  }
}
