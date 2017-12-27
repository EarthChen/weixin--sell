package com.earthchen.weixinsell.service;

import com.earthchen.weixinsell.domain.ProductCategory;

import java.util.List;

/**
 * 类目服务接口
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryid);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
