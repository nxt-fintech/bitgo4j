package bitgo4j.key.response;

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
public class KeyResponse {
  private String encryptedPrv;

  private String id;

  private Boolean isBitGo;

  private String source;

  private String type;

  // Key
  private String ethAddress;

  private String pub;

  // KeyTSS
  private String commonKeyChain;

  private String commonPub;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BitGo4jConstant.TO_STRING_BUILDER_STYLE)
        .append("encryptedPrv", encryptedPrv)
        .append("id", id)
        .append("isBitGo", isBitGo)
        .append("source", source)
        .append("type", type)
        .append("ethAddress", ethAddress)
        .append("pub", pub)
        .append("commonKeyChain", commonKeyChain)
        .append("commonPub", commonPub)
        .toString();
  }
}
