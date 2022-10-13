package bitgo4j.ping;

import bitgo4j.ping.response.PingResponse;

public interface PingClient {
  PingResponse ping();
}
