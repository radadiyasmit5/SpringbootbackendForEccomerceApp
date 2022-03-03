//package com.ecommerce.ecommerce.config;
//
//import com.ecommerce.ecommerce.entity.Product;
//import com.ecommerce.ecommerce.repository.ProductsCategory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
//import org.springframework.http.HttpMethod;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Configuration
//public class Cofiguration_of_Rest_Data implements RepositoryRestConfigurer {
//
//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//
////        List<HttpMethod>  disableHttpmethods  = Arrays.asList(
////                HttpMethod.POST,
////                HttpMethod.PUT,
////                HttpMethod.PATCH,
////                HttpMethod.DELETE
////
////        );
//           HttpMethod[] disableHttpmethods = {  HttpMethod.POST,
//                HttpMethod.PUT,
//                HttpMethod.PATCH,
//                HttpMethod.DELETE};
//
//
////disabaling all write permition for Product entity(productrepository)
//        config.getExposureConfiguration()
//                .forDomainType(Product.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(disableHttpmethods))
//                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(disableHttpmethods) ));
//
//        //disabaling all write permition for ProductCategory entity(productCategoryrepository)
//        config.getExposureConfiguration()
//                .forDomainType(ProductsCategory.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(disableHttpmethods))
//                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(disableHttpmethods) ));
//
//    }
//}
