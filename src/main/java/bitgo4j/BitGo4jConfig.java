package bitgo4j;

public class BitGo4jConfig {
  private final String token;

  private final Boolean useTest;

  private final Boolean useProd;

  private final Boolean useDocker;

  private BitGo4jConfig(Builder builder) {
    token = builder.token;
    useTest = builder.useTest;
    useProd = builder.useProd;
    useDocker = builder.useDocker;
  }

  public String getToken() {
    return token;
  }

  public String getDomain() {
    if (!useDocker && useTest) {
      return "api.bitgo-test.com";
    } else if (!useDocker && useProd) {
      return "api.bitgo.com";
    } else if (useDocker) {
      return "localhost:4000";
    } else {
      return "localhost:4040";
    }
  }

  public String getUrl() {
    String domain = getDomain();
    if ((!useDocker && useTest) || useProd) {
      return String.format("https://%s", domain);
    } else {
      return String.format("http://%s", domain);
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String token;

    private Boolean useTest = false;

    private Boolean useProd = false;

    private Boolean useDocker = false;

    public Builder token(String token) {
      this.token = token;
      return this;
    }

    public Builder useTest() {
      useTest = true;
      return this;
    }

    public Builder useProd() {
      useProd = true;
      return this;
    }

    public Builder useDocker() {
      useDocker = true;
      return this;
    }

    public BitGo4jConfig build() {
      return new BitGo4jConfig(this);
    }
  }
}