package com.earthchen.weixinsell.exception;

import com.earthchen.weixinsell.enums.ResultEnum;

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessge());
        this.code = resultEnum.getCode();
    }
}
