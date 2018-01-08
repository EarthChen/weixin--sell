package com.earthchen.weixinsell.service;

import com.earthchen.weixinsell.domain.SellerInfo;


/**
 * 卖家端
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     *
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
