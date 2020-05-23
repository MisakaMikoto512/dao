package com.mzy.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SeatMapperTest {
    @Autowired
    private SeatMapper mapper;
    @Test
    void test1(){
        mapper.findAvailableSeat(28135,"硬座");
    }
}