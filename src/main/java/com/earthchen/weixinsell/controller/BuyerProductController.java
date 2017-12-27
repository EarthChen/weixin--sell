package com.earthchen.weixinsell.controller;


import com.earthchen.weixinsell.VO.ProductInfoVO;
import com.earthchen.weixinsell.VO.ProductVO;
import com.earthchen.weixinsell.VO.ResultVO;
import com.earthchen.weixinsell.domain.ProductCategory;
import com.earthchen.weixinsell.domain.ProductInfo;
import com.earthchen.weixinsell.service.ProductCategoryService;
import com.earthchen.weixinsell.service.ProductInfoService;
import com.earthchen.weixinsell.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO getAllUpProductInfoList() {

        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        List<Integer> categoryTypeList = new ArrayList<>();

        for (ProductInfo info : productInfoList) {
            categoryTypeList.add(info.getCategoryType());
        }

        List<ProductCategory> productCategoryList =
                productCategoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }



}
