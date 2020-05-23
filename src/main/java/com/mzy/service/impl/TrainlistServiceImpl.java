package com.mzy.service.impl;

import com.mzy.entity.Trainlist;
import com.mzy.mapper.TrainlistMapper;
import com.mzy.service.TrainlistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mzy.vo.CreateTrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Service
public class TrainlistServiceImpl extends ServiceImpl<TrainlistMapper, Trainlist> implements TrainlistService {
    @Autowired(required = false)
    TrainlistMapper trainlistMapper;
    public void addTrain(CreateTrain createTrain){
        Trainlist train=new Trainlist();
        train.setStart(createTrain.getDepart_station());
        train.setEnd(createTrain.getArrive_station());
        train.setTrain_id(createTrain.getTrain_id());
        train.setDistance(createTrain.getDistance());
        train.setDuration(createTrain.getDuration());
        train.setType("测试型号");
        trainlistMapper.insert(train);
    }
}
