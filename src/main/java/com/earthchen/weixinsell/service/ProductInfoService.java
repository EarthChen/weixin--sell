package com.earthchen.weixinsell.service;

import com.earthchen.weixinsell.domain.ProductInfo;
import com.earthchen.weixinsell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品信息服务
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架的商品信息列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有商品信息列表
     *
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);


    /**
     * 保存商品信息
     *
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);


    /**
     * 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);


    /**
     * 上架
     *
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * 下架
     *
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);
}
