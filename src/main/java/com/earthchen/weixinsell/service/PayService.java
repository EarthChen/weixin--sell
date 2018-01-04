package com.earthchen.weixinsell.service;

import com.earthchen.weixinsell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

public interface PayService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    PayResponse create(OrderDTO orderDTO);

    /**
     * 接受微信支付异步通知
     * @param notifyData
     */
    PayResponse notify(String notifyData);


    /**
     * 退款
     * @param orderDTO
     */
    RefundResponse refund(OrderDTO orderDTO);
}
