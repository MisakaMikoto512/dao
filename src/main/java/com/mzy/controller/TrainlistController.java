package com.mzy.controller;


import com.mzy.service.impl.Train1ServiceImpl;
import com.mzy.service.impl.TrainlistServiceImpl;
import com.mzy.vo.CreateTrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
public class TrainlistController {
    @Autowired
    TrainlistServiceImpl trainlistService;
    @PostMapping("/manage/add_train")
    String addTrain(@RequestBody CreateTrain createTrain){
        trainlistService.addTrain(createTrain);
        return "添加成功";
    }
}

