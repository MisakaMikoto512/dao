package com.mzy.controller;


import com.mzy.entity.Seat_type;
import com.mzy.mapper.Seat_typeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@RestController
@RequestMapping("/generator/seat_type")
public class Seat_typeController {
    @Autowired
    private Seat_typeMapper seat_typeMapper;
    @GetMapping
    List<Seat_type> findAll(){
        List<Seat_type> list=seat_typeMapper.selectList(null);
        list.forEach(System.out::println);
        return list;
    }
}

