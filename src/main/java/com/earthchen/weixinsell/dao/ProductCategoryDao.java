package com.earthchen.weixinsell.dao;

import com.earthchen.weixinsell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 产品类目dao
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据产品类目的列表查询
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
