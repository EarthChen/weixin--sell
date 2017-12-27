package com.earthchen.weixinsell.enums;

import lombok.Getter;

/**
 * 构造商品状态枚举类
 */
@Getter
public enum ProductStatusEnums implements CodeEnum{

    UP(0,"上架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
