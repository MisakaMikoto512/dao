package com.mzy.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderVO {
    int order_id;//订单编号
    String user_id;//发起订单的用户
    String create_time;//订单创建时间
    String update_time;
    String status;//订单状态，待支付，支付成功，退票中，退票成功
    List<TicketVO> tickets;//返回这个订单订的票的list,前端界面呈现票所属的乘车人以及出发站出发时间等主要信息


    public OrderVO(){
        this.order_id=1234;
        this.user_id="admin";
        this.create_time="2020/05/20";
        this.update_time="2020/05/21";
        this.status="已支付";
        tickets =new ArrayList<>();
        tickets.add(new TicketVO());
        TicketVO ticketVO1=new TicketVO();
        ticketVO1.passengerName="李四";
        tickets.add(ticketVO1);
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TicketVO> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketVO> tickets) {
        this.tickets = tickets;
    }
}

