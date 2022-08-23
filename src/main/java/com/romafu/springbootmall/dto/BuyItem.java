package com.romafu.springbootmall.dto;

import javax.validation.constraints.NotNull;

public class BuyItem {

    @NotNull
    private Integer productId;
    @NotNull
    private Integer quantity;

    private Integer stock;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
