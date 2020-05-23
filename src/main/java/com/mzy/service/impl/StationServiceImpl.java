package com.mzy.service.impl;

import com.mzy.entity.Station;
import com.mzy.mapper.StationMapper;
import com.mzy.service.StationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mzy.vo.CreateStation;
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
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements StationService {
    @Autowired
    StationMapper stationMapper;
    public void add(CreateStation createStation){
        Station station=new Station();
        station.setCity(createStation.getCity());
        station.setProvince_name(createStation.getProvince());
        station.setStation_name(createStation.getName());
        stationMapper.insert(station);

    }
}
