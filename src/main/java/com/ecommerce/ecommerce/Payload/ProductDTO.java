package com.ecommerce.ecommerce.Payload;

import com.ecommerce.ecommerce.entity.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {


    private Long id;


    private String sku;
    private String name;
    private String description;
    private String unit_price;
    private String image_Url;
    private boolean active;
    private int unitsInStock;
    private Date datecreated;
    private Date lastUpdated;
    private ProductCategory category;
}
