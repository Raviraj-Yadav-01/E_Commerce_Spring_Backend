package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{


    public final FakeStoreProductApi fakeStoreProductApi;

    /// Constructor Based Dependency Injection
    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {

        /*ProductDTO productResponse  = this.fakeStoreProductApi.getFakeProduct(id).execute().body();

        if(productResponse == null){
            throw new IOException("Product not found with ID: " + id);
        }

        return ProductDTO.builder()
                .categoryId(productResponse.getCategoryId())
                .title(productResponse.getTitle())
                .description(productResponse.getDescription())
                .image(productResponse.getImage())
                .price(productResponse.getPrice())
                .rating(productResponse.getRating())
                .build();*/
        return null;
    }
}
