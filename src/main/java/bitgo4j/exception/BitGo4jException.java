package bitgo4j.exception;

import bitgo4j.BitGo4jError;

public class BitGo4jException extends RuntimeException {
  private final BitGo4jError bitGo4jError;

  public BitGo4jException(BitGo4jError bitGo4jError) {
    this.bitGo4jError = bitGo4jError;
  }

  public BitGo4jException(Throwable cause) {
    super(cause);
    bitGo4jError = null;
  }

  public BitGo4jError getError() {
    return bitGo4jError;
  }

  @Override
  public String getMessage() {
    if (bitGo4jError != null) {
      return bitGo4jError.toString();
    } else {
      return super.getMessage();
    }
  }
}
