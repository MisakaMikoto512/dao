package com.mzy.service;

import com.mzy.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mzy.vo.OrderVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
public interface OrderService extends IService<Order>{
        List<OrderVO> findOrderVOByUser(String user_id);
}
