package com.romafu.springbootmall.service;

import com.romafu.springbootmall.constant.ProductCategory;
import com.romafu.springbootmall.dto.ProductRequest;
import com.romafu.springbootmall.model.Product;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
