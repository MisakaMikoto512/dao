package com.mzy.controller;


import com.mzy.entity.Order;
import com.mzy.mapper.OrderMapper;
import com.mzy.service.OrderService;
import com.mzy.service.impl.OrderServiceImpl;
import com.mzy.vo.OrderVO;
import com.mzy.vo.ReservationReturnVO;
import com.mzy.vo.ReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    OrderServiceImpl orderService;
    @GetMapping("/findAll")
    List<Order> findAll(){
        List<Order> orders=orderMapper.selectList(null);
        orders.forEach(System.out::println);
        List<OrderVO> orderVOS=orderService.findOrderVOByUser("admin");
        orderVOS.forEach(System.out::println);
        System.out.println("!");
        return orders;
    }
    @GetMapping("/byuser/{admin}")
    List<OrderVO> findByUserId(@PathVariable String userid){
        List<OrderVO> orderVOS=orderService.findOrderVOByUser(userid);
        return orderVOS;
    }
    @GetMapping("order/findByOrder_id/{order_id}")
    OrderVO findById(@PathVariable int order_id){
        Order order=orderMapper.selectById(order_id);
        OrderVO orderVO=orderService.orderToVO(order);
        return orderVO;
    }
    @PostMapping("/reserve/ReserveVO")
    public ReservationReturnVO create (@RequestBody ReserveVO orderForm, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            ReservationReturnVO result = orderService.createOrder(orderForm);
            return result;
        }
        return null;
    }



}

