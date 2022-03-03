package com.ecommerce.ecommerce.Payload;

import com.ecommerce.ecommerce.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    private Long id;
    private String categoryname;
    private Set<Product> products;
}
