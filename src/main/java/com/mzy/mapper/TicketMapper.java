package com.mzy.mapper;

import com.mzy.entity.Seat;
import com.mzy.entity.Ticket;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface TicketMapper extends BaseMapper<Ticket> {

}
