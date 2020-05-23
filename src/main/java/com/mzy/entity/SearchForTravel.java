package com.mzy.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SearchForTravel {
    int travel_id;//可以不显示，但后续订票要用，表示行程

    String train_id;//车次

    String depart_station;//出发站

    String arrive_station;//到达站

    String depart_time;//出发时间

    String arrive_time;//到达时间

    String duration;//历时

    int day;//1为当日到达，2为次日到达，以此类推

    List<SeatVO> seatVOS;

    String date;;//日期

    public SearchForTravel(int travel_id, String train_id, String depart_station, String arrive_station, String depart_time, String arrive_time, String duration, int day, List<SeatVO> seatVOS, String date) {
        this.travel_id = travel_id;
        this.train_id = train_id;
        this.depart_station = depart_station;
        this.arrive_station = arrive_station;
        this.depart_time = depart_time;
        this.arrive_time = arrive_time;
        this.duration = duration;
        this.day = day;
        this.seatVOS = seatVOS;
        this.date = date;
    }

    public SearchForTravel() {
        this.travel_id = 1;
        this.train_id = "1133";
        this.depart_station = "北京西";
        this.arrive_station = "沙岭子";
        this.depart_time = "15:30";
        this.arrive_time = "19:08";
        this.duration = "3时38分";
        this.day = 1;
        this.seatVOS = new ArrayList<> ();
        seatVOS.add(new SeatVO("软卧",20,40));
        seatVOS.add(new SeatVO("硬卧",20,30));
        seatVOS.add(new SeatVO("软座",20,20));
        seatVOS.add(new SeatVO("硬座",20,10));
        this.date = "2020/5/20";
    }
}
