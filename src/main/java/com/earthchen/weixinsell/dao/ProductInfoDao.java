package com.earthchen.weixinsell.dao;

import com.earthchen.weixinsell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 产品信息dao
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {

    /**
     * 根据产品状态查询
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
