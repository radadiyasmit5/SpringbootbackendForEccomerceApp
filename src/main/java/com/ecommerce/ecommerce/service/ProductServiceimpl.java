package com.ecommerce.ecommerce.service;


import com.ecommerce.ecommerce.Payload.ProductDTO;
import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.repository.Productsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    Productsrepository productsrepository;


    @Override
    public List<ProductDTO> getProducts() {
     List<Product> products = productsrepository.findAll();
     List<ProductDTO> responseProduct = products.stream().map(product -> maptoDto(product)).collect(Collectors.toList());
return responseProduct;
    }

    @Override
    public List<ProductDTO> getproductByCategory(long id) {

        List<Product> products =   productsrepository.getByCategoryId(id);
        List<ProductDTO> responseProduct = products.stream().map(product -> maptoDto(product)).collect(Collectors.toList());
        return responseProduct;

    }

    public ProductDTO maptoDto(Product product){
        ProductDTO productDto = new ProductDTO();

        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setActive(product.isActive());
        productDto.setCategory(product.getCategory());
        productDto.setDescription(product.getDescription());
        productDto.setImage_Url(product.getImage_Url());
        productDto.setDatecreated(product.getDatecreated());
        productDto.setSku(product.getSku());
        productDto.setUnit_price(product.getUnit_price());
        productDto.setUnitsInStock(product.getUnitsInStock());
        productDto.setLastUpdated(product.getLastUpdated());
        return productDto;
}
}

