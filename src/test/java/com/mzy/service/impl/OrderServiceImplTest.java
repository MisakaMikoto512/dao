package com.mzy.service.impl;

import com.mzy.mapper.Travel_dynamicMapper;
import com.mzy.service.OrderService;
import com.mzy.vo.OrderVO;
import com.mzy.vo.ReserveVO;
import com.mzy.vo.TicketVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    OrderServiceImpl orderService;
    @Autowired
    Travel_dynamicMapper travel_dynamicMapper;
    @Test
    void getOrder(){
        List<OrderVO> orders=orderService.findOrderVOByUser("admin");
        orders.forEach(System.out::println);

    }

    @Test
    void findOrderVOByUser() {

    }

    @Test
    void createOrder() {
        ReserveVO reserveVO=new ReserveVO();
        orderService.createOrder(reserveVO);
    }

    @Test
    void reserveSingleTicket() {

    }
    @Test
    void updatetest(){
        orderService.updateRestTicket("硬座",28135);
    }
}