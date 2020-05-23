package com.mzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mzy.entity.SearchForTravel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SearchMapper extends BaseMapper<SearchForTravel> {
    @Select("select ts.travel_id,\n" +
            "       ts.train_id,\n" +
            "       ts.depart_station_order,\n" +
            "       ts.depart_station,\n" +
            "       ts.arrive_station_order,\n" +
            "       ts.arrive_station,\n" +
            "       ts.depart_time,\n" +
            "       ts.arrive_time,\n" +
            "       ts.duration,\n" +
            "       ts.day,\n" +
            "       td.soft_bed_rest_ticket,\n" +
            "       ts.soft_bed_price,\n" +
            "       td.hard_bed_rest_ticket,\n" +
            "       ts.soft_bed_price,\n" +
            "       td.soft_seat_rest_ticket,\n" +
            "       ts.soft_seat_price,\n" +
            "       td.hard_seat_rest_ticket,\n" +
            "       ts.hard_seat_price,\n" +
            "       td.date\n" +
            "from travel ts\n" +
            "         join travel_dynamic td on ts.travel_id = td.travel_id\n" +
            "where depart_station  like concat('%',#{depart},'%')\n" +
            "  and arrive_station  like concat('%',#{arrive},'%');")
    List<SearchForTravel> stationSearch(String depart, String arrive);
}

