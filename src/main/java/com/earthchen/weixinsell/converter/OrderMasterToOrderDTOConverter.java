package com.earthchen.weixinsell.converter;

import com.earthchen.weixinsell.domain.OrderMaster;
import com.earthchen.weixinsell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 将OrderMaster转换成OrderDTO
 */
public class OrderMasterToOrderDTOConverter {

    /**
     * 将单个OrderMaster转换成单个OrderDTO
     * @param orderMaster
     * @return
     */
    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    /**
     * 将OrderMaster列表转换成OrderDTO列表
     * @param orderMasterList
     * @return
     */
    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
