package com.earthchen.weixinsell.service;

import com.earthchen.weixinsell.dto.OrderDTO;

/**
 * 买家服务
 */
public interface BuyerService {


    /**
     * 查询指定openid和订单id
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOneOrder(String openid, String orderId);

    /**
     * 取消指定订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
