package com.mzy.controller;


import com.mzy.mapper.Train1Mapper;
import com.mzy.service.impl.Train1ServiceImpl;
import com.mzy.vo.ScheduleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/generator/train1")
public class Train1Controller {
    @Autowired
    private Train1ServiceImpl train1Service;
  @GetMapping("/findByTrain_id/{train_id}")
    List<ScheduleVO> findById(@PathVariable String train_id){
        return train1Service.getScheduleVObyId(train_id);
  }
}

