
package com.example.ecommercespring.gateway.api;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.example.ecommercespring.dto.FakeStoreProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;
import java.util.List;

public interface FakeStoreProductApi {


   @GET("products/{id}")
    Call<FakeStoreProductDTO> getFakeProduct(@Path("id") Long id) throws IOException;
}

