package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{


    private final FakeStoreProductApi fakeStoreProductApi;

    FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi = fakeStoreProductApi;
    }


    @Override
    public ProductDTO getProductById(int id) throws IOException {
        ProductDTO response = this.fakeStoreProductApi.getFakeProduct(id).execute().body();

        if(response == null){
            throw new IOException("fail to fetch the category from fakeStore");
        }
        return response;

    }
}
