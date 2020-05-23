package com.mzy.vo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "ticket")
public class TicketVO {
    Integer ticket_id;//票的编号
    String passengerName;//乘客姓名
    String id_card_number;//身份证
    private String train_id;//车次编号
    private String depart_station;//出发站
    private String arrive_station;//到达站
    String date;//日期
    String departTime;//出发时间
    String arriveTime;//到达时间
    String seatType;//座位类型
    String SeatNumber;//座位号，包含车厢
    Double ticket_price;//票价
    int isValid;

    public TicketVO(Integer ticket_id, String passengerName, String id_card_number, String train_id, String depart_station, String arrive_station, String date, String departTime, String arriveTime, String seatType, String seatNumber, double ticket_price,int isValid) {
        this.ticket_id = ticket_id;
        this.passengerName = passengerName;
        this.id_card_number = id_card_number;
        this.train_id = train_id;
        this.depart_station = depart_station;
        this.arrive_station = arrive_station;
        this.date = date;
        this.departTime = departTime;
        this.arriveTime = arriveTime;
        this.seatType = seatType;
        SeatNumber = seatNumber;
        this.ticket_price = ticket_price;
        this.isValid=isValid;
    }
    public TicketVO(){
        this.ticket_id = 1;
        passengerName = "张三";
        this.id_card_number = "513436200005219421";
        this.train_id = "Z22";
        this.depart_station = "北京";
        this.arrive_station = "上海";
        this.date = "2020/05/20";
        this.departTime = "08:39";
        this.arriveTime = "22:30";
        this.seatType = "硬座";
        SeatNumber = "7车19D";
        this.ticket_price = 333.5;
        this.isValid=1;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        this.id_card_number = id_card_number;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getDepart_station() {
        return depart_station;
    }

    public void setDepart_station(String depart_station) {
        this.depart_station = depart_station;
    }

    public String getArrive_station() {
        return arrive_station;
    }

    public void setArrive_station(String arrive_station) {
        this.arrive_station = arrive_station;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        SeatNumber = seatNumber;
    }

    public Double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(Double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }
}
