package com.example.EcommerceSpring.gateway.api;

import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

@Component
public interface FakeStoreCategoryApi {

  @GET("products/categories")
 Call<List<String>> getAllFakeCategories() throws IOException;

}

