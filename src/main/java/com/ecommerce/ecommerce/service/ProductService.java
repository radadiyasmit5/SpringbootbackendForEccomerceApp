package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.Payload.ProductDTO;

import java.util.List;

public interface ProductService {

public List<ProductDTO> getProducts();

public List<ProductDTO> getproductByCategory(long id);
}
