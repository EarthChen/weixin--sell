package com.earthchen.weixinsell.service.impl;

import com.earthchen.weixinsell.dao.SellerInfoDao;
import com.earthchen.weixinsell.domain.SellerInfo;
import com.earthchen.weixinsell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoDao sellerInfoDao;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoDao.findByOpenid(openid);
    }
}
