package com.earthchen.weixinsell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * http响应的最外层对象
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -5897234194040793245L;

    /**
     * 状态吗
     */
    private Integer code;

    /**
     * 状态吗信息
     */
    private String msg;

    /**
     * 具体信息
     */
    private T data;
}
