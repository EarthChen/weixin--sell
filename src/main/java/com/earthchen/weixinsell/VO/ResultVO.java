package com.earthchen.weixinsell.VO;

import lombok.Data;

/**
 * http响应的最外层对象
 */
@Data
public class ResultVO<T> {

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
