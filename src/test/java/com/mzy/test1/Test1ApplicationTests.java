//package com.mzy.test1;
//
//import com.mzy.entity.SeatType;
//import com.mzy.mapper.SeatMapper;
//import com.mzy.mapper.SeatTypeMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//
//@SpringBootTest
//class Test1ApplicationTests {
//    @Autowired
//        private SeatMapper seatMapper;
//    @Autowired
//        private SeatTypeMapper seatTypeMapper;
//    @Test
//    void contextLoads() {
//        ArrayList<SeatType> list= (ArrayList<SeatType>) seatTypeMapper.selectList(null);
//        list.forEach(System.out::println);
//    }
//
//}
