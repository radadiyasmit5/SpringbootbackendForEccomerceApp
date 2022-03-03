package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.Payload.ProductDTO;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class Productcontroller {

    @Autowired
    ProductService productService;

    @GetMapping("/getproducts")
   public List<ProductDTO> getproducts(){

    return productService.getProducts();
    }

    @GetMapping("/getProductByCategory")
    public List<ProductDTO> getproductbyCategory(@RequestParam long id){

     return productService.getproductByCategory(id);

    }


}
