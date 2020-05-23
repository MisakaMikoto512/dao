package com.mzy.service;

import com.mzy.entity.Ticket;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mzy.vo.TicketVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
public interface TicketService extends IService<Ticket> {
    List<TicketVO> dataToVO(List<Ticket> tickets);

}
