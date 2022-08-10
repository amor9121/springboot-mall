package com.romafu.springbootmall.service.impl;

import com.romafu.springbootmall.dao.ProductDao;
import com.romafu.springbootmall.dto.ProductRequest;
import com.romafu.springbootmall.model.Product;
import com.romafu.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    public Integer createProduct(ProductRequest productRequest){
        return productDao.createProduct(productRequest);
    }
}
