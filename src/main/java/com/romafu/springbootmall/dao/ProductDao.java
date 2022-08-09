package com.romafu.springbootmall.dao;

import com.romafu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
