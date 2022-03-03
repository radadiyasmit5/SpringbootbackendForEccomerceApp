package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

//I injected the dependency of rest-data into pom.xml and this annotaion is to override its default details like path and name of rel
//by default it has path of /api/{repositoryname}
//@CrossOrigin
//@RepositoryRestResource(collectionResourceRel = "productCategory" , path = "product-category")
public interface ProductsCategory extends JpaRepository<ProductCategory,Long> {




}

