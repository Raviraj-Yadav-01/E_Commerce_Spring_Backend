package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.example.ecommercespring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    /// shared Reference
    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    /// Constructor based dependency Injection
    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException {

        List<FakeStoreCategoryResponseDTO> categoryResponse = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();

        if (categoryResponse == null) {
            throw new IOException("Fail to fetch categories Api to fakeStore Api");
        }


        return categoryResponse.stream()
                .map(product ->
                        FakeStoreCategoryResponseDTO.builder()
                        .name(product.getCategory())
                        .title(product.getTitle())
                        .description(product.getDescription())
                        .image(product.getImage())
                        .price(product.getPrice())
                        .rating(product.getRating())
                        .build()
                ).toList();
    }
}
