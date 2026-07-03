package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException;

}
