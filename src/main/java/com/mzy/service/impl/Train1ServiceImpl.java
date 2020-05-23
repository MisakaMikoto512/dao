package com.mzy.service.impl;

import com.mzy.entity.Train1;
import com.mzy.mapper.Train1Mapper;
import com.mzy.service.Train1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mzy.vo.ScheduleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Service
public class Train1ServiceImpl extends ServiceImpl<Train1Mapper, Train1> implements Train1Service {
    @Autowired
    private Train1Mapper train1Mapper;

    public List<ScheduleVO> getScheduleVObyId(String train_id) {
        List<ScheduleVO> scheduleVOS = new ArrayList<>();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ID", train_id);
        List<Train1> train1s = train1Mapper.selectByMap(hashMap);
        for (Train1 t : train1s
        ) {
            ScheduleVO scheduleVO = new ScheduleVO();
            scheduleVO.setStation_order(t.getStation_order());
            scheduleVO.setStation(t.getStation());
            scheduleVO.setTrain_id(t.getTrain_id());
            scheduleVO.setDepart_time(t.getDepart_Time());
            scheduleVO.setArriveTime(t.getArrive_time());
            scheduleVO.setDuration(t.getDuration());
            scheduleVO.setDay(t.getDay());
            scheduleVOS.add(scheduleVO);
        }
        return scheduleVOS;
    }


}
