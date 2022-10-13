package bitgo4j.express.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import bitgo4j.BitGo4jConstant;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
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
