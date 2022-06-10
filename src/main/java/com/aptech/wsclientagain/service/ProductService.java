package com.aptech.wsclientagain.service;

import com.aptech.wsclientagain.entity.Product;
import retrofit2.Call;
import retrofit2.http.*;

import javax.servlet.http.HttpServlet;
import java.util.List;

public interface ProductService  {
    @GET("/api/v1/products")
    public Call<List<Product>> getProducts();

    @GET("/api/v1/products/{id}")
    public Call<Product> getProductDetails(@Path("id") int id);

    @POST("/api/v1/products")
    public Call<Product> save(@Body Product product);

    @PUT("/api/v1/products/{id}")
    public Call<Boolean> update(@Body Product product,@Path("id") int id);

    @DELETE("/api/v1/products/{id}")
    public Call<Boolean> delete(@Path("id") int id);


}
