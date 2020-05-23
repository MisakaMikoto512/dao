package com.mzy.mapper;

import com.mzy.entity.Travel_dynamic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
public interface Travel_dynamicMapper extends BaseMapper<Travel_dynamic> {
    @Update("update travel_dynamic\n" +
            "set ${seat_type}=(${seat_type} -1)\n" +
            "where travel_id in\n" +
            "      (\n" +
            "       select ts.travel_id\n" +
            "       from travel ts join (select train_id, depart_station_order, arrive_station_order from travel where travel_id = ${travel_id})x\n" +
            "       where ts.train_id in (x.train_id)\n" +
            "         and not ((ts.depart_station_order >= x.arrive_station_order) or\n" +
            "                  (ts.arrive_station_order <= x.depart_station_order)));")
    void updateticket(String seat_type,int travel_id);

    @Update("update travel_dynamic\n" +
            "set ${seat_type}=(${seat_type} +1)\n" +
            "where travel_id in\n" +
            "      (\n" +
            "       select ts.travel_id\n" +
            "       from travel ts join (select train_id, depart_station_order, arrive_station_order from travel where travel_id = ${travel_id})x\n" +
            "       where ts.train_id in (x.train_id)\n" +
            "         and not ((ts.depart_station_order >= x.arrive_station_order) or\n" +
            "                  (ts.arrive_station_order <= x.depart_station_order)));")
    void resetticket(String seat_type,int travel_id);

}
