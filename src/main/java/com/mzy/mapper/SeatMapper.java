package com.mzy.mapper;

import com.mzy.entity.Seat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
public interface SeatMapper extends BaseMapper<Seat> {
    @Select("select seat.seat_id,seat.seat_number,seat.seat_type,seat.train_id\n" +
            "from seat\n" +
            "         join train t on seat.train_id = t.id\n" +
            "         join travel t2 on t.id = t2.train_id\n" +
            "where travel_id = #{travel_id}\n" +
            "  and seat_id not in (select seat_id\n" +
            "                      from ticket t2\n" +
            "                               join (\n" +
            "                          select t.travel_id, t.depart_station_order, t.arrive_station_order\n" +
            "                          from (select train_id, travel_id,depart_station_order,arrive_station_order from travel where travel_id = #{travel_id}) x\n" +
            "                                   join travel t on t.train_id = x.train_id) y\n" +
            "                                    on t2.travel_id = y.travel_id\n" +
            "                      where not ((y.depart_station_order >= y.arrive_station_order) or (y.arrive_station_order <= y.depart_station_order)))\n" +
            "  and seat_type = #{seat_type};")
    List<Seat> findAvailableSeat(int travel_id, String seat_type);

}
