package bitgo4j.sendlabel;

import bitgo4j.sendlabel.response.SendLabelResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SendLabelService {
  @Headers({"Accept: application/json"})
  @GET("/api/v2/sendlabels")
  Call<List<SendLabelResponse>> list(
      @Query("coin") String coin,
      @Query("address") String address,
      @Query("enterpriseId") String enterpriseId);

  @Headers({"Accept: application/json"})
  @POST("/api/v2/sendlabels")
  Call<SendLabelResponse> create(
      @Query("coin") String coin,
      @Query("address") String address,
      @Query("enterpriseId") String enterpriseId,
      @Query("label") String label);

  @Headers({"Accept: application/json"})
  @GET("/api/v2/sendlabels/{id}")
  Call<SendLabelResponse> get(@Path("id") String id);

  @Headers({"Accept: application/json"})
  @PUT("/api/v2/sendlabels/{id}")
  Call<SendLabelResponse> update(@Path("id") String id, @Body String label);

  @Headers({"Accept: application/json"})
  @DELETE("/api/v2/sendlabels/{id}")
  Call<SendLabelResponse> delete(@Path("id") String id);
}
