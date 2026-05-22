package com.example.EcommerceSpring.configuration;

import com.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }


}