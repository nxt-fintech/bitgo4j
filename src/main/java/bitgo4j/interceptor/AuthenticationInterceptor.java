package bitgo4j.interceptor;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

public class AuthenticationInterceptor implements Interceptor {
  private final String token;

  public AuthenticationInterceptor(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }

  @NotNull
  @Override
  public Response intercept(Chain chain) throws IOException {
    Request request =
        chain.request().newBuilder().header("Authorization", "Bearer" + " " + getToken()).build();
    return chain.proceed(request);
  }
}
