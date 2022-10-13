package bitgo4j;

import bitgo4j.exception.BitGo4jException;
import bitgo4j.interceptor.AuthenticationInterceptor;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ServiceGenerator {
  private static final OkHttpClient sharedClient;

  private static final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

  private static final Converter.Factory converterFactory = JacksonConverterFactory.create();

  static {
    logging.setLevel(Level.BASIC);
    Dispatcher dispatcher = new Dispatcher();
    dispatcher.setMaxRequests(60);
    dispatcher.setMaxRequestsPerHost(10);
    sharedClient =
        new OkHttpClient.Builder()
            .addInterceptor(logging)
            .dispatcher(dispatcher)
            .readTimeout(180, TimeUnit.SECONDS)
            .build();
  }

  private static final Converter<ResponseBody, BitGo4jError> errorBodyConverter =
      (Converter<ResponseBody, BitGo4jError>)
          converterFactory.responseBodyConverter(BitGo4jError.class, new Annotation[0], null);

  public static <S> S createService(Class<S> serviceClass, BitGo4jConfig config) {
    Retrofit.Builder retrofitBuilder =
        new Retrofit.Builder().baseUrl(config.getUrl())
            .addConverterFactory(converterFactory);

    if (StringUtils.isEmpty(config.getToken())) {
      retrofitBuilder.client(sharedClient);
    } else {
      AuthenticationInterceptor interceptor = new AuthenticationInterceptor(config.getToken());
      OkHttpClient adaptedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();
      retrofitBuilder.client(adaptedClient);
    }

    Retrofit retrofit = retrofitBuilder.build();
    return retrofit.create(serviceClass);
  }

  public static <T> T executeSync(Call<T> call) {
    try {
      Response<T> response = call.execute();
      if (response.isSuccessful()) {
        return response.body();
      } else {
        BitGo4jError apiError = getErrorBody(response);
        throw new BitGo4jException(apiError);
      }
    } catch (IOException e) {
      throw new BitGo4jException(e);
    }
  }

  public static <T> T executeSyncV2(Call<T> call) {
    try {
      Response<T> response = call.execute();
      if (response.isSuccessful()) {
        return response.body();
      } else {
        BitGo4jError apiError = getErrorBody(response);
        throw new BitGo4jException(apiError);
      }
    } catch (IOException e) {
      throw new BitGo4jException(e);
    }
  }

  public static BitGo4jError getErrorBody(Response<?> response)
      throws IOException, BitGo4jException {
    return errorBodyConverter.convert(response.errorBody());
  }
}
