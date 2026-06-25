package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.FakeStoreProductDTO;
import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway{


    public final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {

        FakeStoreProductDTO productResponse  = this.fakeStoreProductApi.getFakeProduct(id).execute().body();

        if(productResponse == null){
            throw new IOException("Product not found with ID: " + id);
        }

        return ProductDTO.builder()
                .category(productResponse.getCategory())
                .title(productResponse.getTitle())
                .description(productResponse.getDescription())
                .image(productResponse.getImage())
                .price(productResponse.getPrice())
                .rating(productResponse.getRating())
                .build();
    }
}
