package com.example.ecommercespring.gateway.api;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;


@Component
public interface FakeStoreCategoryApi {

    @GET("products")
    Call<List<FakeStoreCategoryResponseDTO>> getAllFakeCategories();
}
