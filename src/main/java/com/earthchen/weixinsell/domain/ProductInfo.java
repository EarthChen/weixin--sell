package com.earthchen.weixinsell.domain;

import com.earthchen.weixinsell.enums.ProductStatusEnum;
import com.earthchen.weixinsell.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 产品名字
     */
    private String productName;

    /**
     * 产品价格
     */
    private BigDecimal productPrice;

    /**
     * 产品描述
     */
    private String productDescription;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 产品小图
     */
    private String productIcon;

    /**
     * 状态
     * 0正常
     * 1下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }


}
