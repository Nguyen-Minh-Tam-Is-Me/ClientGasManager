package gas.manager.client.app.retrofit;

import java.util.List;

import gas.manager.client.app.request.CustomerRequest;
import gas.manager.client.app.response.CustomerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CustomerApi {
    @GET("/customer/getAll")
    Call<List<CustomerResponse>>getAllCustomer();
    @POST("/auth/customer")
    Call<CustomerResponse>addNewCustomer(@Body CustomerRequest request);
}
