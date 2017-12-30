package com.earthchen.weixinsell.dto;

import lombok.Data;

/**
 * 购物车
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;


    /**
     * 商品数量
     */
    private Integer productQuantity;


    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
