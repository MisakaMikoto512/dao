package com.mzy.controller;


import com.mzy.mapper.StationMapper;
import com.mzy.service.StationService;
import com.mzy.service.impl.StationServiceImpl;
import com.mzy.vo.CreateStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Controller
@RequestMapping()
public class StationController {
    @Autowired
    StationServiceImpl stationService;
    @PostMapping("/manage/add_station")
    String addstation(@RequestBody CreateStation createStation){
        stationService.add(createStation);
        return "添加成功";
    }

}

