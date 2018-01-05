package com.earthchen.weixinsell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 */
@Data
public class ProductVO {

    /**
     * 类目名
     */
    @JsonProperty("name") //设置序列化之后的名字
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
