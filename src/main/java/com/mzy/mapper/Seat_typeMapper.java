package com.mzy.mapper;

import com.mzy.entity.Seat_type;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
public interface Seat_typeMapper extends BaseMapper<Seat_type> {
    @Select("SELECT seat_number,seat_type FROM seat_type ")
    List<Seat_type> findAll();
}
