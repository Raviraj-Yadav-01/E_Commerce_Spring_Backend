package com.example.EcommerceSpring.gateway.api;


import com.example.EcommerceSpring.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductApi {

    @GET("products/{id}")
    Call<ProductDTO> getFakeProduct(@Path("id") int id) throws IOException;

}
