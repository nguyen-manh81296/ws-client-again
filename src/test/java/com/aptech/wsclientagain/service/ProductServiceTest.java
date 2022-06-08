package com.aptech.wsclientagain.service;

import com.aptech.wsclientagain.entity.Product;
import com.aptech.wsclientagain.retrofit.RetrofitServiceGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
   public void testRetrofit() throws IOException{
        ProductService productService = RetrofitServiceGenerator.createService(ProductService.class);
        List<Product> products = productService.getProducts().execute().body();
        for (Product pro:
             products) {
            System.out.println(pro.toString());
        }
//        CustomerService customerService = RetrofitServiceGenerator.createService(CustomerService.class);
//
//        Product product = productService.getProductDetail(3).execute().body();
//        System.out.println(product.toString());
//
//        productService.save(new Product(8,"Product 08",20));
    }
}