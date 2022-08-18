package com.romafu.springbootmall.service;

import com.romafu.springbootmall.dto.ProductQueryParams;
import com.romafu.springbootmall.dto.ProductRequest;
import com.romafu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParam);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
