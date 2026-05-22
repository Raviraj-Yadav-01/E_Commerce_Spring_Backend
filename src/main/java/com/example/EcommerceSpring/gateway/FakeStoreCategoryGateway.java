package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {


    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
       List<String> response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();

        if(response == null){
            throw new IOException("fail to fetch the category from fakeStore");
        }

         return response.stream()
                 .map( category -> CategoryDTO.builder()
                         .name(category)
                         .build())
                 .toList();
    }
}
