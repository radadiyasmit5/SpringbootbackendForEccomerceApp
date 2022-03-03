package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@CrossOrigin
public interface Productsrepository extends JpaRepository<Product,Long> {

    public List<Product> getByCategoryId(long id);
}
