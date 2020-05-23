package com.mzy.service.impl;

import com.mzy.entity.Train;
import com.mzy.mapper.TrainMapper;
import com.mzy.service.TrainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mzy.vo.CreateTrain;
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
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train> implements TrainService {

}
